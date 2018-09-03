package com.tree_of_chaos.LeyLines.util;
import org.apache.logging.log4j.Level;
import com.tree_of_chaos.LeyLines.LeyLines;
import com.tree_of_chaos.LeyLines.proxy.CommonProxy;
import net.minecraftforge.common.config.Configuration;

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

   