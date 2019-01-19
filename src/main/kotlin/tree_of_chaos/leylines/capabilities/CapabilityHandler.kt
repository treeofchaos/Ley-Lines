package tree_of_chaos.leylines.capabilities

import net.minecraftforge.common.capabilities.CapabilityManager
import tree_of_chaos.leylines.capabilities.creatureenchant.CreatureEnchantCapability
import tree_of_chaos.leylines.capabilities.creatureenchant.CreatureEnchantStorage
import tree_of_chaos.leylines.capabilities.creatureenchant.ICreatureEnchant

object CapabilityHandler {

    fun registerCaps(){
        CapabilityManager.INSTANCE.register<ICreatureEnchant>(ICreatureEnchant::class.java, CreatureEnchantStorage()) { CreatureEnchantCapability() }
    }
}