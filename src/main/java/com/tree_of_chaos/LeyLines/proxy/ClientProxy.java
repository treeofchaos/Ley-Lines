package com.tree_of_chaos.LeyLines.proxy;
import com.tree_of_chaos.LeyLines.ModBlocks;
import com.tree_of_chaos.LeyLines.ModItems;
import com.tree_of_chaos.LeyLines.blocks.Conduit;
//import com.tree_of_chaos.LeyLines.items.ItemBase;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
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
