package tree_of_chaos.leylines.creativetabs;
import init.BlockInit;
import init.ModItems;
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
		return new ItemStack(BlockInit.taqa_block);
	}
}
