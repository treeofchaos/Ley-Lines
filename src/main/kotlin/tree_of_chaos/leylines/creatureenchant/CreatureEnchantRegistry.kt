package tree_of_chaos.leylines.creatureenchant

import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import tree_of_chaos.leylines.creatureenchant.base.EffectAmplifierCircle
import tree_of_chaos.leylines.creatureenchant.base.NegationCircle
import tree_of_chaos.leylines.creatureenchant.base.NormalCircle
import tree_of_chaos.leylines.creatureenchant.effect.*

class CreatureEnchantRegistry {

    companion object {

        var STRENGTH_ENCHANT: CreatureEnchant = StrengthEnchant()
        var FERTILE_ENCHANT: CreatureEnchant = FertileEnchant()
        var PROTECTION_ENCHANT: CreatureEnchant = ProtectionEnchant()
        var RESPIRATION_ENCHANT: CreatureEnchant = RespirationEnchant()
        var SPIDERFINGERS_ENCHANT: CreatureEnchant = SpiderFingers()
        var SPEED_ENCHANT: CreatureEnchant = Speed()
        var VITALITY_ENCHANT: CreatureEnchant = Vitality()

    }

    @SubscribeEvent
    fun registryEventCreatureEnchant(event: RegistryEvent.Register<CreatureEnchant>) {
        event.registry.registerAll(
                STRENGTH_ENCHANT, SPEED_ENCHANT, SPIDERFINGERS_ENCHANT,
                PROTECTION_ENCHANT, FERTILE_ENCHANT, RESPIRATION_ENCHANT, VITALITY_ENCHANT,
                HealtBoostEnchant(),
                AgilityEnchant(),
                HasteEnchant()
        )
    }

    @SubscribeEvent
    fun registryEventEnchantingBaseCircle(event: RegistryEvent.Register<EnchantingBaseCircle>) {
        event.registry.registerAll(
                NormalCircle(),
                NegationCircle(),
                EffectAmplifierCircle()
        )
    }

}

