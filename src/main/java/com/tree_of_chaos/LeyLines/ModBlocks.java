package com.tree_of_chaos.LeyLines;
import com.tree_of_chaos.LeyLines.blocks.AljahimBlock;
import com.tree_of_chaos.LeyLines.blocks.Conduit;
import com.tree_of_chaos.LeyLines.blocks.QuaBlock;
import com.tree_of_chaos.LeyLines.blocks.RwhBlock;
import com.tree_of_chaos.LeyLines.blocks.TaqaBlock;
import com.tree_of_chaos.LeyLines.blocks.TaqaOreBlock;

import net.minecraftforge.fml.common.registry.GameRegistry;
public class ModBlocks 
{
    @GameRegistry.ObjectHolder("leylines:conduit")
    public static Conduit conduit;
    @GameRegistry.ObjectHolder("leylines:taqa_ore")
    public static TaqaOreBlock taqaoreblock;
    @GameRegistry.ObjectHolder("leylines:aljahim_block")
    public static AljahimBlock aljahimblock;
    @GameRegistry.ObjectHolder("leylines:qua_block")
    public static QuaBlock quablock;
    @GameRegistry.ObjectHolder("leylines:rwh_block")
    public static RwhBlock rwhblock;
    @GameRegistry.ObjectHolder("leylines:taqa_block")
    public static TaqaBlock taqablock;
    
	/*public static final List<Block> BLOCKS = new ArrayList<Block>();
	//Ores
	--public static final Block TAQA_ORE_BLOCK = new TaqaOreBlock();
	//Ingot Blocks
	--public static final Block ALJAHIM_BLOCK = new BlockBase("aljahim_block", Material.IRON);
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
	public static final Block QUARTZITE_LAYERS = new BlockBase("quartzite_layers", Material.ROCK);
	public static final Block QUARTZITE_STACKED = new BlockBase("quartzite_stacked", Material.ROCK);
	public static final Block CONDUIT = new Conduit("conduit", Material.ROCK);
	//Misc. Blocks
	public static final Block HELL_ROD = new HellRod("hell_rod");*/
}