package tree_of_chaos.leylines.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import tree_of_chaos.leylines.init.BlockInit;
import tree_of_chaos.leylines.init.ItemInit;

@EventBusSubscriber
public class RegistryHandler 
{
	public static void preInitRegistries() 
	{

    }

    public static void initRegistries() 
    {

    }

    public static void postInitRegistries() 
    {
    	
    }
    
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) 
    {
    	
        ItemInit.registerItems(event.getRegistry());
        BlockInit.registerItemBlocks(event.getRegistry());
    }
    
    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) 
    {
    	
        BlockInit.register(event.getRegistry());
        
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) 
    {
    	
    	ItemInit.initModels();
        BlockInit.registerModels();
    }   
}