package com.tree_of_chaos.LeyLines.init;
import java.util.ArrayList;
import java.util.List;
import com.tree_of_chaos.LeyLines.blocks.BlockBase;
import com.tree_of_chaos.LeyLines.blocks.TaqaOreBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	//Ores
	public static final Block TAQA_ORE_BLOCK = new TaqaOreBlock("taqa_ore_block", Material.ROCK);
	//Ingot Blocks
	public static final Block ALJAHIM_BLOCK = new BlockBase("aljahim_block", Material.IRON);
	public static final Block QUA_BLOCK = new BlockBase("qua_block", Material.IRON);
	public static final Block RWH_BLOCK = new BlockBase("rwh_block", Material.IRON);
	public static final Block TAQA_BLOCK = new BlockBase("taqa_block", Material.IRON);
	//Quartzite
	public static final Block QUARTZITE_BLOCK = new BlockBase("quartzite_block", Material.ROCK);
	public static final Block QUARTZITE_BRICKS = new BlockBase("quartzite_bricks", Material.ROCK);
	public static final Block QUARTZITE_CHISELED = new BlockBase("quartzite_chiseled", Material.ROCK);
	public static final Block QUARTZITE_PILLAR = new BlockBase("quartzite_pillar", Material.ROCK);
	public static final Block QUARTZITE_POLISHED = new BlockBase("quartzite_polished", Material.ROCK);
	public static final Block QUARTZITE_PRISM = new BlockBase("quartzite_prism", Material.ROCK);
	public static final Block QUARTZITE_TILES = new BlockBase("quartzite_tiles", Material.ROCK);
}
