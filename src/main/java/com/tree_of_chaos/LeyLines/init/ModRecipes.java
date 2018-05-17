package com.tree_of_chaos.LeyLines.init;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.TAQA_ORE_BLOCK, new ItemStack(ModItems.TAQA_INGOT, 1), 5.0f);
	}
}
