package tree_of_chaos.leylines.creatureenchant.effect

import tree_of_chaos.leylines.creatureenchant.CreatureEnchant
import tree_of_chaos.leylines.creatureenchant.EffectEnchantBase
import tree_of_chaos.leylines.util.Reference.MOD_ID
import net.minecraft.init.MobEffects
import net.minecraft.util.ResourceLocation


class HasteEnchant : EffectEnchantBase(
        MobEffects.HASTE,
        MobEffects.MINING_FATIGUE,
        1.0,
        ResourceLocation(MOD_ID, "haste")
) {
    override val research: String
        get() = "CREATURE_ENCHANT_ADVANCED2"


}