package com.tree_of_chaos.LeyLines.blocks;
import com.tree_of_chaos.LeyLines.LeyLines;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class QuartzitePolished extends Block
{
	public QuartzitePolished() 
	{
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(5.0f);
		setResistance(25.0f);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(LeyLines.creativeTab);
		setUnlocalizedName(LeyLines.MODID + ".quartzite_polished");
		setRegistryName("quartzitepolished");
	}
}
