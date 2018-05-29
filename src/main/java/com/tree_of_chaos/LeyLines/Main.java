package com.tree_of_chaos.LeyLines;
import com.tree_of_chaos.LeyLines.init.ModBlocks;
import com.tree_of_chaos.LeyLines.init.ModItems;
import com.tree_of_chaos.LeyLines.init.ModRecipes;
import com.tree_of_chaos.LeyLines.proxy.CommonProxy;
import com.tree_of_chaos.LeyLines.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version=Reference.VERSION)
public class Main 
{
	@net.minecraftforge.fml.common.Mod.Instance
	public static Main Instance;
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		
	}
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
	}
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}
    public static CreativeTabs creativeTab = new CreativeTabs("leylines") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.TAQA_INGOT);
        }
    };
}	