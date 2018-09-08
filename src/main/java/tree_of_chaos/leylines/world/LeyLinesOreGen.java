package tree_of_chaos.leylines.world;

import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import tree_of_chaos.leylines.init.BlockInit;

public class LeyLinesOreGen implements IWorldGenerator 
{
	private static boolean retrogen = false;
	public static LeyLinesOreGen instance = new LeyLinesOreGen();
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		if (world.provider.getDimension() == 0) 
		{
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}

	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		generateOre(BlockInit.QUARTZITE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 255, 4 + random.nextInt(60), 20);
		generateOre(BlockInit.TAQA_ORE_BLOCK.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 128, 4 + random.nextInt(8), 15);
		generateOre(BlockInit.QUARTZITE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 0, 20, 4 + random.nextInt(8), 5);
	}

	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) 
	{
		int deltaY = maxY - minY;

		for (int i = 0; i < chances; i++) 
		{
			BlockPos pos= new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}

}
