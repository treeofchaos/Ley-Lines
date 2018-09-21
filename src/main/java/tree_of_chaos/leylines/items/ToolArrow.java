package tree_of_chaos.leylines.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemArrow;
import net.minecraftforge.client.model.ModelLoader;
import tree_of_chaos.leylines.LeyLines;

	public class ToolArrow extends ItemArrow
	{
		public ToolArrow(String name)
		{
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(LeyLines.leylinestab);	
		}
		public void registerModels() 
		{
			LeyLines.proxy.registerItemRenderer(this,0,"inventory");
		}
	    public void initModel()
	    {
	        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	    }
	}

