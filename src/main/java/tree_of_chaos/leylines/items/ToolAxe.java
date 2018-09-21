package tree_of_chaos.leylines.items;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.client.model.ModelLoader;
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

