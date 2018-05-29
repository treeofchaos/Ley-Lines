package com.tree_of_chaos.LeyLines.particles;
import com.tree_of_chaos.LeyLines.util.Reference;
import net.minecraft.client.particle.Particle;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
public class BasicFog extends Particle
{
	private final ResourceLocation fire = new ResourceLocation(Reference.MOD_ID, "effects/basic_fog");
	
	public BasicFog(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeedIn, double ySpeedIn,
			double zSpeedIn) {
		super(worldIn, xCoordIn, yCoordIn, zCoordIn, xSpeedIn, ySpeedIn, zSpeedIn);
	}
}
