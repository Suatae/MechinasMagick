package com.suatae.mechinasmagick.common.init;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;
import com.suatae.mechinasmagick.common.core.lib.REF;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;





public class FruitBase extends ItemFood {
	private final int	potionId1;
	private final int	potionDuration1;
	private final int	potionAmplifier1;
	private final float	potionEffectProbability1;
	private final int	potionId2;
	private final int	potionDuration2;
	private final int	potionAmplifier2;
	private final float	potionEffectProbability2;
	private final int	potionId3;
	private final int	potionDuration3;
	private final int	potionAmplifier3;
	private final float	potionEffectProbability3;
	private final int	potionId4;
	private final int	potionDuration4;
	private final int	potionAmplifier4;
	private final float	potionEffectProbability4;
	private final int	potionId5;
	private final int	potionDuration5;
	private final int	potionAmplifier5;
	private final float	potionEffectProbability5;

	public FruitBase(int HealAmount, float SaturationModifier, int Potion01, int Duration01,
			int Amp01, float Prob01, int Potion02, int Duration02, int Amp02, float Prob02,
			int Potion03, int Duration03, int Amp03, float Prob03, int Potion04, int Duration04,
			int Amp04, float Prob04, int Potion05, int Duration05, int Amp05, float Prob05) {
		super(HealAmount, SaturationModifier, false);
		this.setCreativeTab(MechinasTabs.MechinasMagick_TAB);

		potionId1 = Potion01;
		potionDuration1 = Duration01;
		potionAmplifier1 = Amp01;
		potionEffectProbability1 = Prob01;
		potionId2 = Potion02;
		potionDuration2 = Duration02;
		potionAmplifier2 = Amp02;
		potionEffectProbability2 = Prob02;
		potionId3 = Potion03;
		potionDuration3 = Duration03;
		potionAmplifier3 = Amp03;
		potionEffectProbability3 = Prob03;
		potionId4 = Potion04;
		potionDuration4 = Duration04;
		potionAmplifier4 = Amp04;
		potionEffectProbability4 = Prob04;
		potionId5 = Potion05;
		potionDuration5 = Duration05;
		potionAmplifier5 = Amp05;
		potionEffectProbability5 = Prob05;

	}

	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		if (!world.isRemote && this.potionId1 > 0
				&& world.rand.nextFloat() < this.potionEffectProbability1) {
			player.addPotionEffect(new PotionEffect(this.potionId1, this.potionDuration1 * 20,
					this.potionAmplifier1));
		}
		if (!world.isRemote && this.potionId2 > 0
				&& world.rand.nextFloat() < this.potionEffectProbability2) {
			player.addPotionEffect(new PotionEffect(this.potionId2, this.potionDuration2 * 20,
					this.potionAmplifier2));
		}
		if (!world.isRemote && this.potionId3 > 0
				&& world.rand.nextFloat() < this.potionEffectProbability3) {
			player.addPotionEffect(new PotionEffect(this.potionId3, this.potionDuration3 * 20,
					this.potionAmplifier3));
		}
		if (!world.isRemote && this.potionId4 > 0
				&& world.rand.nextFloat() < this.potionEffectProbability4) {
			player.addPotionEffect(new PotionEffect(this.potionId4, this.potionDuration4 * 20,
					this.potionAmplifier4));
		}
		if (!world.isRemote && this.potionId5 > 0
				&& world.rand.nextFloat() < this.potionEffectProbability5) {
			player.addPotionEffect(new PotionEffect(this.potionId5, this.potionDuration5 * 20,
					this.potionAmplifier5));
		}
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("item.%s%s", REF.MOD_ID.toLowerCase() + ":",
				getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		return String.format("item.%s%s", REF.MOD_ID.toLowerCase() + ":",
				getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(
				this.getUnlocalizedName().indexOf(".") + 1));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

}
