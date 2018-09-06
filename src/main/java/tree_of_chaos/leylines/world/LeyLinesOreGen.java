package tree_of_chaos.leylines.world;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import tree_of_chaos.leylines.ModBlocks;

public class LeyLinesOreGen implements IWorldGenerator 
{
	private static boolean retrogen = false;
    public static LeyLinesOreGen instance = new LeyLinesOreGen();
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		generateWorld(random, chunkX, chunkZ, world, true);
	}
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, boolean newGen) 
	{
		if (!newGen && !retrogen) 
		{
			return;
		}
		if (world.provider.getDimension() == 0) 
		{
			addOreSpawn(ModBlocks.quartzite, (byte) 0, ModBlocks.quartzite, world, random, chunkX * 16, chunkZ * 16, 10, 64, 10, 0, 70);
		}
	}
	public void addOreSpawn(Block block, byte blockMeta, Block targetBlock, World world, Random random, int blockXPos, int blockZPos, int minVeinSize, int maxVeinSize, int chancesToSpawn, int minY, int maxY) 
	{
		WorldGenMinable minable = new WorldGenMinable(block.getStateFromMeta(blockMeta), (minVeinSize + random.nextInt(maxVeinSize - minVeinSize + 1)),
				input -> input.getBlock() == targetBlock && input.getBlock().getMetaFromState(input) == 0);
		//                BlockMatcher.forBlock(targetBlock));
		for (int i = 0 ; i < chancesToSpawn ; i++) 
		{
			int posX = blockXPos + random.nextInt(16);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(16);
			minable.generate(world, random, new BlockPos(posX, posY, posZ));
		}
	}

}
