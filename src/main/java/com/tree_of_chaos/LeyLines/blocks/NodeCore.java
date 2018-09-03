package com.tree_of_chaos.LeyLines.blocks;
import com.tree_of_chaos.LeyLines.LeyLines;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class NodeCore extends Block
{
	public NodeCore() 
	{
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(5.0f);
		setResistance(16000.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.0f);
		setCreativeTab(LeyLines.creativeTab);
		setUnlocalizedName(LeyLines.MODID + ".node_core");
		setRegistryName("node_core");
	}
}
