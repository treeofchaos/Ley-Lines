package tree_of_chaos.leylines.creativetabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import tree_of_chaos.leylines.ModBlocks;
import tree_of_chaos.leylines.ModItems;
public class LeyLinesTab extends CreativeTabs
{
	public LeyLinesTab(String label) 
	{
		super("leylines");
	}
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlocks.taqa_block);
	}
}
