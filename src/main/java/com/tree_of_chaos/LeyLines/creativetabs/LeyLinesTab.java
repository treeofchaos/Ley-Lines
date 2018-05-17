package com.tree_of_chaos.LeyLines.creativetabs;
import com.tree_of_chaos.LeyLines.init.ModBlocks;
import com.tree_of_chaos.LeyLines.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
public class LeyLinesTab extends CreativeTabs
{
	public LeyLinesTab(String label) 
	{
		super("leylines");
	}
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.TAQA_INGOT);
	}
}
