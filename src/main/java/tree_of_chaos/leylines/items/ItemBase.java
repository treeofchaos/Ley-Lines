/*package tree_of_chaos.leylines.items;
package tree_of_chaos.leylines.items;
import tree_of_chaos.leylines.Main;
import tree_of_chaos.leylines.ModItems;
=======
package tree_of_chaos.leylines.items;

import tree_of_chaos.leylines.LeyLines;
import tree_of_chaos.leylines.init.ItemInit;
>>>>>>> baad867cec43757789cd4a625303389532781520
import tree_of_chaos.leylines.util.IHasModel;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(LeyLines.leylinestab);
		ItemInit.ITEMS.add(this);
	}
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
	@Override
	public void registerModels() 
	{
		
	}
}*/