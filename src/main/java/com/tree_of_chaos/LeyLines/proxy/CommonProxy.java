package com.tree_of_chaos.LeyLines.proxy;
import java.io.File;
import com.tree_of_chaos.LeyLines.ModBlocks;
import com.tree_of_chaos.LeyLines.ModItems;
import com.tree_of_chaos.LeyLines.blocks.Conduit;
import com.tree_of_chaos.LeyLines.blocks.TaqaOreBlock;
//import com.tree_of_chaos.LeyLines.items.ItemBase;
import com.tree_of_chaos.LeyLines.tools.ToolArrow;
import com.tree_of_chaos.LeyLines.tools.ToolBow;
import com.tree_of_chaos.LeyLines.util.Config;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
@Mod.EventBusSubscriber
public class CommonProxy 
{
	public void preInit(FMLPreInitializationEvent e) 
	{
		File directory = e.getModConfigurationDirectory();
		config = new Configuration(new File(directory.getPath(), "leylines.cfg"));
		Config.readConfig();
	}

	public void init(FMLInitializationEvent e) 
	{

	}

	public void postInit(FMLPostInitializationEvent e) 
	{
        if (config.hasChanged()) 
        {
            config.save();
        }
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) 
	{
		event.getRegistry().register(new TaqaOreBlock());
		event.getRegistry().register(new Conduit());
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) 
	{
		event.getRegistry().register(new ItemBlock(ModBlocks.conduit).setRegistryName(ModBlocks.conduit.getRegistryName()));
	}
	public static Configuration config;
	
	public void registerItemRenderer(ToolBow toolBow, int i, String string) 
	{
		// TODO Auto-generated method stub
		
	}

	public void registerItemRenderer(ToolArrow toolArrow, int i, String string) 
	{
		// TODO Auto-generated method stub
		
	}
}