package com.suatae.mechinasmagick.common.item.goldseed;

import java.util.List;
import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.FruitBase;
import com.suatae.mechinasmagick.common.item.ironseed.IronAncientFruit;





public class GoldAncientFruit extends FruitBase {

	public static int	Heal		= 0;
	public static float	Sat			= 0.0F;

	public static int	Potion1		= 18;
	public static int	Duration1	= 1000;
	public static int	Amp1		= 5;
	public static int	Prob1		= 100;

	public static int	Potion2		= 16;
	public static int	Duration2	= 1200;
	public static int	Amp2		= 4;
	public static int	Prob2		= 100;

	public static int	Potion3		= 3;
	public static int	Duration3	= 1200;
	public static int	Amp3		= 5;
	public static int	Prob3		= 100;

	public static int	Potion4		= 1;
	public static int	Duration4	= 1200;
	public static int	Amp4		= 2;
	public static int	Prob4		= 100;

	public static int	Potion5		= 8;
	public static int	Duration5	= 1200;
	public static int	Amp5		= 1;
	public static int	Prob5		= 100;

	public GoldAncientFruit() {
		super(Heal, Sat);
		this.setAlwaysEdible();
		this.setUnlocalizedName(REF.NAME.ITEM.FRUITG);
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

		if (!world.isRemote && player.isPotionActive(IronAncientFruit.Potion2) == true
				&& player.isPotionActive(IronAncientFruit.Potion3) == true
				&& player.isPotionActive(IronAncientFruit.Potion4) == true
				&& player.isPotionActive(IronAncientFruit.Potion5) == true) {
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
		list.add(EnumChatFormatting.BLUE + "-Speed III");
		list.add(EnumChatFormatting.BLUE + "-Weakness");
		list.add(EnumChatFormatting.BLUE + "-Haste");
		list.add(EnumChatFormatting.BLUE + "-Jump Boost II");
		list.add(EnumChatFormatting.BLUE + "-Night Vision");
	}
}
