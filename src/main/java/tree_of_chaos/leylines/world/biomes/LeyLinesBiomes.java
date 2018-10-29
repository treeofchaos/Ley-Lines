package tree_of_chaos.leylines.world.biomes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class LeyLinesBiomes extends Biome
{

	public LeyLinesBiomes(BiomeProperties biomeproperties) 
	{
		super(biomeproperties);
	}
	public void cleanSpawnLists() 
	{
		spawnableCreatureList.clear();
		spawnableMonsterList.clear();
		spawnableWaterCreatureList.clear();
		spawnableCaveCreatureList.clear();
	}
    public float getSpawningChance()
    {
        return 0.13F;
    }
    @Override
    public int getGrassColorAtPos(BlockPos blockPos) 
    {
        return 0x442f44;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public int getFoliageColorAtPos(BlockPos blockPos) 
    {
        return 0xf9fbff;
    }

    @Override
    public int getSkyColorByTemp(float temp) 
    {
        return 0xf9fbff;
    }

    @Override
    public int getWaterColorMultiplier() 
    {
        return 0xf9fbff;
    }
}