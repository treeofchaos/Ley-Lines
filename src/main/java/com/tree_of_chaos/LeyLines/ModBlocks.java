package com.tree_of_chaos.LeyLines;
import com.tree_of_chaos.LeyLines.blocks.AljahimBlock;
import com.tree_of_chaos.LeyLines.blocks.Conduit;
import com.tree_of_chaos.LeyLines.blocks.ConduitCore;
import com.tree_of_chaos.LeyLines.blocks.ForgeCore;
import com.tree_of_chaos.LeyLines.blocks.InfusionCore;
import com.tree_of_chaos.LeyLines.blocks.NodeCore;
import com.tree_of_chaos.LeyLines.blocks.QuaBlock;
import com.tree_of_chaos.LeyLines.blocks.Quartzite;
import com.tree_of_chaos.LeyLines.blocks.QuartziteBricks;
import com.tree_of_chaos.LeyLines.blocks.QuartziteChiseled;
import com.tree_of_chaos.LeyLines.blocks.QuartziteDark;
import com.tree_of_chaos.LeyLines.blocks.QuartziteLayers;
import com.tree_of_chaos.LeyLines.blocks.QuartzitePillar;
import com.tree_of_chaos.LeyLines.blocks.QuartzitePolished;
import com.tree_of_chaos.LeyLines.blocks.QuartzitePrism;
import com.tree_of_chaos.LeyLines.blocks.QuartziteSpiral;
import com.tree_of_chaos.LeyLines.blocks.QuartziteStacked;
import com.tree_of_chaos.LeyLines.blocks.QuartziteTiles;
import com.tree_of_chaos.LeyLines.blocks.RitualCore;
import com.tree_of_chaos.LeyLines.blocks.RwhBlock;
import com.tree_of_chaos.LeyLines.blocks.TaqaBlock;
import com.tree_of_chaos.LeyLines.blocks.TaqaOreBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
public class ModBlocks 
{
    @GameRegistry.ObjectHolder("leylines:conduit")
    public static Conduit conduit;
    
    @GameRegistry.ObjectHolder("leylines:taqa_ore_block")
    public static TaqaOreBlock taqa_ore_block;
    
    @GameRegistry.ObjectHolder("leylines:aljahim_block")
    public static AljahimBlock aljahim_block;
    
    @GameRegistry.ObjectHolder("leylines:qua_block")
    public static QuaBlock qua_block;
    
    @GameRegistry.ObjectHolder("leylines:rwh_block")
    public static RwhBlock rwh_block;
    
    @GameRegistry.ObjectHolder("leylines:quartzite")
    public static Quartzite quartzite;
    
    @GameRegistry.ObjectHolder("leylines:quartzite_bricks")
    public static QuartziteBricks quartzite_bricks;
    
    @GameRegistry.ObjectHolder("leylines:quartzite_chiseled")
    public static QuartziteChiseled quartzite_chiseled;
    
    @GameRegistry.ObjectHolder("leylines:quartzite_pillar")
    public static QuartzitePillar quartzite_pillar;
    
    @GameRegistry.ObjectHolder("leylines:quartzite_polished")
    public static QuartzitePolished quartzite_polished;
    
    @GameRegistry.ObjectHolder("leylines:quartzite_prism")
    public static QuartzitePrism quartzite_prism;
    
    @GameRegistry.ObjectHolder("leylines:quartzite_tiles")
    public static QuartziteTiles quartzite_tiles;
    
    @GameRegistry.ObjectHolder("leylines:quartzite_layers")
    public static QuartziteLayers quartzite_layers;
    
    @GameRegistry.ObjectHolder("leylines:quartzite_stacked")
    public static QuartziteStacked quartzite_stacked;
    
    @GameRegistry.ObjectHolder("leylines:quartzite_spiral")
    public static QuartziteSpiral quartzite_spiral;
    
    @GameRegistry.ObjectHolder("leylines:quartzite_dark")
    public static QuartziteDark quartzite_dark;
    
    @GameRegistry.ObjectHolder("leylines:ritual_core")
    public static RitualCore ritual_core;
    
    @GameRegistry.ObjectHolder("leylines:infusion_core")
    public static InfusionCore infusion_core;
    
    @GameRegistry.ObjectHolder("leylines:forge_core")
    public static ForgeCore forge_core;
    
    @GameRegistry.ObjectHolder("leylines:node_core")
    public static NodeCore node_core;
    
    @GameRegistry.ObjectHolder("leylines:conduit_core")
    public static ConduitCore conduit_core;
    
    @GameRegistry.ObjectHolder("leylines:taqa_block")
    public static TaqaBlock taqa_block;

/*	Taqa Sand
	Taqa Glass
	//Misc. Blocks
	public static final Block HELL_ROD = new HellRod("hell_rod");*/
}