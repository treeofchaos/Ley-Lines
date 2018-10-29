package tree_of_chaos.leylines.blocks.tileentities;

import java.util.Collection;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import tree_of_chaos.leylines.LeyLines;
import tree_of_chaos.leylines.multiblock.IMaster;

public class ConduitCore extends BlockTileEntity implements IMaster
{
	
	String name;
	
	public ConduitCore(String name) {
		super(Material.ROCK, "conduitcore");
		this.name = name;
		setUnlocalizedName(name);
	    setRegistryName(name);
		setSoundType(SoundType.STONE);
		setHardness(5.0f);
		setResistance(16000.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.0f);
		setCreativeTab(LeyLines.leylinestab);
	}
	
    @SideOnly(Side.CLIENT)
    public void initModel() 
    {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
    
    public void registerItemModel(Item item) {
    	LeyLines.proxy.registerItemRenderer(item, 0, name);
    }

	@Override
	public void breakBlock(World world, BlockPos pos, IBlockState state, EntityPlayer player) 
	{
		
	}

	@Override
	public boolean activate(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand,
			EnumFacing face, float hitX, float hitY, float hitZ) 
	{
		return false;
	}

	@Override
	public Collection<BlockPos> getSlaves() 
	{
		return null;
	}

	@Override
	public void addSlave(BlockPos p) 
	{
		
	}

	@Override
	public <T> T getCapability(Capability<T> c, EnumFacing face, BlockPos pos) 
	{
		return null;
	}

	@Override
	public boolean hasCapability(Capability c, EnumFacing face, BlockPos pos) 
	{
		return false;
	}

	@Override
	public Class getTileEntityClass() 
	{
		return null;
	}

	@Override
	public TileEntity createTileEntity(World world, IBlockState state) 
	{
		return null;
	} 
}
