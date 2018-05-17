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
	public static final Block TAQA_ORE_BLOCK = new TaqaOreBlock("taqa_ore_block", Material.IRON);
}
