/*package com.tree_of_chaos.LeyLines.items;
import com.tree_of_chaos.LeyLines.Main;
import com.tree_of_chaos.LeyLines.ModItems;
import com.tree_of_chaos.LeyLines.util.IHasModel;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.creativeTab);
		ModItems.ITEMS.add(this);
	}
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
	@Override
	public void registerModels() 
	{
		
	}
}*/
