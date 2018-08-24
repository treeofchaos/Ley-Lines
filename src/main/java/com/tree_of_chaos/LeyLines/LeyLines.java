package com.tree_of_chaos.LeyLines;

import org.apache.logging.log4j.Logger;

import com.tree_of_chaos.LeyLines.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = LeyLines.MODID, name = LeyLines.MODNAME, version = LeyLines.MODVERSION, dependencies = "required-after:Forge@[14.23.3.2655,)", useMetadata = true)
public class LeyLines {

    public static final String MODID = "leylines";
    public static final String MODNAME = "LeyLines";
    public static final String MODVERSION = "0.0.1";

    @SidedProxy(clientSide = "tree_of_chaos.LeyLines.proxy.ClientProxy", serverSide = "tree_of_chaos.LeyLinesproxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static LeyLines instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
    public static CreativeTabs creativeTab = new CreativeTabs("leylines") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModBlocks.taqaoreblock);
       }
    };
}
