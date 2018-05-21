package com.tree_of_chaos.LeyLines.tools;
import com.tree_of_chaos.LeyLines.Main;
import com.tree_of_chaos.LeyLines.init.ModItems;
import com.tree_of_chaos.LeyLines.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;
public class ToolAxe extends ItemAxe implements IHasModel
{
	public ToolAxe(String name, ToolMaterial material)
	{
		super(material, 8.0f, -3.0f);
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
