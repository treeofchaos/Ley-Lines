package tree_of_chaos.leylines;
import static net.minecraftforge.common.BiomeDictionary.Type.DRY;
import static net.minecraftforge.common.BiomeDictionary.Type.FOREST;
import static net.minecraftforge.common.BiomeDictionary.Type.HILLS;
import static net.minecraftforge.common.BiomeDictionary.Type.HOT;
import static net.minecraftforge.common.BiomeDictionary.Type.SANDY;
import static net.minecraftforge.common.BiomeDictionary.Type.WET;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import tree_of_chaos.leylines.util.Reference;
import tree_of_chaos.leylines.world.biomes.EntForest;
import tree_of_chaos.leylines.world.biomes.LeyLinesBiomes;
import tree_of_chaos.leylines.world.biomes.TaqaDesert;

@Mod.EventBusSubscriber
public class ModBiomes 
{
	public static LeyLinesBiomes taqa_desert = new TaqaDesert();
	public static LeyLinesBiomes ent_forest = new EntForest();
	
	@SubscribeEvent
	public static void registerBiomes(RegistryEvent.Register<Biome> event)
	{
    	register(event, taqa_desert, BiomeManager.BiomeType.DESERT, "taqa_desert", 10, HOT, DRY, SANDY);
    	register(event, ent_forest, BiomeManager.BiomeType.WARM, "ent_forest", 10, FOREST, HILLS, WET);
	}

	public static void register(RegistryEvent.Register<Biome> event, Biome biome, BiomeManager.BiomeType type, String name, int weight, BiomeDictionary.Type... biomeDictTypes)
    {
		biome.setRegistryName(new ResourceLocation(Reference.MOD_ID, name));
		event.getRegistry().register(biome);
		for (BiomeDictionary.Type biomeDictType : biomeDictTypes) {
            BiomeDictionary.addTypes(biome, biomeDictType);
        }
		BiomeManager.addBiome(type, new BiomeManager.BiomeEntry(biome, weight));
	}
    
    public static void cleanSpawnLists()
    {
    	taqa_desert.cleanSpawnLists();
    	ent_forest.cleanSpawnLists();
    }
}
