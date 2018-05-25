package com.tree_of_chaos.LeyLines.rendering;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.util.EnumFacing;

public class RenderFog 
{
	private static final Quad[] quads = new Quad[] 
			{
					new Quad(new Vt(0, 0, 0), new Vt(1, 0, 0), new Vt(1, 0, 1), new Vt(0, 0, 1)),       // DOWN
					new Quad(new Vt(0, 1, 1), new Vt(1, 1, 1), new Vt(1, 1, 0), new Vt(0, 1, 0)),       // UP
					new Quad(new Vt(1, 1, 0), new Vt(1, 0, 0), new Vt(0, 0, 0), new Vt(0, 1, 0)),       // NORTH
					new Quad(new Vt(1, 0, 1), new Vt(1, 1, 1), new Vt(0, 1, 1), new Vt(0, 0, 1)),       // SOUTH
					new Quad(new Vt(0, 0, 1), new Vt(0, 1, 1), new Vt(0, 1, 0), new Vt(0, 0, 0)),       // WEST
					new Quad(new Vt(1, 0, 0), new Vt(1, 1, 0), new Vt(1, 1, 1), new Vt(1, 0, 1)),       // EAST
			};

	public static void addSideFullTexture(BufferBuilder buffer, int side, float mult, float offset, int alpha) 
	{
		int brightness = 240;
		int b1 = brightness >> 16 & 65535;
		int b2 = brightness & 65535;
		float u1 = 0;
		float v1 = 0;
		float u2 = 1;
		float v2 = 1;
		Quad quad = quads[side];
		buffer.pos(quad.v1.x * mult + offset, quad.v1.y * mult + offset, quad.v1.z * mult + offset).tex(u1, v1).lightmap(b1, b2).color(255, 255, 255, alpha).endVertex();
		buffer.pos(quad.v2.x * mult + offset, quad.v2.y * mult + offset, quad.v2.z * mult + offset).tex(u1, v2).lightmap(b1, b2).color(255, 255, 255, alpha).endVertex();
		buffer.pos(quad.v3.x * mult + offset, quad.v3.y * mult + offset, quad.v3.z * mult + offset).tex(u2, v2).lightmap(b1, b2).color(255, 255, 255, alpha).endVertex();
		buffer.pos(quad.v4.x * mult + offset, quad.v4.y * mult + offset, quad.v4.z * mult + offset).tex(u2, v1).lightmap(b1, b2).color(255, 255, 255, alpha).endVertex();
	}

	private static class Vt 
	{
		public final float x;
		public final float y;
		public final float z;

		public Vt(float x, float y, float z) 
		{
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}

	private static class Quad 
	{
		public final Vt v1;
		public final Vt v2;
		public final Vt v3;
		public final Vt v4;

		public Quad(Vt v1, Vt v2, Vt v3, Vt v4) 
		{
			this.v1 = v1;
			this.v2 = v2;
			this.v3 = v3;
			this.v4 = v4;
		}

		public Quad rotate(EnumFacing direction) 
		{
			switch (direction) 
			{
			case NORTH: return new Quad(v4, v1, v2, v3);
			case EAST: return new Quad(v3, v4, v1, v2);
			case SOUTH: return new Quad(v2, v3, v4, v1);
			case WEST: return this;
			default: return this;
			}
		}
	}
}
