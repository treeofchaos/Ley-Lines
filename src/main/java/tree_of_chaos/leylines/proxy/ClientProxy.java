package tree_of_chaos.leylines.proxy;
//import tree_of_chaos.leylines.items.ItemBase;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import tree_of_chaos.leylines.ModBlocks;
import tree_of_chaos.leylines.ModItems;
@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy 
{
	    @Override
	    public void preInit(FMLPreInitializationEvent e) 
	    {
	        super.preInit(e);
	    }

	    @Override
	    public void init(FMLInitializationEvent e) 
	    {
	        super.init(e);
	    }

	    @Override
	    public void postInit(FMLPostInitializationEvent e) 
	    {
	        super.postInit(e);
	    }

	    @SubscribeEvent
	    public static void registerModels(ModelRegistryEvent event) 
	    {
	        ModBlocks.initModels();
	    }
}
