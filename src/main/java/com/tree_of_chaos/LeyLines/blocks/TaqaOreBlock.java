package com.tree_of_chaos.LeyLines.blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
public class TaqaOreBlock extends BlockBase
{

	public TaqaOreBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(5.0f);
		setResistance(18000000.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(8.0f);
	}

}
