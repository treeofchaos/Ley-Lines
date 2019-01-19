package tree_of_chaos.leylines.creatureenchant.base

import net.minecraft.entity.EntityLivingBase
import tree_of_chaos.leylines.creatureenchant.CreatureEnchant
import tree_of_chaos.leylines.creatureenchant.EnchantingBaseCircle
import tree_of_chaos.leylines.util.Reference.MOD_ID

class NegationCircle : EnchantingBaseCircle("negation") {


    override val color= Color(255, 0, 0, 255)


    override val research = "ENCHANT_MODIFICATION"

    init {
        setRegistryName(MOD_ID, "negation")
    }

    override fun doEffect(multiplier: Int, entityLiving: EntityLivingBase, enchant: CreatureEnchant): Int {
        return multiplier * -1
    }
}