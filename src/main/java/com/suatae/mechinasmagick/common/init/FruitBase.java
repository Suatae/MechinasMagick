package com.suatae.mechinasmagick.common.init;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;
import com.suatae.mechinasmagick.common.core.lib.REF;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;





public class FruitBase extends ItemFood {

	public FruitBase(int HealAmount, float SaturationModifier) {
		super(HealAmount, SaturationModifier, true);
		this.setCreativeTab(MechinasTabs.MechinasMagick_TAB);

	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack itemstack) {
		return true;
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
