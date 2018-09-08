package tree_of_chaos.leylines.creativetabs;
import tree_of_chaos.leylines.init.BlockInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
public class LeyLinesTab extends CreativeTabs
{
	public LeyLinesTab(String label) 
	{
		super("leylinestab");
	}
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(BlockInit.TAQA_BLOCK));
	}
}
