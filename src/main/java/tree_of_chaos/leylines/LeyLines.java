package tree_of_chaos.leylines;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import tree_of_chaos.leylines.capabilities.CapabilityHandler;
import tree_of_chaos.leylines.capabilities.creatureenchant.CreatureEnchantCapability;
import tree_of_chaos.leylines.capabilities.creatureenchant.CreatureEnchantStorage;
import tree_of_chaos.leylines.capabilities.creatureenchant.ICreatureEnchant;
import tree_of_chaos.leylines.creativetabs.LeyLinesTab;
import tree_of_chaos.leylines.creatureenchant.CreatureEnchantRegistry;
import tree_of_chaos.leylines.proxy.CommonProxy;
import tree_of_chaos.leylines.recipe.ModRecipes;
import tree_of_chaos.leylines.sided.network.NetworkProvider;
import tree_of_chaos.leylines.util.Reference;
import tree_of_chaos.leylines.util.handlers.RegistryHandler;
import tree_of_chaos.leylines.world.LeyLinesOreGen;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class LeyLines 
{
	public static final CreativeTabs leylinestab = new LeyLinesTab("leylinestab");

    @Instance
	public static LeyLines instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) 
	{
		RegistryHandler.preInitRegistries();
		GameRegistry.registerWorldGenerator(new LeyLinesOreGen(), 3);

        NetworkProvider.INSTANCE.registerNetwork();
        CapabilityHandler.INSTANCE.registerCaps();
        MinecraftForge.EVENT_BUS.register(new CreatureEnchantRegistry());

    }

	@EventHandler
	public static void init(FMLInitializationEvent event) 
	{
		RegistryHandler.initRegistries();
		ModRecipes.init();
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) 
	{
		RegistryHandler.postInitRegistries();
		ModBiomes.cleanSpawnLists();
	}
}