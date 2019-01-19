package tree_of_chaos.leylines;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryBuilder;
import tree_of_chaos.leylines.creatureenchant.CreatureEnchant;
import tree_of_chaos.leylines.creatureenchant.EnchantingBaseCircle;

import static tree_of_chaos.leylines.util.Reference.MOD_ID;

/**
 * Creates the registries for creature enchants.
 * */
@Mod.EventBusSubscriber(modid=MOD_ID)
public class RegistryHolder {

    @SubscribeEvent
    static void register(RegistryEvent.NewRegistry event) {
        new RegistryBuilder<CreatureEnchant>()
                .setType(CreatureEnchant.class)
                .setIDRange(0, 100)
                .setName(new ResourceLocation(MOD_ID, "creature_enchant"))
                .add((IForgeRegistry.AddCallback<CreatureEnchant>) (owner, stage, id, obj, oldObj) -> MinecraftForge.EVENT_BUS.register(obj))
                .create();

        new RegistryBuilder<EnchantingBaseCircle>()
                .setType(EnchantingBaseCircle.class)
                .setIDRange(0, 100)
                .setName(new ResourceLocation(MOD_ID, "enchanting_base_circle"))
                .create();
    }
}
