package tree_of_chaos.leylines.creatureenchant.effect

import tree_of_chaos.leylines.creatureenchant.CreatureEnchant
import tree_of_chaos.leylines.creatureenchant.EffectEnchantBase
import tree_of_chaos.leylines.util.Reference.MOD_ID
import net.minecraft.util.ResourceLocation
import net.minecraftforge.event.entity.living.LivingEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent


class RespirationEnchant : CreatureEnchant(ResourceLocation(MOD_ID, "respiration"), "respiration") {
    override val research: String
        get() = "CREATURE_ENCHANT"


    @SubscribeEvent
    fun handleEvent(event: LivingEvent.LivingUpdateEvent) {
        val entity = event.entityLiving
        if (entity.isInWater) {
            val enchantLevel = getEnchantLevel(entity, this)
            if (enchantLevel > 0) {
                entity.air = 300
            }
        }
    }

}
