package tree_of_chaos.leylines.sided.network

import tree_of_chaos.leylines.sided.network.creatureenchants.CreatureEnchantSyncMessage
import tree_of_chaos.leylines.sided.network.creatureenchants.CreatureEnchantSyncMessageHandler
import net.minecraftforge.fml.common.network.NetworkRegistry
import net.minecraftforge.fml.common.network.simpleimpl.IMessage
import net.minecraftforge.fml.relauncher.Side
import tree_of_chaos.leylines.sided.network.falldamage.FalldamageSyncMessage
import tree_of_chaos.leylines.sided.network.falldamage.FalldamageSyncMessageHandler
import tree_of_chaos.leylines.util.Reference.MOD_ID

object NetworkProvider {
    val NETWORK_WRAPPER = NetworkRegistry.INSTANCE.newSimpleChannel(MOD_ID)

    fun registerNetwork(){
        NETWORK_WRAPPER.registerMessage<CreatureEnchantSyncMessage, IMessage>(CreatureEnchantSyncMessageHandler::class.java, CreatureEnchantSyncMessage::class.java, 0, Side.CLIENT)
        NETWORK_WRAPPER.registerMessage<FalldamageSyncMessage, IMessage>(FalldamageSyncMessageHandler::class.java, FalldamageSyncMessage::class.java, 1, Side.SERVER)
    }
}