package tree_of_chaos.leylines.init;
import java.util.ArrayList;
import java.util.List;

//import tree_of_chaos.leylines.tools.ToolArrow;
//import tree_of_chaos.leylines.tools.ToolAxe;
//import tree_of_chaos.leylines.tools.ToolBow;
//import tree_of_chaos.leylines.tools.ToolPickaxe;
//import tree_of_chaos.leylines.tools.ToolSword;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemBow;
import net.minecraftforge.common.util.EnumHelper;

import tree_of_chaos.leylines.tools.ToolBow;
import tree_of_chaos.leylines.items.ItemBase;
import tree_of_chaos.leylines.items.QuaSword;
import tree_of_chaos.leylines.items.RwhAxe;
import tree_of_chaos.leylines.items.TaqaPickaxe;

public class ItemInit 
{
	//tool materials
	public static ToolMaterial TOOL_TAQA = EnumHelper.addToolMaterial("tool_taqa", 4, 1267, 10.0f, 7.0f, 30);
	public static ToolMaterial TOOL_QUA = EnumHelper.addToolMaterial("tool_qua", 2, 1567, 9.5f, 8.0f, 40);
	public static ToolMaterial TOOL_RWH = EnumHelper.addToolMaterial("tool_rwh", 4, 1467, 20.0f, 9.0f, 35);
	public static ToolMaterial TOOL_ALJAHIM = EnumHelper.addToolMaterial("tool_aljahim", 4, 2000, 10.5f, 13.0f, 25);
	public static ItemBow ALJAHIM_BOW = new ToolBow("aljahim_bow", TOOL_ALJAHIM);
	
	//items
	public static ItemBase TAQA_INGOT = new ItemBase("taqa_ingot");
	public static ItemBase CHARGED_TAQA_INGOT = new ItemBase("charged_taqa_ingot");
	public static ItemBase QUA_INGOT = new ItemBase("qua_ingot");
	public static ItemBase RWH_INGOT = new ItemBase("rwh_ingot");
	public static ItemBase ALJAHIM_INGOT = new ItemBase("aljahim_ingot");
	
	//materials
	public static ToolMaterial QUA = EnumHelper.addToolMaterial("QUA", 1, 400, 0, 16.0f, 30);
	public static ToolMaterial RWH = EnumHelper.addToolMaterial("RWH", 1, 400, 5, 10.0f, 30);
	public static ToolMaterial TAQA = EnumHelper.addToolMaterial("TAQA", 3, 400, 5, 5.0f, 30);
	
	//tools 
	public static QuaSword QUA_SWORD = new QuaSword("qua_sword", QUA);
	public static TaqaPickaxe TAQA_PICKAXE = new TaqaPickaxe("taqa_pickaxe", TAQA);
	public static RwhAxe RWH_AXE = new RwhAxe("rwh_axe", RWH);
	
	//public static ItemArrow ALJAHIM_ARROW = new ItemArrow("aljahim_arrow");
	
	//armor
	
    @SideOnly(Side.CLIENT)
	public static void initModels() {
		TAQA_INGOT.initModel();
		CHARGED_TAQA_INGOT.initModel();
		QUA_INGOT.initModel();
		RWH_INGOT.initModel();
		ALJAHIM_INGOT.initModel();
		
		TAQA_PICKAXE.initModel();
		RWH_AXE.initModel();
		QUA_SWORD.initModel();
		
	}
}
		
