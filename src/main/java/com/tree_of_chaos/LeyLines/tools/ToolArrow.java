package com.tree_of_chaos.LeyLines.tools;
import com.tree_of_chaos.LeyLines.LeyLines;
import com.tree_of_chaos.LeyLines.ModItems;
import com.tree_of_chaos.LeyLines.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.Item.ToolMaterial;
public class ToolArrow extends ItemArrow implements IHasModel
{
	public ToolArrow(String name, ToolMaterial material)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		ModItems.ITEMS.add(this);
		
	}
	public void registerModels() 
	{
		LeyLines.proxy.registerItemRenderer(this,0,"inventory");
	}
}
