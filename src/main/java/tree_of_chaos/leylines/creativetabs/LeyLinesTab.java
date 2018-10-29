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
		setBackgroundImageName("item_search.png");

	}
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(BlockInit.TAQA_BLOCK));
	}
	
	@Override
	public boolean hasSearchBar() {
		return true;
	}
}
