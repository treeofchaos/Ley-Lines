package tree_of_chaos.leylines.world.biomes;
import java.util.Random;

import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenerator;

public class EntForest extends LeyLinesBiomes
{
	public static Biome.BiomeProperties properties = new Biome.BiomeProperties("Ent Forest");
	
    static 
    {
        properties.setTemperature(Biomes.JUNGLE.getDefaultTemperature());
        properties.setRainfall(Biomes.JUNGLE.getRainfall());
        properties.setBaseHeight(Biomes.JUNGLE.getBaseHeight());
        properties.setHeightVariation(Biomes.FOREST.getHeightVariation());
    }
	
	public EntForest()
	{
		super(properties);
        this.topBlock = Blocks.GRASS.getDefaultState();
        this.fillerBlock = Blocks.DIRT.getDefaultState();
        this.decorator.treesPerChunk = 25;
	}
	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand)
	{
		return (WorldGenAbstractTree)(rand.nextInt(10) == 0 ? BIG_TREE_FEATURE : TREE_FEATURE);
	}
    @Override
    public int getGrassColorAtPos(BlockPos blockPos) 
    {
        return 0x46ba44;
    }
    @Override
    public int getFoliageColorAtPos(BlockPos blockPos) 
    {
        return 0x75d155;
    }

    @Override
    public int getSkyColorByTemp(float temp) 
    {
        return 0xa7ff89;
    }

    @Override
    public int getWaterColorMultiplier() 
    {
        return 0x98e1e2;
    }
}
