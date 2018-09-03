package com.tree_of_chaos.LeyLines.proxy;
import java.io.File;

import com.tree_of_chaos.LeyLines.ModBlocks;
import com.tree_of_chaos.LeyLines.blocks.AljahimBlock;
import com.tree_of_chaos.LeyLines.blocks.Conduit;
import com.tree_of_chaos.LeyLines.blocks.ConduitCore;
import com.tree_of_chaos.LeyLines.blocks.ForgeCore;
import com.tree_of_chaos.LeyLines.blocks.InfusionCore;
import com.tree_of_chaos.LeyLines.blocks.NodeCore;
import com.tree_of_chaos.LeyLines.blocks.QuaBlock;
import com.tree_of_chaos.LeyLines.blocks.QuartziteBlock;
import com.tree_of_chaos.LeyLines.blocks.QuartziteBricks;
import com.tree_of_chaos.LeyLines.blocks.QuartziteChiseled;
import com.tree_of_chaos.LeyLines.blocks.QuartziteDark;
import com.tree_of_chaos.LeyLines.blocks.QuartziteLayers;
import com.tree_of_chaos.LeyLines.blocks.QuartzitePillar;
import com.tree_of_chaos.LeyLines.blocks.QuartzitePolished;
import com.tree_of_chaos.LeyLines.blocks.QuartzitePrism;
import com.tree_of_chaos.LeyLines.blocks.QuartziteSpiral;
import com.tree_of_chaos.LeyLines.blocks.QuartziteStacked;
import com.tree_of_chaos.LeyLines.blocks.QuartziteTiles;
import com.tree_of_chaos.LeyLines.blocks.RitualCore;
import com.tree_of_chaos.LeyLines.blocks.RwhBlock;
import com.tree_of_chaos.LeyLines.blocks.TaqaBlock;
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
		event.getRegistry().register(new AljahimBlock());
		event.getRegistry().register(new ConduitCore());
		event.getRegistry().register(new ForgeCore());
		event.getRegistry().register(new InfusionCore());
		event.getRegistry().register(new NodeCore());
		event.getRegistry().register(new QuaBlock());
		event.getRegistry().register(new QuartziteBlock());
		event.getRegistry().register(new QuartziteBricks());
		event.getRegistry().register(new QuartziteChiseled());
		event.getRegistry().register(new QuartziteDark());
		event.getRegistry().register(new QuartziteLayers());
		event.getRegistry().register(new QuartzitePillar());
		event.getRegistry().register(new QuartzitePolished());
		event.getRegistry().register(new QuartzitePrism());
		event.getRegistry().register(new QuartziteSpiral());
		event.getRegistry().register(new QuartziteStacked());
		event.getRegistry().register(new QuartziteTiles());
		event.getRegistry().register(new RitualCore());
		event.getRegistry().register(new RwhBlock());
		event.getRegistry().register(new TaqaBlock());
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) 
	{
		event.getRegistry().register(new ItemBlock(ModBlocks.aljahimblock).setRegistryName(ModBlocks.aljahimblock.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.conduit).setRegistryName(ModBlocks.conduit.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.conduitcore).setRegistryName(ModBlocks.conduitcore.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.forgecore).setRegistryName(ModBlocks.forgecore.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.infusioncore).setRegistryName(ModBlocks.infusioncore.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.nodecore).setRegistryName(ModBlocks.nodecore.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.quablock).setRegistryName(ModBlocks.quablock.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.quartziteblock).setRegistryName(ModBlocks.quartziteblock.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.quartzitebricks).setRegistryName(ModBlocks.quartzitebricks.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.quartzitechiseled).setRegistryName(ModBlocks.quartzitechiseled.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.quartzitedark).setRegistryName(ModBlocks.quartzitedark.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.quartzitelayers).setRegistryName(ModBlocks.quartzitelayers.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.quartzitepillar).setRegistryName(ModBlocks.quartzitepillar.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.quartzitepolished).setRegistryName(ModBlocks.quartzitepolished.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.quartziteprism).setRegistryName(ModBlocks.quartziteprism.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.quartzitespiral).setRegistryName(ModBlocks.quartzitespiral.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.quartzitestacked).setRegistryName(ModBlocks.quartzitestacked.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.quartzitetiles).setRegistryName(ModBlocks.quartzitetiles.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.ritualcore).setRegistryName(ModBlocks.ritualcore.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.rwhblock).setRegistryName(ModBlocks.rwhblock.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.taqablock).setRegistryName(ModBlocks.taqablock.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.taqaoreblock).setRegistryName(ModBlocks.taqaoreblock.getRegistryName()));
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