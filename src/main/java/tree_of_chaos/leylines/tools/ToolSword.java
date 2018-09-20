package tree_of_chaos.leylines.tools;
import net.minecraft.item.ItemSword;
import tree_of_chaos.leylines.LeyLines;
import tree_of_chaos.leylines.init.ItemInit;
import tree_of_chaos.leylines.util.IHasModel;
public class ToolSword extends ItemSword implements IHasModel
{
	public ToolSword(String name, ToolMaterial material)
	{
		super(material);
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
