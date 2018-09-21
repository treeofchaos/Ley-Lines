package tree_of_chaos.leylines.items;
import tree_of_chaos.leylines.LeyLines;
import tree_of_chaos.leylines.init.ItemInit;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
//import tree_of_chaos.leylines.items.ItemBase;
//import tree_of_chaos.leylines.util.handlers.RegistryHandler;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
public class AljahimBow extends ItemBow
{
	public static final String NAME = "AljahimBow";
	private int drawTime = 14;
	private float damageBonus = 0f;
	private float forceMultiplier = 1.5f;
	private float fovMultiplier = .45f;
	
	public AljahimBow() 
	{
		setUnlocalizedName(NAME);
		setRegistryName(NAME);
		setCreativeTab(LeyLines.leylinestab);
		setMaxDamage(800);
		setHasSubtypes(false);
	}

	public static AljahimBow create() {
		AljahimBow res = new AljahimBow();
		MinecraftForge.EVENT_BUS.register(res);
		return res;
	}
    public void initModel()
    {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
    

	public void onPlayerStoppedUsing(ItemStack stack, World worldIn, EntityLivingBase entityLiving, int timeLeft) {

		if (! (entityLiving instanceof EntityPlayer)) {
			return;
		}
		EntityPlayer entityplayer = (EntityPlayer) entityLiving;
		boolean hasInfinateArrows = entityplayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantments.INFINITY, stack) > 0;
		ItemStack itemstack = getArrowsToShoot(entityplayer);
		int draw = getMaxItemUseDuration(stack) - timeLeft;
		draw = ForgeEventFactory.onArrowLoose(stack, worldIn, (EntityPlayer) entityLiving, draw, itemstack != null || hasInfinateArrows);
		if (draw < 0){
			return;
		}

		if(itemstack == null && hasInfinateArrows) {
			itemstack = new ItemStack(Items.ARROW);
		}

		if (itemstack == null) {
			return;
		}

		float drawRatio = getArrowVelocity(draw);
		if (drawRatio >= 0.1) {
			boolean arrowIsInfinite = hasInfinateArrows && itemstack.getItem() instanceof ItemArrow;
			if (!worldIn.isRemote) {
				ItemArrow itemarrow = (ItemArrow) ((ItemArrow) (itemstack.getItem() instanceof ItemArrow ? itemstack.getItem() : Items.ARROW));
				EntityArrow entityarrow = itemarrow.createArrow(worldIn, itemstack, entityplayer);
				//TODO: 1.9 Arrows dont fly straight with higher force 
				//	        entityarrow.func_184547_a(entityplayer, entityplayer.rotationPitch, entityplayer.rotationYaw, 0.0F, drawRatio * 3.0F * forceMultiplier, 1.0F);
				//((Object) entityarrow).setAim(entityplayer, entityplayer.rotationPitch, entityplayer.rotationYaw, 0.0F, drawRatio * (3.0F + forceMultiplier), 0.25F);
				//entityarrow.setVelocity(x, y, z);


				if (drawRatio == 1.0F) {
					entityarrow.setIsCritical(true);
				}
				int powerLevel = EnchantmentHelper.getEnchantmentLevel(Enchantments.POWER, stack);
				if (powerLevel > 0) {
					entityarrow.setDamage(entityarrow.getDamage() + (double) powerLevel * 0.5D + 0.5D);
				}
				int knockBack = EnchantmentHelper.getEnchantmentLevel(Enchantments.PUNCH, stack);
				if (knockBack > 0) {
					entityarrow.setKnockbackStrength(knockBack);
				}
				if (EnchantmentHelper.getEnchantmentLevel(Enchantments.FLAME, stack) > 0) {
					entityarrow.setFire(100);
				}

				stack.damageItem(1, entityplayer);

				if (arrowIsInfinite) {
					entityarrow.pickupStatus = EntityArrow.PickupStatus.CREATIVE_ONLY;
				}

				entityarrow.setDamage(entityarrow.getDamage() + damageBonus + 20);

				worldIn.spawnEntity(entityarrow);
			}

			worldIn.playSound((EntityPlayer) null, entityplayer.posX, entityplayer.posY, entityplayer.posZ, SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.NEUTRAL,
					1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + drawRatio * 0.5F);

			if (!arrowIsInfinite) {
				itemstack.shrink(1);
				if (itemstack.isEmpty()) {
					entityplayer.inventory.deleteStack(itemstack);
				}
			}
			entityplayer.addStat(StatList.getObjectUseStats(this));
		}

	}

	private ItemStack getArrowsToShoot(EntityPlayer player) {
		if (isArrow(player.getHeldItem(EnumHand.OFF_HAND))) {
			return player.getHeldItem(EnumHand.OFF_HAND);
		} else if (isArrow(player.getHeldItem(EnumHand.MAIN_HAND))) {
			return player.getHeldItem(EnumHand.MAIN_HAND);
		} else {
			for (int i = 0; i < player.inventory.getSizeInventory(); ++i) {
				ItemStack itemstack = player.inventory.getStackInSlot(i);
				if (isArrow(itemstack)) {
					return itemstack;
				}
			}
			return null;
		}
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onFovUpdateEvent(FOVUpdateEvent fovEvt) {
		ItemStack currentItem = fovEvt.getEntity().getHeldItemMainhand();
		if(currentItem == null || currentItem.getItem() != this || fovEvt.getEntity().getItemInUseCount() <= 0) {
			return;
		}

		int drawDuration = getMaxItemUseDuration(currentItem) - fovEvt.getEntity().getItemInUseCount();
		float ratio = drawDuration / (float) getDrawTime();

		if(ratio > 1.0F) {
			ratio = 1.0F;
		} else {
			ratio *= ratio;
		}
		fovEvt.setNewfov((1.0F - ratio * fovMultiplier));

	}

	@Override
	public int getMaxItemUseDuration(ItemStack p_77626_1_) {
		return 72000;
	}

	/**
	 * returns the action that specifies what animation to play when the items is
	 * being used
	 */
	@Override
	public EnumAction getItemUseAction(ItemStack p_77661_1_) {    
		return EnumAction.BOW;
	}

	@Override
	public int getItemEnchantability() {
		return 1;
	}

	public int getDrawTime() {
		return drawTime;
	}

	public void setDrawTime(int drawTime) {
		this.drawTime = drawTime;
	}

}

