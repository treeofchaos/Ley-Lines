package tree_of_chaos.leylines;
import org.apache.logging.log4j.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import tree_of_chaos.leylines.proxy.CommonProxy;

@Mod(modid = LeyLines.MODID, name = LeyLines.MODNAME, version = LeyLines.MODVERSION, useMetadata = true)
public class LeyLines {

    public static final String MODID = "leylines";
    public static final String MODNAME = "Ley Lines";
    public static final String MODVERSION = "0.0.1";

    @SidedProxy(clientSide = "tree_of_chaos.leylines.proxy.ClientProxy", serverSide = "tree_of_chaos.leylines.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static LeyLines instance;
    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) 
    {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) 
    {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) 
    {
        proxy.postInit(e);
    }
    public static CreativeTabs creativeTab = new CreativeTabs("leylines") 
    {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModBlocks.taqa_block);
       }
    };
}