package tree_of_chaos.leylines.proxy;
//import tree_of_chaos.leylines.items.ItemBase;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import tree_of_chaos.leylines.ModBlocks;
import tree_of_chaos.leylines.ModItems;
import tree_of_chaos.leylines.blocks.Conduit;
@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) 
    {
        super.preInit(e);
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) 
    {
    	
    }
}
