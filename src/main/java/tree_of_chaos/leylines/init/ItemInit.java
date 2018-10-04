package tree_of_chaos.leylines.init;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import tree_of_chaos.leylines.items.ItemBase;
import tree_of_chaos.leylines.items.ToolArrow;
import tree_of_chaos.leylines.items.ToolAxe;
import tree_of_chaos.leylines.items.ToolBow;
import tree_of_chaos.leylines.items.ToolPickaxe;
import tree_of_chaos.leylines.items.ToolSword;

public class ItemInit 
{	
	//materials
	public static final ToolMaterial QUA = EnumHelper.addToolMaterial("QUA", 2, 1567, 9.5f, 8.0f, 40);
	public static final ToolMaterial RWH = EnumHelper.addToolMaterial("RWH", 4, 1467, 20.0f, 9.0f, 35);
	public static final ToolMaterial TAQA = EnumHelper.addToolMaterial("TAQA", 4, 1267, 10.0f, 7.0f, 30);
	public static final ToolMaterial ALJAHIM = EnumHelper.addToolMaterial("ALJAHIM", 4, 2000, 10.5f, 13.0f, 25);
	public static final ItemArmor.ArmorMaterial ARMOR_TAQA = EnumHelper.addArmorMaterial("TAQA", "leylines" + ":taqa", 15, new int[]{4, 5, 6, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	//items
	public static final ItemBase TAQA_INGOT = new ItemBase("taqa_ingot");
	public static final ItemBase CHARGED_TAQA_INGOT = new ItemBase("charged_taqa_ingot");
	public static final ItemBase QUA_INGOT = new ItemBase("qua_ingot");
	public static final ItemBase RWH_INGOT = new ItemBase("rwh_ingot");
	public static final ItemBase ALJAHIM_INGOT = new ItemBase("aljahim_ingot");
	
	//tools 
	public static final ToolSword QUA_SWORD = new ToolSword("qua_sword", QUA);
	public static final ToolPickaxe TAQA_PICKAXE = new ToolPickaxe("taqa_pickaxe", TAQA);
	public static final ToolAxe RWH_AXE = new ToolAxe("rwh_axe", RWH);
	public static final ToolBow ALJAHIM_BOW = new ToolBow("aljahim_bow", ALJAHIM);
	public static final ToolArrow ALJAHIM_ARROW = new ToolArrow("aljahim_arrow");
	
	//armor
	
    @SideOnly(Side.CLIENT)
	public static void initModels() 
    {
		TAQA_INGOT.initModel();
		CHARGED_TAQA_INGOT.initModel();
		QUA_INGOT.initModel();
		RWH_INGOT.initModel();
		ALJAHIM_INGOT.initModel();
		
		TAQA_PICKAXE.initModel();
		RWH_AXE.initModel();
		QUA_SWORD.initModel();
		ALJAHIM_BOW.initModel();
		ALJAHIM_ARROW.initModel();
	}
    
    public static void registerItems(IForgeRegistry<Item> iForgeRegistry) 
	{
		iForgeRegistry.registerAll(TAQA_INGOT, QUA_INGOT, CHARGED_TAQA_INGOT, RWH_INGOT, ALJAHIM_INGOT, QUA_SWORD, TAQA_PICKAXE, RWH_AXE, ALJAHIM_BOW, ALJAHIM_ARROW);
	}
}
		
