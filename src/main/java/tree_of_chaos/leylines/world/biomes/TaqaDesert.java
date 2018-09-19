package tree_of_chaos.leylines.world.biomes;
import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;
import tree_of_chaos.leylines.init.BlockInit;

public class TaqaDesert extends LeyLinesBiomes
{
	private static final String BlockInit = null;
	public static Biome.BiomeProperties properties = new Biome.BiomeProperties("Taqa Desert");
	
    static 
    {
        properties.setTemperature(Biomes.DESERT.getDefaultTemperature());
        properties.setRainfall(Biomes.DESERT.getRainfall());
        properties.setBaseHeight(Biomes.DESERT.getBaseHeight());
        properties.setHeightVariation(Biomes.DESERT.getHeightVariation());
    }
	
	public TaqaDesert()
	{
		super(properties);
        this.topBlock = BlockInit.taqa_sand.getDefaultState();
        this.fillerBlock = BlockInit.taqa_sandstone.getDefaultState();
        this.decorator.treesPerChunk = -999;
	}
}
