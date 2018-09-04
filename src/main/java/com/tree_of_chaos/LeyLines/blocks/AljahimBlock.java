package com.tree_of_chaos.LeyLines.blocks;
import com.tree_of_chaos.LeyLines.LeyLines;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AljahimBlock extends Block
{
	public AljahimBlock() 
	{
			super(Material.IRON);
			setSoundType(SoundType.METAL);
			setHardness(5.0f);
			setResistance(25.0f);
			setHarvestLevel("pickaxe", 4);
			setLightLevel(1.0f);
			setCreativeTab(LeyLines.creativeTab);
			setUnlocalizedName(LeyLines.MODID + ".aljahim_block");
			setRegistryName("aljahim_block");
	}
	
    @SideOnly(Side.CLIENT)
    public void initModel() 
    {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
