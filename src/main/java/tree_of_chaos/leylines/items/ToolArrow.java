package tree_of_chaos.leylines.items;
import tree_of_chaos.leylines.init.BlockInit;
import tree_of_chaos.leylines.init.ItemInit;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
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
    public void initModel()
    {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
	public void registerModels() 
	{
		LeyLines.proxy.registerItemRenderer(this,0,"inventory");
	}
}
