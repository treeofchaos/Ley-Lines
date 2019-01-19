package tree_of_chaos.leylines.capabilities.creatureenchant

import tree_of_chaos.leylines.creatureenchant.CreatureEnchant
import tree_of_chaos.leylines.creatureenchant.EnchantingBaseCircle


interface ICreatureEnchant {

    var store: MutableMap<CreatureEnchant, CreatureEnchantCapability.CreatureEnchantContainer>

    var circle: EnchantingBaseCircle

    fun hasEnchant(): Boolean

    fun hasEnchant(enchant: CreatureEnchant): Boolean

    fun getLevel(enchant: CreatureEnchant): Int

    fun setEnabledStatus(enchant: CreatureEnchant, status: Boolean)

    fun setEnabledStatus(status: Boolean)

    fun putEnchant(creatureEnchantContainer: CreatureEnchantCapability.CreatureEnchantContainer)

    fun removeEnchant(enchant: CreatureEnchant)
}
