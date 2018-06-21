package com.tree_of_chaos.LeyLines.blocks;
import com.tree_of_chaos.LeyLines.Main;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
public class Conduit extends BlockBase
{
	public Conduit(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(5.0f);
		setResistance(25.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.0f);
		setCreativeTab(Main.creativeTab);
	}
}