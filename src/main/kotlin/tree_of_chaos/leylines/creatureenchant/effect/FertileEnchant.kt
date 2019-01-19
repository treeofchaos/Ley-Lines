package tree_of_chaos.leylines.creatureenchant.effect

import tree_of_chaos.leylines.creatureenchant.CreatureEnchant
import tree_of_chaos.leylines.creatureenchant.EffectEnchantBase
import tree_of_chaos.leylines.util.Reference.MOD_ID
import net.minecraft.entity.passive.EntityAnimal
import net.minecraft.util.ResourceLocation
import net.minecraftforge.event.entity.living.BabyEntitySpawnEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent



class FertileEnchant : CreatureEnchant(ResourceLocation(MOD_ID, "fertile"), "fertile") {
    override val research: String
        get() = "CREATURE_ENCHANT"

    @SubscribeEvent
    fun handleEvent(event: BabyEntitySpawnEvent) {
        if(event.parentA is EntityAnimal && event.parentB is EntityAnimal) {
            val parentA = event.parentA as EntityAnimal
            val parentB = event.parentB as EntityAnimal

            val parentAlevel = getEnchantLevel(parentA, this)
            if (parentAlevel > 0) {
                createChild(parentA, parentB)
            } else {

                if (parentA.entityWorld.rand.nextBoolean() && parentAlevel < 0) {
                    event.isCanceled = true
                }
            }
            val parentBlevel = getEnchantLevel(parentB, this)
            if (parentBlevel > 0) {
                createChild(parentB, parentA)
            } else {
                if (parentB.entityWorld.rand.nextBoolean() && parentBlevel < 0) {
                    event.isCanceled = true
                }
            }
        }
    }

    internal fun createChild(parentA: EntityAnimal, parentB: EntityAnimal) {
        val child = parentA.createChild(parentB)
        child!!.setPosition(parentA.posX, parentA.posY, parentA.posZ)
        child.growingAge = -24000
        parentA.world.spawnEntity(child)
    }
}
