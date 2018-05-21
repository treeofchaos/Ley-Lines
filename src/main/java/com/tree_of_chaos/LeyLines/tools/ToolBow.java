package com.tree_of_chaos.LeyLines.tools;
import com.tree_of_chaos.LeyLines.Main;
import com.tree_of_chaos.LeyLines.init.ModItems;
import com.tree_of_chaos.LeyLines.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBow;
import net.minecraft.item.Item.ToolMaterial;
public class ToolBow extends ItemBow implements IHasModel 
{
	public ToolBow(String name, ToolMaterial material)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		ModItems.ITEMS.add(this);
		
	}
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this,0,"inventory");
	}
}
