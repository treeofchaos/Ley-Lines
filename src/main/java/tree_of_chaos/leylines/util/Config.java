package tree_of_chaos.leylines.util;
import org.apache.logging.log4j.Level;

import net.minecraftforge.common.config.Configuration;
import tree_of_chaos.leylines.LeyLines;
import tree_of_chaos.leylines.proxy.CommonProxy;

public class Config {

    private static final String CATEGORY_GENERAL = "general";
    private static final String CATEGORY_DIMENSIONS = "dimensions";

    public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
            initDimensionConfig(cfg);
        } catch (Exception e1) {
            LeyLines.logger.log(Level.ERROR, "Problem loading config file!", e1);
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

    private static void initGeneralConfig(Configuration cfg) 
    {

    }

    private static void initDimensionConfig(Configuration cfg) 
    {
        cfg.addCustomCategoryComment(CATEGORY_DIMENSIONS, "Dimension configuration");
    }
}

   