package com.suatae.mechinasmagick.common.core.handler;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import com.suatae.mechinasmagick.common.init.registry.BlockReg;
import com.suatae.mechinasmagick.utility.ConfigUtil;

import cpw.mods.fml.common.registry.GameRegistry;





public class BasicCraftingHandler {
	static ItemStack	StoneRoad	= new ItemStack(BlockReg.blockRoadStone);
	static ItemStack	StoneSlab	= new ItemStack(BlockReg.blockRoadStoneSlab);
	static ItemStack	StoneSlab4	= new ItemStack(BlockReg.blockRoadStoneSlab, 4);
	static ItemStack	DirtRoad	= new ItemStack(BlockReg.blockRoaddirt);
	static ItemStack	DirtSlab	= new ItemStack(BlockReg.blockRoaddirtSlab);
	static ItemStack	DirtSlab4	= new ItemStack(BlockReg.blockRoaddirtSlab, 4);
	static ItemStack	Cobble		= new ItemStack(Blocks.cobblestone);
	static ItemStack	Dirt		= new ItemStack(Blocks.dirt);
	static ItemStack	Gravel		= new ItemStack(Blocks.gravel);
	static ItemStack	Sand		= new ItemStack(Blocks.sand);

	public static void shapedRecipes() {
		if (ConfigUtil.RoadModule) {
			GameRegistry.addShapedRecipe(StoneRoad,
					new Object[] { "# #", " # ", "# #", '#', Cobble });
			GameRegistry.addShapedRecipe(DirtRoad, new Object[] { "# #", " # ", "# #", '#', Dirt });
		}
		else {

		}

		if (ConfigUtil.CompressedModule) {
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockCobble, 1, 0), new Object[] {
					"###", "###", "###", '#', Cobble });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockCobble, 1, 1), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockCobble, 1, 0) });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockCobble, 1, 2), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockCobble, 1, 1) });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockCobble, 1, 3), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockCobble, 1, 2) });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockCobble, 1, 4), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockCobble, 1, 3) });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockCobble, 1, 5), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockCobble, 1, 4) });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockCobble, 1, 6), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockCobble, 1, 5) });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockCobble, 1, 7), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockCobble, 1, 6) });

			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockDirt, 1, 0), new Object[] {
					"###", "###", "###", '#', Dirt });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockDirt, 1, 1), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockDirt, 1, 0) });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockDirt, 1, 2), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockDirt, 1, 1) });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockDirt, 1, 3), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockDirt, 1, 2) });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockDirt, 1, 4), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockDirt, 1, 3) });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockDirt, 1, 5), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockDirt, 1, 4) });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockDirt, 1, 6), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockDirt, 1, 5) });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockDirt, 1, 7), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockDirt, 1, 6) });

			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockGravel, 1, 0), new Object[] {
					"###", "###", "###", '#', Gravel });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockGravel, 1, 1), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockGravel, 1, 0) });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockGravel, 1, 2), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockGravel, 1, 1) });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockGravel, 1, 3), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockGravel, 1, 2) });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockGravel, 1, 4), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockGravel, 1, 3) });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockGravel, 1, 5), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockGravel, 1, 4) });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockGravel, 1, 6), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockGravel, 1, 5) });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockGravel, 1, 7), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockGravel, 1, 6) });

			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockSand, 1, 0), new Object[] {
					"###", "###", "###", '#', Sand });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockSand, 1, 1), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockSand, 1, 0) });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockSand, 1, 2), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockSand, 1, 1) });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockSand, 1, 3), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockSand, 1, 2) });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockSand, 1, 4), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockSand, 1, 3) });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockSand, 1, 5), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockSand, 1, 4) });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockSand, 1, 6), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockSand, 1, 5) });
			GameRegistry.addShapedRecipe(new ItemStack(BlockReg.blockSand, 1, 7), new Object[] {
					"###", "###", "###", '#', new ItemStack(BlockReg.blockSand, 1, 6) });
		}
		else {

		}
	}

	public static void shapelessRecipes() {
		if (ConfigUtil.RoadModule) {
			GameRegistry.addShapelessRecipe(StoneSlab4, new Object[] { StoneRoad, StoneRoad });
			GameRegistry.addShapelessRecipe(StoneRoad, new Object[] { StoneSlab, StoneSlab });
			GameRegistry.addShapelessRecipe(DirtSlab4, new Object[] { DirtRoad, DirtRoad });
			GameRegistry.addShapelessRecipe(DirtRoad, new Object[] { DirtSlab, DirtSlab });
		}
		else {

		}

		if (ConfigUtil.CompressedModule) {
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockCobble, 9, 6),
					new Object[] { new ItemStack(BlockReg.blockCobble, 1, 7) });
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockCobble, 9, 5),
					new Object[] { new ItemStack(BlockReg.blockCobble, 1, 6) });
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockCobble, 9, 4),
					new Object[] { new ItemStack(BlockReg.blockCobble, 1, 5) });
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockCobble, 9, 3),
					new Object[] { new ItemStack(BlockReg.blockCobble, 1, 4) });
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockCobble, 9, 2),
					new Object[] { new ItemStack(BlockReg.blockCobble, 1, 3) });
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockCobble, 9, 1),
					new Object[] { new ItemStack(BlockReg.blockCobble, 1, 2) });
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockCobble, 9, 0),
					new Object[] { new ItemStack(BlockReg.blockCobble, 1, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 9, 0),
					new Object[] { new ItemStack(BlockReg.blockCobble, 1, 0) });

			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockDirt, 9, 6),
					new Object[] { new ItemStack(BlockReg.blockDirt, 1, 7) });
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockDirt, 9, 5),
					new Object[] { new ItemStack(BlockReg.blockDirt, 1, 6) });
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockDirt, 9, 4),
					new Object[] { new ItemStack(BlockReg.blockDirt, 1, 5) });
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockDirt, 9, 3),
					new Object[] { new ItemStack(BlockReg.blockDirt, 1, 4) });
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockDirt, 9, 2),
					new Object[] { new ItemStack(BlockReg.blockDirt, 1, 3) });
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockDirt, 9, 1),
					new Object[] { new ItemStack(BlockReg.blockDirt, 1, 2) });
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockDirt, 9, 0),
					new Object[] { new ItemStack(BlockReg.blockDirt, 1, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.dirt, 9, 0),
					new Object[] { new ItemStack(BlockReg.blockDirt, 1, 0) });

			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockGravel, 9, 6),
					new Object[] { new ItemStack(BlockReg.blockGravel, 1, 7) });
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockGravel, 9, 5),
					new Object[] { new ItemStack(BlockReg.blockGravel, 1, 6) });
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockGravel, 9, 4),
					new Object[] { new ItemStack(BlockReg.blockGravel, 1, 5) });
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockGravel, 9, 3),
					new Object[] { new ItemStack(BlockReg.blockGravel, 1, 4) });
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockGravel, 9, 2),
					new Object[] { new ItemStack(BlockReg.blockGravel, 1, 3) });
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockGravel, 9, 1),
					new Object[] { new ItemStack(BlockReg.blockGravel, 1, 2) });
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockGravel, 9, 0),
					new Object[] { new ItemStack(BlockReg.blockGravel, 1, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.gravel, 9, 0),
					new Object[] { new ItemStack(BlockReg.blockGravel, 1, 0) });

			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockSand, 9, 6),
					new Object[] { new ItemStack(BlockReg.blockSand, 1, 7) });
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockSand, 9, 5),
					new Object[] { new ItemStack(BlockReg.blockSand, 1, 6) });
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockSand, 9, 4),
					new Object[] { new ItemStack(BlockReg.blockSand, 1, 5) });
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockSand, 9, 3),
					new Object[] { new ItemStack(BlockReg.blockSand, 1, 4) });
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockSand, 9, 2),
					new Object[] { new ItemStack(BlockReg.blockSand, 1, 3) });
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockSand, 9, 1),
					new Object[] { new ItemStack(BlockReg.blockSand, 1, 2) });
			GameRegistry.addShapelessRecipe(new ItemStack(BlockReg.blockSand, 9, 0),
					new Object[] { new ItemStack(BlockReg.blockSand, 1, 1) });
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sand, 9, 0),
					new Object[] { new ItemStack(BlockReg.blockSand, 1, 0) });
		}
		else {

		}

	}

	public static void smeltingRecipes() {
		if (ConfigUtil.DirtModule) {
			GameRegistry.addSmelting(Blocks.dirt, new ItemStack(BlockReg.blockHardenedDirt), 0F);
		}
		else {

		}
	}

}
