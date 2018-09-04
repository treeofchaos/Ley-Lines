package tree_of_chaos.leylines.proxy;
import java.io.File;

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
import tree_of_chaos.leylines.ModBlocks;
import tree_of_chaos.leylines.blocks.AljahimBlock;
import tree_of_chaos.leylines.blocks.Conduit;
import tree_of_chaos.leylines.blocks.ConduitCore;
import tree_of_chaos.leylines.blocks.ForgeCore;
import tree_of_chaos.leylines.blocks.InfusionCore;
import tree_of_chaos.leylines.blocks.NodeCore;
import tree_of_chaos.leylines.blocks.QuaBlock;
import tree_of_chaos.leylines.blocks.Quartzite;
import tree_of_chaos.leylines.blocks.QuartziteBricks;
import tree_of_chaos.leylines.blocks.QuartziteChiseled;
import tree_of_chaos.leylines.blocks.QuartziteDark;
import tree_of_chaos.leylines.blocks.QuartziteLayers;
import tree_of_chaos.leylines.blocks.QuartzitePillar;
import tree_of_chaos.leylines.blocks.QuartzitePolished;
import tree_of_chaos.leylines.blocks.QuartzitePrism;
import tree_of_chaos.leylines.blocks.QuartziteSpiral;
import tree_of_chaos.leylines.blocks.QuartziteStacked;
import tree_of_chaos.leylines.blocks.QuartziteTiles;
import tree_of_chaos.leylines.blocks.RitualCore;
import tree_of_chaos.leylines.blocks.RwhBlock;
import tree_of_chaos.leylines.blocks.TaqaBlock;
import tree_of_chaos.leylines.blocks.TaqaOreBlock;
import tree_of_chaos.leylines.tools.ToolArrow;
import tree_of_chaos.leylines.tools.ToolBow;
import tree_of_chaos.leylines.util.Config;
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
		event.getRegistry().register(new Quartzite());
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
		event.getRegistry().register(new ItemBlock(ModBlocks.aljahim_block).setRegistryName(ModBlocks.aljahim_block.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.conduit).setRegistryName(ModBlocks.conduit.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.conduit_core).setRegistryName(ModBlocks.conduit_core.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.forge_core).setRegistryName(ModBlocks.forge_core.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.infusion_core).setRegistryName(ModBlocks.infusion_core.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.node_core).setRegistryName(ModBlocks.node_core.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.qua_block).setRegistryName(ModBlocks.qua_block.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.quartzite).setRegistryName(ModBlocks.quartzite.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.quartzite_bricks).setRegistryName(ModBlocks.quartzite_bricks.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.quartzite_chiseled).setRegistryName(ModBlocks.quartzite_chiseled.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.quartzite_dark).setRegistryName(ModBlocks.quartzite_dark.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.quartzite_layers).setRegistryName(ModBlocks.quartzite_layers.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.quartzite_pillar).setRegistryName(ModBlocks.quartzite_pillar.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.quartzite_polished).setRegistryName(ModBlocks.quartzite_polished.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.quartzite_prism).setRegistryName(ModBlocks.quartzite_prism.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.quartzite_spiral).setRegistryName(ModBlocks.quartzite_spiral.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.quartzite_stacked).setRegistryName(ModBlocks.quartzite_stacked.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.quartzite_tiles).setRegistryName(ModBlocks.quartzite_tiles.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.ritual_core).setRegistryName(ModBlocks.ritual_core.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.rwh_block).setRegistryName(ModBlocks.rwh_block.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.taqa_block).setRegistryName(ModBlocks.taqa_block.getRegistryName()));
		event.getRegistry().register(new ItemBlock(ModBlocks.taqa_ore_block).setRegistryName(ModBlocks.taqa_ore_block.getRegistryName()));
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