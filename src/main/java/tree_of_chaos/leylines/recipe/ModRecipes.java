package tree_of_chaos.leylines.recipe;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tree_of_chaos.leylines.init.BlockInit;
import tree_of_chaos.leylines.init.ItemInit;

public class ModRecipes 
{
	public static void init() 
	{
		GameRegistry.addSmelting(BlockInit.TAQA_ORE_BLOCK, new ItemStack(ItemInit.TAQA_INGOT), 12);
	}

}
