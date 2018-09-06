package tree_of_chaos.leylines.blocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import tree_of_chaos.leylines.LeyLines;
public class TaqaSand extends Block
{
	public TaqaSand() 
	{
		super(Material.SAND);
		setCreativeTab(LeyLines.creativeTab);
		setUnlocalizedName(LeyLines.MODID + ".taqa_sand");
		setRegistryName("taqa_sand");
	}
    public void initModel() 
    {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
