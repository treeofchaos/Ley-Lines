package com.tree_of_chaos.LeyLines.blocks;
import com.tree_of_chaos.LeyLines.LeyLines;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
public class RwhBlock extends Block
{

	public RwhBlock(Material materialIn) 
	{
		super(Material.IRON);
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(25.0f);
		setHarvestLevel("pickaxe", 4);
		setLightLevel(1.0f);
		setCreativeTab(LeyLines.creativeTab);
		setUnlocalizedName(LeyLines.MODID + ".rwh_block");
		setRegistryName("Rwh Block");
	}

}
