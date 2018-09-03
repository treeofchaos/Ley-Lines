package com.tree_of_chaos.LeyLines.blocks;
import com.tree_of_chaos.LeyLines.LeyLines;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RitualCore extends Block
{
	public RitualCore() 
	{
		super(Material.ROCK);
		setSoundType(SoundType.STONE);
		setHardness(5.0f);
		setResistance(16000.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.0f);
		setCreativeTab(LeyLines.creativeTab);
		setUnlocalizedName(LeyLines.MODID + ".ritual_core");
		setRegistryName("ritual_core");
	}
}
