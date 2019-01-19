package tree_of_chaos.leylines.creatureenchant.base

import net.minecraft.entity.EntityLivingBase
import tree_of_chaos.leylines.creatureenchant.CreatureEnchant
import tree_of_chaos.leylines.creatureenchant.EffectEnchantBase

import tree_of_chaos.leylines.creatureenchant.EnchantingBaseCircle
import tree_of_chaos.leylines.util.Reference.MOD_ID

class EffectAmplifierCircle : EnchantingBaseCircle("effect_amplifier") {

    override val color = Color(0, 173, 75, 255)
    override val research ="ENCHANT_EFFECT_AMPLIFICATION"


    init {
        setRegistryName(MOD_ID, "effect_amplifier")
    }

    override fun doEffect(multiplier: Int, entityLiving: EntityLivingBase, enchant: CreatureEnchant): Int {
        return if (enchant is EffectEnchantBase)
            multiplier +1
        else
            multiplier

    }
}
