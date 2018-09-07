package init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;

import tree_of_chaos.leylines.blocks.QuartziteBase;

public class BlockInit {
	
	public static QuartziteBase QUARTZITE = new QuartziteBase("quartzite");
	public static QuartziteBase QUARTZITE_BRICKS = new QuartziteBase("quartzite_bricks");
	public static QuartziteBase QUARTZITE_DARK = new QuartziteBase("quartzite_dark");
	public static QuartziteBase QUARTZITE_LAYERS = new QuartziteBase("quartzite_layers");
	public static QuartziteBase QUARTZITE_PILLAR = new QuartziteBase("quartzite_pillar");
	public static QuartziteBase QUARTZITE_POLISHED = new QuartziteBase("quartzite_polished");
	public static QuartziteBase QUARTZITE_PRISM = new QuartziteBase("quartzite_prism");
	public static QuartziteBase QUARTZITE_SPIRAL = new QuartziteBase("quartzite_spiral");
	public static QuartziteBase QUARTZITE_STACKED = new QuartziteBase("quartzite_stacked");
	public static QuartziteBase QUARTZITE_TILES = new QuartziteBase("quartzite_tiles");
	
	public static void register(IForgeRegistry<Block> registry) {
		
		registry.registerAll(QUARTZITE, QUARTZITE_BRICKS, QUARTZITE_DARK, QUARTZITE_LAYERS, QUARTZITE_PILLAR, QUARTZITE_POLISHED,
				QUARTZITE_PRISM, QUARTZITE_SPIRAL, QUARTZITE_STACKED, QUARTZITE_TILES);
	}
	
	public static void registerModels() {
		
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
	}
	
	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		
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
	}
	
}