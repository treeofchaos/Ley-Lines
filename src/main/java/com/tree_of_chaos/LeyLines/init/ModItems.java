package com.tree_of_chaos.LeyLines.init;
import java.util.ArrayList;
import java.util.List;

import com.tree_of_chaos.LeyLines.items.ItemBase;
import com.tree_of_chaos.LeyLines.tools.ToolPickaxe;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
public class ModItems 
{
	
	//tool materials
	public static final ToolMaterial TOOL_TAQA = EnumHelper.addToolMaterial("tool_taqa", 3, 1267, 10.0f, 7.0f, 30);
	
	//armor materials
	
	//items
	public static final List<Item> ITEMS = new ArrayList <Item>();
	public static final Item TAQA_INGOT = new ItemBase("taqa_ingot");
	public static final Item CHARGED_TAQA_INGOT = new ItemBase("charged_taqa_ingot");
	
	//tools
	public static final Item TAQA_PICKAXE = new ToolPickaxe("taqa_pickaxe", TOOL_TAQA);
	
	//armor

}
		
