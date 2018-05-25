package com.tree_of_chaos.LeyLines.init;
import java.util.ArrayList;
import java.util.List;

import com.tree_of_chaos.LeyLines.items.ItemBase;
import com.tree_of_chaos.LeyLines.tools.ToolArrow;
import com.tree_of_chaos.LeyLines.tools.ToolAxe;
import com.tree_of_chaos.LeyLines.tools.ToolBow;
import com.tree_of_chaos.LeyLines.tools.ToolPickaxe;
import com.tree_of_chaos.LeyLines.tools.ToolSword;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
public class ModItems 
{
	//tool materials
	public static final ToolMaterial TOOL_TAQA = EnumHelper.addToolMaterial("tool_taqa", 4, 1267, 10.0f, 7.0f, 30);
	public static final ToolMaterial TOOL_QUA = EnumHelper.addToolMaterial("tool_qua", 2, 1567, 9.5f, 8.0f, 40);
	public static final ToolMaterial TOOL_RWH = EnumHelper.addToolMaterial("tool_rwh", 4, 1467, 20.0f, 9.0f, 35);
	public static final ToolMaterial TOOL_ALJAHIM = EnumHelper.addToolMaterial("tool_aljahim", 4, 2000, 10.5f, 13.0f, 25);
	
	//items
	public static final List<Item> ITEMS = new ArrayList <Item>();
	public static final Item TAQA_INGOT = new ItemBase("taqa_ingot");
	public static final Item CHARGED_TAQA_INGOT = new ItemBase("charged_taqa_ingot");
	public static final Item QUA_INGOT = new ItemBase("qua_ingot");
	public static final Item RWH_INGOT = new ItemBase("rwh_ingot");
	public static final Item ALJAHIM_INGOT = new ItemBase("aljahim_ingot");
	
	//tools
	public static final ItemPickaxe TAQA_PICKAXE = new ToolPickaxe("taqa_pickaxe", TOOL_TAQA);
	public static final ItemSword QUA_SWORD = new ToolSword("qua_sword", TOOL_QUA);
	public static final ItemAxe RWH_AXE = new ToolAxe("rwh_axe", TOOL_RWH);
	public static final ItemBow ALJAHIM_BOW = new ToolBow("aljahim_bow", TOOL_ALJAHIM);
	public static final ItemArrow ALJAHIM_ARROW = new ToolArrow("aljahim_arrow", TOOL_ALJAHIM);
	
	//armor
	
}
		
