package tree_of_chaos.leylines.tools;

import net.minecraft.item.ItemArrow;
import tree_of_chaos.leylines.LeyLines;
import tree_of_chaos.leylines.util.IHasModel;
public class ToolArrow extends ItemArrow implements IHasModel
{
	public ToolArrow(String name, ToolMaterial material)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(LeyLines.leylinestab);
		
	}
	public void registerModels() 
	{
		LeyLines.proxy.registerItemRenderer(this,0,"inventory");
	}
}
