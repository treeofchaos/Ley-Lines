package tree_of_chaos.leylines.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;
import tree_of_chaos.leylines.blocks.BlockBaseStone;
import tree_of_chaos.leylines.blocks.Conduit;
import tree_of_chaos.leylines.blocks.ConduitCore;
import tree_of_chaos.leylines.blocks.ForgeCore;
import tree_of_chaos.leylines.blocks.InfusionCore;
import tree_of_chaos.leylines.blocks.MetalBlockBase;
import tree_of_chaos.leylines.blocks.NodeCore;
import tree_of_chaos.leylines.blocks.QuaOreBlock;
import tree_of_chaos.leylines.blocks.QuartzitePillar;
import tree_of_chaos.leylines.blocks.RitualCore;
import tree_of_chaos.leylines.blocks.TaqaOreBlock;
import tree_of_chaos.leylines.blocks.TaqaSand;

public class BlockInit 
{
	/*Blocks making use of BlockBaseStone*/
	public static BlockBaseStone QUARTZITE = new BlockBaseStone("quartzite");
	public static BlockBaseStone QUARTZITE_BRICKS = new BlockBaseStone("quartzite_bricks");
	public static BlockBaseStone QUARTZITE_DARK = new BlockBaseStone("quartzite_dark");
	public static BlockBaseStone QUARTZITE_LAYERS = new BlockBaseStone("quartzite_layers");
	public static BlockBaseStone QUARTZITE_POLISHED = new BlockBaseStone("quartzite_polished");
	public static BlockBaseStone QUARTZITE_PRISM = new BlockBaseStone("quartzite_prism");
	public static BlockBaseStone QUARTZITE_SPIRAL = new BlockBaseStone("quartzite_spiral");
	public static BlockBaseStone QUARTZITE_STACKED = new BlockBaseStone("quartzite_stacked");
	public static BlockBaseStone QUARTZITE_TILES = new BlockBaseStone("quartzite_tiles");
	public static BlockBaseStone TAQA_SANDSTONE_CARVED = new BlockBaseStone("taqa_sandstone_carved");
	public static BlockBaseStone TAQA_SANDSTONE_SMOOTH = new BlockBaseStone("taqa_sandstone_smooth");
	public static BlockBaseStone TAQA_SANDSTONE = new BlockBaseStone("taqa_sandstone");
	
	//Blocks using MetalBlockBase
	public static MetalBlockBase RWH_BLOCK = new MetalBlockBase("rwh_block");
	public static MetalBlockBase ALJAHIM_BLOCK = new MetalBlockBase("aljahim_block");
	public static MetalBlockBase QUA_BLOCK = new MetalBlockBase("qua_block");
	public static MetalBlockBase TAQA_BLOCK = new MetalBlockBase("taqa_block");
	
	/*Blocks making use of their own Block Class */
	public static Conduit CONDUIT = new Conduit("conduit");
	public static ConduitCore CONDUIT_CORE = new ConduitCore("conduit_core");
	public static ForgeCore FORGE_CORE = new ForgeCore("forge_core");
	public static InfusionCore INFUSION_CORE = new InfusionCore("infusion_core");
	public static NodeCore NODE_CORE = new NodeCore("node_core");
	public static RitualCore RITUAL_CORE = new RitualCore("ritual_core");
	public static TaqaOreBlock TAQA_ORE_BLOCK = new TaqaOreBlock("taqa_ore_block");
	public static QuartzitePillar QUARTZITE_PILLAR = new QuartzitePillar("quartzite_pillar");
	public static QuaOreBlock QUA_ORE_BLOCK = new QuaOreBlock("qua_ore_block");
	public static TaqaSand TAQA_SAND = new TaqaSand("taqa_sand");
	
	public static void register(IForgeRegistry<Block> registry) 
	{
		
		registry.registerAll(QUARTZITE, QUARTZITE_BRICKS, QUARTZITE_DARK, QUARTZITE_LAYERS, QUARTZITE_PILLAR, QUARTZITE_POLISHED,
				QUARTZITE_PRISM, QUARTZITE_SPIRAL, QUARTZITE_STACKED, QUARTZITE_TILES, RWH_BLOCK, ALJAHIM_BLOCK, QUA_BLOCK, CONDUIT,
				CONDUIT_CORE, FORGE_CORE, INFUSION_CORE, NODE_CORE, RITUAL_CORE, TAQA_BLOCK, TAQA_ORE_BLOCK, TAQA_SAND, TAQA_SANDSTONE_CARVED,
				TAQA_SANDSTONE_SMOOTH, TAQA_SANDSTONE, QUA_ORE_BLOCK);
	}
	
	public static void registerModels() 
	{
		QUARTZITE.registerItemModel(Item.getItemFromBlock(QUARTZITE));
		QUARTZITE_BRICKS.registerItemModel(Item.getItemFromBlock(QUARTZITE_BRICKS));
		QUARTZITE_DARK.registerItemModel(Item.getItemFromBlock(QUARTZITE_DARK));
		QUARTZITE_LAYERS.registerItemModel(Item.getItemFromBlock(QUARTZITE_LAYERS));
		QUARTZITE_PILLAR.registerItemModel(Item.getItemFromBlock(QUARTZITE_PILLAR));
		QUARTZITE_POLISHED.registerItemModel(Item.getItemFromBlock(QUARTZITE_POLISHED));
		QUARTZITE_PRISM.registerItemModel(Item.getItemFromBlock(QUARTZITE_PRISM));
		QUARTZITE_SPIRAL.registerItemModel(Item.getItemFromBlock(QUARTZITE_SPIRAL));
		QUARTZITE_STACKED.registerItemModel(Item.getItemFromBlock(QUARTZITE_STACKED));
		QUARTZITE_TILES.registerItemModel(Item.getItemFromBlock(QUARTZITE_TILES));
		
		RWH_BLOCK.registerItemModel(Item.getItemFromBlock(RWH_BLOCK));
		ALJAHIM_BLOCK.registerItemModel(Item.getItemFromBlock(ALJAHIM_BLOCK));
		
		QUA_BLOCK.registerItemModel(Item.getItemFromBlock(QUA_BLOCK));
		QUA_ORE_BLOCK.registerItemModel(Item.getItemFromBlock(QUA_ORE_BLOCK));
		
		CONDUIT.registerItemModel(Item.getItemFromBlock(CONDUIT));
		CONDUIT_CORE.registerItemModel(Item.getItemFromBlock(CONDUIT_CORE));
		FORGE_CORE.registerItemModel(Item.getItemFromBlock(FORGE_CORE));
		INFUSION_CORE.registerItemModel(Item.getItemFromBlock(INFUSION_CORE));
		NODE_CORE.registerItemModel(Item.getItemFromBlock(NODE_CORE));
		RITUAL_CORE.registerItemModel(Item.getItemFromBlock(RITUAL_CORE));
		
		TAQA_BLOCK.registerItemModel(Item.getItemFromBlock(TAQA_BLOCK));
		TAQA_ORE_BLOCK.registerItemModel(Item.getItemFromBlock(TAQA_ORE_BLOCK));
		TAQA_SAND.registerItemModel(Item.getItemFromBlock(TAQA_SAND));
		TAQA_SANDSTONE_CARVED.registerItemModel(Item.getItemFromBlock(TAQA_SANDSTONE_CARVED));
		TAQA_SANDSTONE_SMOOTH.registerItemModel(Item.getItemFromBlock(TAQA_SANDSTONE_SMOOTH));
		TAQA_SANDSTONE.registerItemModel(Item.getItemFromBlock(TAQA_SANDSTONE));
	}
	
	public static void registerItemBlocks(IForgeRegistry<Item> registry) 
	{	
		registry.register(new ItemBlock(QUARTZITE).setRegistryName(QUARTZITE.getRegistryName()));
		registry.register(new ItemBlock(QUARTZITE_BRICKS).setRegistryName(QUARTZITE_BRICKS.getRegistryName()));
		registry.register(new ItemBlock(QUARTZITE_DARK).setRegistryName(QUARTZITE_DARK.getRegistryName()));
		registry.register(new ItemBlock(QUARTZITE_LAYERS).setRegistryName(QUARTZITE_LAYERS.getRegistryName()));
		registry.register(new ItemBlock(QUARTZITE_PILLAR).setRegistryName(QUARTZITE_PILLAR.getRegistryName()));
		registry.register(new ItemBlock(QUARTZITE_POLISHED).setRegistryName(QUARTZITE_POLISHED.getRegistryName()));
		registry.register(new ItemBlock(QUARTZITE_PRISM).setRegistryName(QUARTZITE_PRISM.getRegistryName()));
		registry.register(new ItemBlock(QUARTZITE_SPIRAL).setRegistryName(QUARTZITE_SPIRAL.getRegistryName()));
		registry.register(new ItemBlock(QUARTZITE_STACKED).setRegistryName(QUARTZITE_STACKED.getRegistryName()));
		registry.register(new ItemBlock(QUARTZITE_TILES).setRegistryName(QUARTZITE_TILES.getRegistryName()));
		
		registry.register(new ItemBlock(RWH_BLOCK).setRegistryName(RWH_BLOCK.getRegistryName()));
		registry.register(new ItemBlock(ALJAHIM_BLOCK).setRegistryName(ALJAHIM_BLOCK.getRegistryName()));
		
		registry.register(new ItemBlock(QUA_BLOCK).setRegistryName(QUA_BLOCK.getRegistryName()));
		registry.register(new ItemBlock(QUA_ORE_BLOCK).setRegistryName(QUA_ORE_BLOCK.getRegistryName()));
		
		registry.register(new ItemBlock(CONDUIT).setRegistryName(CONDUIT.getRegistryName()));
		registry.register(new ItemBlock(CONDUIT_CORE).setRegistryName(CONDUIT_CORE.getRegistryName()));
		registry.register(new ItemBlock(FORGE_CORE).setRegistryName(FORGE_CORE.getRegistryName()));
		registry.register(new ItemBlock(INFUSION_CORE).setRegistryName(INFUSION_CORE.getRegistryName()));
		registry.register(new ItemBlock(NODE_CORE).setRegistryName(NODE_CORE.getRegistryName()));
		registry.register(new ItemBlock(RITUAL_CORE).setRegistryName(RITUAL_CORE.getRegistryName()));
		
		registry.register(new ItemBlock(TAQA_BLOCK).setRegistryName(TAQA_BLOCK.getRegistryName()));
		registry.register(new ItemBlock(TAQA_ORE_BLOCK).setRegistryName(TAQA_ORE_BLOCK.getRegistryName()));
		registry.register(new ItemBlock(TAQA_SAND).setRegistryName(TAQA_SAND.getRegistryName()));
		registry.register(new ItemBlock(TAQA_SANDSTONE_CARVED).setRegistryName(TAQA_SANDSTONE_CARVED.getRegistryName()));
		registry.register(new ItemBlock(TAQA_SANDSTONE_SMOOTH).setRegistryName(TAQA_SANDSTONE_SMOOTH.getRegistryName()));
		registry.register(new ItemBlock(TAQA_SANDSTONE).setRegistryName(TAQA_SANDSTONE.getRegistryName()));
	}
}