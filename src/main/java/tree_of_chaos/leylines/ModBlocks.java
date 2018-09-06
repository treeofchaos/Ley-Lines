package tree_of_chaos.leylines;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import tree_of_chaos.leylines.blocks.AljahimBlock;
import tree_of_chaos.leylines.blocks.Conduit;
import tree_of_chaos.leylines.blocks.ConduitCore;
import tree_of_chaos.leylines.blocks.ForgeCore;
import tree_of_chaos.leylines.blocks.InfusionCore;
import tree_of_chaos.leylines.blocks.NodeCore;
import tree_of_chaos.leylines.blocks.QuaBlock;
import tree_of_chaos.leylines.blocks.Quartzite;
import tree_of_chaos.leylines.blocks.QuartziteBricks;
import tree_of_chaos.leylines.blocks.QuartziteChiseled;
import tree_of_chaos.leylines.blocks.QuartziteDark;
import tree_of_chaos.leylines.blocks.QuartziteLayers;
import tree_of_chaos.leylines.blocks.QuartzitePillar;
import tree_of_chaos.leylines.blocks.QuartzitePolished;
import tree_of_chaos.leylines.blocks.QuartzitePrism;
import tree_of_chaos.leylines.blocks.QuartziteSpiral;
import tree_of_chaos.leylines.blocks.QuartziteStacked;
import tree_of_chaos.leylines.blocks.QuartziteTiles;
import tree_of_chaos.leylines.blocks.RitualCore;
import tree_of_chaos.leylines.blocks.RwhBlock;
import tree_of_chaos.leylines.blocks.TaqaBlock;
import tree_of_chaos.leylines.blocks.TaqaOreBlock;
import tree_of_chaos.leylines.blocks.TaqaSand;
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
    
    @GameRegistry.ObjectHolder("leylines:taqa_sand")
    public static TaqaSand taqa_sand;

/*	Taqa Sand
	Taqa Glass
	//Misc. Blocks
	public static final Block HELL_ROD = new HellRod("hell_rod");*/
    @SideOnly(Side.CLIENT)
    public static void initModels() 
    {
        aljahim_block.initModel();
        conduit.initModel();
        conduit_core.initModel();
        forge_core.initModel();
        infusion_core.initModel();
        node_core.initModel();
        qua_block.initModel();
        quartzite.initModel();
        quartzite_bricks.initModel();
        quartzite_chiseled.initModel();
        quartzite_dark.initModel();
        quartzite_layers.initModel();
        quartzite_pillar.initModel();
        quartzite_polished.initModel();
        quartzite_prism.initModel();
        quartzite_spiral.initModel();
        quartzite_stacked.initModel();
        quartzite_tiles.initModel();
        ritual_core.initModel();
        rwh_block.initModel();
        taqa_block.initModel();
        taqa_ore_block.initModel();
        taqa_sand.initModel();
    }
}