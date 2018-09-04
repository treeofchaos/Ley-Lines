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
public class TaqaOreBlock extends Block
{
	//public static final Block TAQA_ORE_BLOCK;
	public TaqaOreBlock() 
	{
		super(Material.IRON);
		setSoundType(SoundType.STONE);
		setHardness(5.0f);
		setResistance(18000000.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(8.0f);
		setCreativeTab(LeyLines.creativeTab);
		setUnlocalizedName(LeyLines.MODID + ".taqa_ore");
		setRegistryName("taqa_ore_block");
	}
	
    @SideOnly(Side.CLIENT)
    public void initModel() 
    {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
