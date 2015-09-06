package com.suatae.mechinasmagick.common.item.ironseed;

import java.util.List;
import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.FruitBase;
import com.suatae.mechinasmagick.common.item.goldseed.GoldAncientFruit;





public class IronAncientFruit extends FruitBase {

	public static int	Heal		= 20;
	public static float	Sat			= 5.5F;

	public static int	Potion1		= 17;
	public static int	Duration1	= 1000;
	public static int	Amp1		= 10;
	public static int	Prob1		= 100;

	public static int	Potion2		= 21;
	public static int	Duration2	= 1200;
	public static int	Amp2		= 14;
	public static int	Prob2		= 100;

	public static int	Potion3		= 12;
	public static int	Duration3	= 1200;
	public static int	Amp3		= 6;
	public static int	Prob3		= 100;

	public static int	Potion4		= 11;
	public static int	Duration4	= 1200;
	public static int	Amp4		= 2;
	public static int	Prob4		= 100;

	public static int	Potion5		= 5;
	public static int	Duration5	= 1200;
	public static int	Amp5		= 4;
	public static int	Prob5		= 100;

	public IronAncientFruit() {
		super(Heal, Sat);
		this.setAlwaysEdible();
		this.setUnlocalizedName(REF.NAME.ITEM.FRUITI);
		maxStackSize = 8;
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {

		Random ran = new Random();

		int slow = 2;
		int nausea = 9;
		int blind = 15;
		int hunger = 17;
		int weak = 18;
		int poison = 19;

		if (!world.isRemote && player.isPotionActive(GoldAncientFruit.Potion2) == true
				&& player.isPotionActive(GoldAncientFruit.Potion3) == true
				&& player.isPotionActive(GoldAncientFruit.Potion4) == true
				&& player.isPotionActive(GoldAncientFruit.Potion5) == true) {
			player.clearActivePotions();
			player.addPotionEffect(new PotionEffect(slow, 200 + ran.nextInt(1000) * 20, ran
					.nextInt(5)));
			player.addPotionEffect(new PotionEffect(nausea, 200 + ran.nextInt(1000) * 20, ran
					.nextInt(5)));
			player.addPotionEffect(new PotionEffect(blind, 200 + ran.nextInt(1000) * 20, ran
					.nextInt(5)));
			player.addPotionEffect(new PotionEffect(hunger, 200 + ran.nextInt(1000) * 20, ran
					.nextInt(5)));
			player.addPotionEffect(new PotionEffect(weak, 200 + ran.nextInt(1000) * 20, ran
					.nextInt(5)));
			player.addPotionEffect(new PotionEffect(poison, 200 + ran.nextInt(1000) * 20, ran
					.nextInt(5)));
		}
		else {
			if (!world.isRemote && this.Potion1 > 0 && world.rand.nextFloat() < this.Prob1) {
				player.addPotionEffect(new PotionEffect(this.Potion1, this.Duration1 * 20,
						this.Amp1));
			}
			if (!world.isRemote && this.Potion2 > 0 && world.rand.nextFloat() < this.Prob2) {
				player.addPotionEffect(new PotionEffect(this.Potion2, this.Duration2 * 20,
						this.Amp2));
			}
			if (!world.isRemote && this.Potion3 > 0 && world.rand.nextFloat() < this.Prob3) {
				player.addPotionEffect(new PotionEffect(this.Potion3, this.Duration3 * 20,
						this.Amp3));
			}
			if (!world.isRemote && this.Potion4 > 0 && world.rand.nextFloat() < this.Prob4) {
				player.addPotionEffect(new PotionEffect(this.Potion4, this.Duration4 * 20,
						this.Amp4));
			}
			if (!world.isRemote && this.Potion5 > 0 && world.rand.nextFloat() < this.Prob5) {
				player.addPotionEffect(new PotionEffect(this.Potion5, this.Duration5 * 20,
						this.Amp5));
			}
		}
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(EnumChatFormatting.BLUE + "-Hunger");
		list.add(EnumChatFormatting.BLUE + "-Health Boost");
		list.add(EnumChatFormatting.BLUE + "-Strength");
		list.add(EnumChatFormatting.BLUE + "-Resistance III");
		list.add(EnumChatFormatting.BLUE + "-Fire Resistance");
	}
}
