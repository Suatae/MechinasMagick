package com.suatae.mechinasmagick.utility;

import java.util.Iterator;
import java.util.List;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;





public class RecipeRemover {

	public static void voidRecipe() {
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();

		Iterator<IRecipe> remover = recipes.iterator();

		while (remover.hasNext()) {
			ItemStack itemstack = remover.next().getRecipeOutput();
			if (itemstack != null && itemstack.getItem() == Items.stick)
				remover.remove();
		}
	}

}
