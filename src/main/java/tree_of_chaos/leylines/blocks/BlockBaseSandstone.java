package tree_of_chaos.leylines.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import tree_of_chaos.leylines.LeyLines;

public class BlockBaseSandstone extends Block
{
	String name;

    public BlockBaseSandstone( String name) {

    	super(Material.ROCK);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(5F);
        setCreativeTab(LeyLines.leylinestab);
        setHarvestLevel("pickaxe", 1);
    }

    public void registerItemModel(Item item) {
    	LeyLines.proxy.registerItemRenderer(item, 0, name);
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }
    
    @SideOnly(Side.CLIENT)
    public void initModel() 
    {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
