package tree_of_chaos.leylines.creatureenchant.effect

import tree_of_chaos.leylines.creatureenchant.EffectEnchantBase
import tree_of_chaos.leylines.util.Reference.MOD_ID
import net.minecraft.init.MobEffects
import net.minecraft.util.ResourceLocation


class Vitality : EffectEnchantBase(MobEffects.REGENERATION, MobEffects.WITHER, -2.0, ResourceLocation(MOD_ID, "vitality"), "vitality") {


    override val research: String
        get() = "CREATURE_ENCHANT_ADVANCED"


}
