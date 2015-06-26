package com.suatae.mechinasmagick.common.init;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.item.Builder;
import com.suatae.mechinasmagick.common.item.Engineer;
import com.suatae.mechinasmagick.common.item.Leaf;
import com.suatae.mechinasmagick.common.item.Mage;
import com.suatae.mechinasmagick.common.item.MalletIronSteel;
import com.suatae.mechinasmagick.common.item.MalletStone;
import com.suatae.mechinasmagick.common.item.MalletWood;
import com.suatae.mechinasmagick.common.item.PlantFiber;
import com.suatae.mechinasmagick.common.item.Seed;
import com.suatae.mechinasmagick.common.item.goldseed.GoldAncientFruit;
import com.suatae.mechinasmagick.common.item.goldseed.GoldSeedPrimed;
import com.suatae.mechinasmagick.common.item.ironseed.IronAncientFruit;
import com.suatae.mechinasmagick.common.item.ironseed.IronSeedPrimed;

import cpw.mods.fml.common.registry.GameRegistry;





@GameRegistry.ObjectHolder(REF.MOD_ID)
public class ItemReg {

	public static ToolMaterial	MMWood					= EnumHelper.addToolMaterial("Wood", 0, 59,
																0, 0.0F, 0);
	public static ToolMaterial	MMStone					= EnumHelper.addToolMaterial("Stone", 0,
																131, 0, 1.0F, 0);
	public static ToolMaterial	MMIronSteel				= EnumHelper.addToolMaterial("Copper", 0,
																250, 0, 2.0F, 0);

	// Seed
	public static final Item	itemMMSeed				= new Seed();

	// Gold Seed
	public static final Item	itemPrimedGold			= new GoldSeedPrimed();
	public static final Item	itemAncientFruitGold	= new GoldAncientFruit();

	// Iron Seed

	public static final Item	itemPrimedIron			= new IronSeedPrimed();
	public static final Item	itemAncientFruitIron	= new IronAncientFruit();

	// Tools
	public static final Item	woodMallet				= new MalletWood();
	public static final Item	stoneMallet				= new MalletStone();
	public static final Item	ironsteelMallet			= new MalletIronSteel();

	// Misc
	public static final Item	itemLeaf				= new Leaf();
	public static final Item	itemPlantFiber			= new PlantFiber();

	// Player Class
	public static final Item	itemBuilder				= new Builder();
	public static final Item	itemEngineer			= new Engineer();
	public static final Item	itemMage				= new Mage();

	public static void init() {

		// Seed
		GameRegistry.registerItem(itemMMSeed, "itemSeed");

		// Gold Seed
		GameRegistry.registerItem(itemPrimedGold, "itemSeedPrimedGold");
		GameRegistry.registerItem(itemAncientFruitGold, "fruitAncientGold");

		// Iron Seed
		GameRegistry.registerItem(itemPrimedIron, "itemSeedPrimedIron");
		GameRegistry.registerItem(itemAncientFruitIron, "fruitAncientIron");

		// Tools
		GameRegistry.registerItem(woodMallet, "woodMallet");
		GameRegistry.registerItem(stoneMallet, "stoneMallet");
		GameRegistry.registerItem(ironsteelMallet, "ironsteelMallet");

		// Misc
		GameRegistry.registerItem(itemLeaf, "itemLeaf");
		GameRegistry.registerItem(itemPlantFiber, "itemPlantFiber");

		// Player Class
		GameRegistry.registerItem(itemBuilder, "itemBuilder");
		GameRegistry.registerItem(itemEngineer, "itemEngineer");
		GameRegistry.registerItem(itemMage, "itemMage");

	}
}
