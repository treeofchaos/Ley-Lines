package tree_of_chaos.leylines.sided.network.creatureenchants


import tree_of_chaos.leylines.sided.network.creatureenchants.CreatureEnchantSyncMessageHandler.Companion.enchantmentCache
import net.minecraft.entity.player.EntityPlayerMP
import net.minecraftforge.event.entity.EntityJoinWorldEvent
import net.minecraftforge.event.entity.player.PlayerEvent.StartTracking
import net.minecraftforge.fml.common.eventhandler.EventPriority
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.fml.common.gameevent.PlayerEvent
import net.minecraftforge.fml.relauncher.Side
import net.minecraftforge.fml.relauncher.SideOnly
import tree_of_chaos.leylines.capabilities.creatureenchant.CreatureEnchantProvider
import tree_of_chaos.leylines.capabilities.creatureenchant.ICreatureEnchant
import tree_of_chaos.leylines.creatureenchant.CreatureEnchant
import tree_of_chaos.leylines.sided.network.NetworkProvider.NETWORK_WRAPPER

class CreatureEnchantSynchroniser {

    //high priority, and recieving cancelled to make sure that it is sent.
    @SubscribeEvent(receiveCanceled = true, priority = EventPriority.HIGH)
    //@SideOnly(Side.SERVER)
    fun EntityTrack(event: StartTracking) {
        val target = event.target

        if (target.hasCapability(CreatureEnchantProvider.CREATURE_ENCHANT_CAPABILITY, null)) {
            val entityPlayer = event.entityPlayer

            val entityId = target.entityId
            NETWORK_WRAPPER.sendTo(CreatureEnchantSyncMessage(
                    target.getCapability<ICreatureEnchant>(CreatureEnchantProvider.CREATURE_ENCHANT_CAPABILITY, null)!!,
                    entityId
            ), entityPlayer as EntityPlayerMP
            )
        }
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    fun entityJoin(event: EntityJoinWorldEvent) {
        val entity = event.entity
        if (enchantmentCache.containsKey(entity.entityId)) {
            CreatureEnchant.setEnchantment(entity, enchantmentCache[entity.entityId]!!)
            enchantmentCache.remove(entity.entityId)
        }
    }

    @SubscribeEvent
    fun syncPlayer(event: PlayerEvent.PlayerLoggedInEvent) {

        val entity = event.player
        val entityId = entity.entityId

        NETWORK_WRAPPER.sendTo(CreatureEnchantSyncMessage(
                entity.getCapability<ICreatureEnchant>(CreatureEnchantProvider.CREATURE_ENCHANT_CAPABILITY, null)!!,
                entityId
        ), entity as EntityPlayerMP
        )
    }

}
