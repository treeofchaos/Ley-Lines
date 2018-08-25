package com.tree_of_chaos.LeyLines;
import com.tree_of_chaos.LeyLines.blocks.AljahimBlock;
import com.tree_of_chaos.LeyLines.blocks.Conduit;
import com.tree_of_chaos.LeyLines.blocks.ConduitCore;
import com.tree_of_chaos.LeyLines.blocks.ForgeCore;
import com.tree_of_chaos.LeyLines.blocks.InfusionCore;
import com.tree_of_chaos.LeyLines.blocks.NodeCore;
import com.tree_of_chaos.LeyLines.blocks.QuaBlock;
import com.tree_of_chaos.LeyLines.blocks.QuartziteBlock;
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
public class ModBlocks 
{
    @GameRegistry.ObjectHolder("leylines:conduit")
    public static Conduit conduit;
    
    @GameRegistry.ObjectHolder("leylines:taqa_ore")
    public static TaqaOreBlock taqaoreblock;
    
    @GameRegistry.ObjectHolder("leylines:aljahim_block")
    public static AljahimBlock aljahimblock;
    
    @GameRegistry.ObjectHolder("leylines:qua_block")
    public static QuaBlock quablock;
    
    @GameRegistry.ObjectHolder("leylines:rwh_block")
    public static RwhBlock rwhblock;
    
    @GameRegistry.ObjectHolder("leylines:quartzite")
    public static QuartziteBlock quartziteblock;
    
    @GameRegistry.ObjectHolder("leylines:quartzite_bricks")
    public static QuartziteBricks quartzitebricks;
    
    @GameRegistry.ObjectHolder("leylines:quartzite_chiseled")
    public static QuartziteChiseled quartzitechiseled;
    
    @GameRegistry.ObjectHolder("leylines:quartzite_pillar")
    public static QuartzitePillar quartzitepillar;
    
    @GameRegistry.ObjectHolder("leylines:quartzite_polished")
    public static QuartzitePolished quartzitepolished;
    
    @GameRegistry.ObjectHolder("leylines:quartzite_prism")
    public static QuartzitePrism quartziteprism;
    
    @GameRegistry.ObjectHolder("leylines:quartzite_tiles")
    public static QuartziteTiles quartzitetiles;
    
    @GameRegistry.ObjectHolder("leylines:quartzite_layers")
    public static QuartziteLayers quartzitelayers;
    
    @GameRegistry.ObjectHolder("leylines:quartzite_stacked")
    public static QuartziteStacked quartzitestacked;
    //============================================================
    @GameRegistry.ObjectHolder("leylines:quartzite_spiral")
    public static QuartziteSpiral quartzitespiral;
    
    @GameRegistry.ObjectHolder("leylines:quartzite_dark")
    public static QuartziteDark quartzitedark;
    
    @GameRegistry.ObjectHolder("leylines:ritual_core")
    public static RitualCore ritualcore;
    
    @GameRegistry.ObjectHolder("leylines:infusion_core")
    public static InfusionCore infusioncore;
    
    @GameRegistry.ObjectHolder("leylines:forge_core")
    public static ForgeCore forgecore;
    
    @GameRegistry.ObjectHolder("leylines:node_core")
    public static NodeCore nodecore;
    
    @GameRegistry.ObjectHolder("leylines:conduit_core")
    public static ConduitCore conduitcore;

/*	Taqa Sand
	Taqa Glass
	//Misc. Blocks
	public static final Block HELL_ROD = new HellRod("hell_rod");*/
}