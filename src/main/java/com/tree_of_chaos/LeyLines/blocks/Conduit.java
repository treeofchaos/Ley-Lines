package com.tree_of_chaos.LeyLines.blocks;
import com.tree_of_chaos.LeyLines.LeyLines;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
public class Conduit extends Block
{
	public Conduit() 
	{
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(5.0f);
		setResistance(25.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.0f);
		setCreativeTab(LeyLines.creativeTab);
		setUnlocalizedName(LeyLines.MODID + ".conduit");
		setRegistryName("conduit");
	}
}