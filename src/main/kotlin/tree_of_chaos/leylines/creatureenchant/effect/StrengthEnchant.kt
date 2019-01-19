package tree_of_chaos.leylines.creatureenchant.effect

import tree_of_chaos.leylines.creatureenchant.CreatureEnchant
import tree_of_chaos.leylines.creatureenchant.EffectEnchantBase
import tree_of_chaos.leylines.util.Reference.MOD_ID
import net.minecraft.entity.EntityLivingBase
import net.minecraft.util.ResourceLocation
import net.minecraftforge.event.entity.living.LivingHurtEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent


class StrengthEnchant : CreatureEnchant(ResourceLocation(MOD_ID, "strength"), "strength") {

    override val research: String
        get() = "CREATURE_ENCHANT_ADVANCED"

    @SubscribeEvent
    fun hurt(event: LivingHurtEvent) {
        val trueSource = event.source.trueSource
        if (trueSource is EntityLivingBase) {
            val level = this.getEnchantLevel(trueSource, this)
            if (level != 0) {
                event.amount += level
            }
        }
    }

}
