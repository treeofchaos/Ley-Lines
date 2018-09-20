package tree_of_chaos.leylines.tools;
import net.minecraft.item.ItemAxe;
import tree_of_chaos.leylines.LeyLines;
import tree_of_chaos.leylines.init.ItemInit;
import tree_of_chaos.leylines.util.IHasModel;
public class ToolAxe extends ItemAxe implements IHasModel
{
	public ToolAxe(String name, ToolMaterial material)
	{
		super(material, 8.0f, -3.0f);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(LeyLines.leylinestab);
		ItemInit.ITEMS.add(this);	
	}
	public void registerModels() 
	{
		LeyLines.proxy.registerItemRenderer(this,0,"inventory");
	}
}

