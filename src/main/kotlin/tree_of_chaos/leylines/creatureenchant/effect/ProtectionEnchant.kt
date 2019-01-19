package tree_of_chaos.leylines.creatureenchant.effect

import tree_of_chaos.leylines.creatureenchant.CreatureEnchant
import tree_of_chaos.leylines.creatureenchant.EffectEnchantBase
import tree_of_chaos.leylines.util.Reference.MOD_ID
import net.minecraft.util.ResourceLocation
import net.minecraftforge.event.entity.living.LivingHurtEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent


class ProtectionEnchant : CreatureEnchant(ResourceLocation(MOD_ID, "protection"), "protection") {

    override val research: String
        get() = "CREATURE_ENCHANT"

    @SubscribeEvent
    fun entityHurt(event: LivingHurtEvent) {
        val entity = event.entityLiving

        val enchantLevel = this.getEnchantLevel(entity, this)
        if (enchantLevel != 0) {
            if (enchantLevel > 0)
                event.amount = event.amount / (enchantLevel/2)
            if (enchantLevel < 0)
                event.amount = event.amount * (enchantLevel/2)
        }
    }

}
