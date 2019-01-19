package tree_of_chaos.leylines.creatureenchant.effect

import tree_of_chaos.leylines.creatureenchant.CreatureEnchant
import tree_of_chaos.leylines.creatureenchant.EffectEnchantBase
import tree_of_chaos.leylines.util.Reference.MOD_ID
import net.minecraft.init.MobEffects
import net.minecraft.util.ResourceLocation
import net.minecraftforge.event.entity.living.LivingFallEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.fml.common.registry.GameRegistry



class AgilityEnchant : EffectEnchantBase(MobEffects.JUMP_BOOST,MobEffects.JUMP_BOOST,-2.0, ResourceLocation(MOD_ID,"agility"),"agility") {

    companion object {
        @GameRegistry.ObjectHolder("$MOD_ID:protection")
        lateinit var protection: CreatureEnchant
    }

    override val research: String
        get() ="CREATURE_ENCHANT_ADVANCED2"

    //reduces fall damage, if protection is not on.
    @SubscribeEvent
    fun fall(event: LivingFallEvent){
        val entityLiving = event.entityLiving
        val thisLevel = getEnchantLevel(entityLiving, this)
        val protLevel = getEnchantLevel(entityLiving, protection)

        if(thisLevel >0 && protLevel ==0)
            event.damageMultiplier =0f
    }

}