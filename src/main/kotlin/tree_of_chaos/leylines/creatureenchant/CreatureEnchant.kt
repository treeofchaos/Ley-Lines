package tree_of_chaos.leylines.creatureenchant

import net.minecraft.entity.Entity
import net.minecraft.entity.EntityLivingBase
import net.minecraft.util.ResourceLocation
import net.minecraftforge.fml.common.registry.GameRegistry
import net.minecraftforge.registries.IForgeRegistryEntry

import tree_of_chaos.leylines.capabilities.creatureenchant.CreatureEnchantCapability
import tree_of_chaos.leylines.capabilities.creatureenchant.CreatureEnchantProvider
import tree_of_chaos.leylines.capabilities.creatureenchant.ICreatureEnchant
import tree_of_chaos.leylines.util.Reference.MOD_ID

abstract class CreatureEnchant(resourceLocation: ResourceLocation, private val unlocalizedName: String) : IForgeRegistryEntry.Impl<CreatureEnchant>() {

    val icon: ResourceLocation

    abstract val research: String

    init {
        registryName = resourceLocation
        icon = ResourceLocation(resourceLocation.resourceDomain, "textures/cenchant/" + resourceLocation.resourcePath + ".png")
    }

    fun getUnlocalizedName(): String {
        return "enchant.creature_enchant.$unlocalizedName"
    }

    open fun getEnchantLevel(entity: EntityLivingBase, enchantment: CreatureEnchant): Int {
        if (entity.hasCapability(CreatureEnchantProvider.CREATURE_ENCHANT_CAPABILITY, null)) {
            val capability = entity.getCapability(CreatureEnchantProvider.CREATURE_ENCHANT_CAPABILITY, null)!!
            val level = capability.getLevel(enchantment)
            if (capability.hasEnchant(enchantment))
                return capability.circle.doEffect(level, entity, enchantment)
        }
        return 0
    }


    override fun toString(): String {
        return "CreatureEnchant{" +
                ", registryName=" + registryName +
                ", research='" + research + '\''.toString() +
                '}'.toString()
    }

    companion object {

        @GameRegistry.ObjectHolder("$MOD_ID:normal")
        private val baseCircle: EnchantingBaseCircle? = null

        fun setEnchantment(entity: Entity, enchants: ICreatureEnchant) {
            if (entity.hasCapability(CreatureEnchantProvider.CREATURE_ENCHANT_CAPABILITY, null)) {
                val capability = entity.getCapability(CreatureEnchantProvider.CREATURE_ENCHANT_CAPABILITY, null)

                capability!!.store = enchants.store
                capability.circle = enchants.circle
            }
        }

        fun isEnchanted(entity: Entity): Boolean {
            if (entity.hasCapability(CreatureEnchantProvider.CREATURE_ENCHANT_CAPABILITY, null)) {
                val capability = entity.getCapability(CreatureEnchantProvider.CREATURE_ENCHANT_CAPABILITY, null)
                return capability!!.hasEnchant()
            }
            return false
        }

        fun getCreatureEnchants(entity: Entity): Map<CreatureEnchant, CreatureEnchantCapability.CreatureEnchantContainer> {
            if (entity.hasCapability(CreatureEnchantProvider.CREATURE_ENCHANT_CAPABILITY, null)) {
                val capability = entity.getCapability(CreatureEnchantProvider.CREATURE_ENCHANT_CAPABILITY, null)
                return capability!!.store
            }

            return emptyMap()
        }

        fun getBaseCircle(entity: Entity): EnchantingBaseCircle? {
            if (entity.hasCapability(CreatureEnchantProvider.CREATURE_ENCHANT_CAPABILITY, null)) {
                val capability = entity.getCapability(CreatureEnchantProvider.CREATURE_ENCHANT_CAPABILITY, null)
                return capability!!.circle
            }

            return baseCircle
        }

    }
}

