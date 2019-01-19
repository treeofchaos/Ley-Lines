package tree_of_chaos.leylines.creatureenchant.effect

import tree_of_chaos.leylines.creatureenchant.CreatureEnchant
import tree_of_chaos.leylines.creatureenchant.EffectEnchantBase
import tree_of_chaos.leylines.util.Reference.MOD_ID

import net.minecraft.init.MobEffects
import net.minecraft.util.ResourceLocation
import net.minecraft.potion.PotionEffect
import net.minecraftforge.event.entity.living.LivingEvent
import net.minecraftforge.event.entity.living.LivingFallEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.fml.common.registry.GameRegistry
import kotlin.math.absoluteValue

class Speed : CreatureEnchant(ResourceLocation(MOD_ID, "speed"), "speed") {

    companion object {
        @GameRegistry.ObjectHolder("$MOD_ID:protection")
        lateinit var protection: CreatureEnchant

        @GameRegistry.ObjectHolder("$MOD_ID:strength")
        lateinit var strength: CreatureEnchant
    }


    override val research: String
        get() = "CREATURE_ENCHANT_ADVANCED"

    //increases the current movement speed when moving forward.
    //incompatible with protection, gives hunger.
    @SubscribeEvent
    fun tick(event: LivingEvent.LivingUpdateEvent) {
        val entity = event.entityLiving
        val enchantLevel = getEnchantLevel(entity, protection)

        val thisLevel = getEnchantLevel(entity, this)*1.6f

        if (thisLevel > 0) {
            if (entity.moveForward.absoluteValue > 0)
                entity.moveForward *= thisLevel
        } else {
            if (entity.moveForward.absoluteValue > 0)
                entity.moveForward /= thisLevel
        }

        if (enchantLevel != 0 && thisLevel != 0f) {
            val effect = MobEffects.HUNGER
            if (entity.getActivePotionEffect(effect) == null || entity.getActivePotionEffect(effect)!!.duration < 30) {
                entity.addPotionEffect(PotionEffect(effect, 240, enchantLevel - 1, true, false))
            }
        }
    }

    //incompatible with strength, increased fall damage
    @SubscribeEvent
    fun fall(event: LivingFallEvent) {
        val entityLiving = event.entityLiving
        val thisLevel = getEnchantLevel(entityLiving, this)
        val strengthLevel = getEnchantLevel(entityLiving, strength)

        if (thisLevel > 0 && strengthLevel > 0)
            event.damageMultiplier *= thisLevel
    }
}
