package com.suatae.mechinasmagick.common.core.handler;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;

import com.suatae.mechinasmagick.common.init.BlockReg;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;





public class BlockHarvestEventHandler {

	Random	rand	= new Random();

	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public void onBlockHarvest(HarvestDropsEvent event) {

		World world = event.world;
		int X = event.x;
		int Y = event.y;
		int Z = event.z;
		Block leaf = world.getBlock(X, Y, Z);
		Block block = event.block;

		if (block == Blocks.gravel) {
			event.drops.clear();
			event.drops.add(new ItemStack(Blocks.gravel, 1));
		}
		// if (block == Blocks.leaves) {
		// drop.add(new ItemStack(BlockReg.blockBranch, rand.nextInt(5)));
		// // this.onSheared(event);
		// }
	}

	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public void onSheared(HarvestDropsEvent event) {
		if (event.block == Blocks.leaves) {
			event.drops.clear();
		}
	}

	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public void isShearable(HarvestDropsEvent event) {

	}

	// @SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	// public void checkLeave(BlockEvent.HarvestDropsEvent event) {
	// if (event.block == Blocks.leaves) {
	// event.drops.add(new ItemStack(BlockReg.blockBranch, rand.nextInt(5)));
	// }
	// }

	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public void blockBreak(BreakEvent event) {
		Block block = event.block;
		World world = event.world;
		int X = event.x;
		int Y = event.y;
		int Z = event.z;
		if (block == Blocks.leaves) {

			world.spawnEntityInWorld(new EntityItem(world, X, Y, Z, new ItemStack(
					BlockReg.blockBranch, rand.nextInt(5))));
		}
	}
}
