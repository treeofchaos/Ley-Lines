package tree_of_chaos.leylines.world;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class LeyLinesWorldGen 
{
    public static void init() 
    {
        LeyLinesOreGen generator = LeyLinesOreGen.instance;
        GameRegistry.registerWorldGenerator(generator, 5);
        MinecraftForge.EVENT_BUS.register(generator);
    }
}
