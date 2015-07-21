package com.suatae.mechinasmagick.world.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;

import com.suatae.mechinasmagick.common.core.lib.REF;

import cpw.mods.fml.common.IWorldGenerator;





public class WorldGenLavaBubble implements IWorldGenerator {
	public static Block	air			= REF.BLOCK.air;
	public static Block	lava		= REF.BLOCK.lava;
	public static Block	lava_stone	= REF.BLOCK.lavaS;

	@Override
	public void generate(Random random, int chunkx, int chunkz, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		int x = chunkx * 16;
		int z = chunkz * 16;
		switch (world.provider.dimensionId) {
			case -1:
				generateNether(world, x, z, random);
				break;
			case 0:
				generateSurface(world, x, z, random);
				break;
			case 1:
				generateEnd(world, x, z, random);
				break;
			default:
				generateSurface(world, x, z, random);
		}

	}

	private void generateNether(World world, int x, int z, Random random) {}

	private void generateSurface(World world, int x, int z, Random random) {
		// Lava Bubble
		if (random.nextInt(32) == 0) {
			int randx = x + random.nextInt(16);
			int randy = 12 + random.nextInt(38);
			int randz = z + random.nextInt(16);
			if (world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.deepOcean
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.ocean) {
				GenLavaBubble(world, randx, randy, randz);
			}
		}
	}

	private void generateEnd(World world, int x, int z, Random random) {}

	private void GenLavaBubble(World world, int x, int y, int z) {
		// Bottom-to-Top
		// Layer 1
		for (int i = 0; i < 3; i++)
			for (int ii = 0; ii < 3; ii++) {
				world.setBlock(x + 1 + -i, y, z + 1 + -ii, lava_stone, 0, 2);
				world.setBlock(x + 2, y, z, lava_stone, 0, 2);
				world.setBlock(x + -2, y, z, lava_stone, 0, 2);
				world.setBlock(x, y, z + 2, lava_stone, 0, 2);
				world.setBlock(x, y, z + -2, lava_stone, 0, 2);
			}
		// Layer 2
		for (int i = 0; i < 5; i++)
			for (int ii = 0; ii < 2; ii++)
				for (int e = 0; e < 3; e++)
					for (int ee = 0; ee < 3; ee++) {
						// Ring x
						world.setBlock(x + 3, y + 1, z + 2 + -i, lava_stone, 0, 2);
						world.setBlock(x + -3, y + 1, z + 2 + -i, lava_stone, 0, 2);
						// Ring z
						world.setBlock(x + 2 + -i, y + 1, z + 3, lava_stone, 0, 2);
						world.setBlock(x + 2 + -i, y + 1, z + -3, lava_stone, 0, 2);
						// Inner x
						world.setBlock(x + 2, y + 1, z + -2 + ii, lava_stone, 0, 2);
						world.setBlock(x + 2, y + 1, z + 1 + ii, lava_stone, 0, 2);
						world.setBlock(x + -2, y + 1, z + -2 + ii, lava_stone, 0, 2);
						world.setBlock(x + -2, y + 1, z + 1 + ii, lava_stone, 0, 2);
						// Inner z
						world.setBlock(x + 1, y + 1, z + -2, lava_stone, 0, 2);
						world.setBlock(x + -1, y + 1, z + -2, lava_stone, 0, 2);
						world.setBlock(x + 1, y + 1, z + 2, lava_stone, 0, 2);
						world.setBlock(x + -1, y + 1, z + 2, lava_stone, 0, 2);
						// Lava Inner
						world.setBlock(x + 1 + -e, y + 1, z + 1 + -ee, lava, 0, 2);
						world.setBlock(x + 2, y + 1, z, lava, 0, 2);
						world.setBlock(x + -2, y + 1, z, lava, 0, 2);
						world.setBlock(x, y + 1, z + 2, lava, 0, 2);
						world.setBlock(x, y + 1, z + -2, lava, 0, 2);
					}
		// Layer 3
		for (int i = 0; i < 5; i++)
			for (int ii = 0; ii < 2; ii++)
				for (int e = 0; e < 7; e++)
					for (int ee = 0; ee < 5; ee++) {
						// Ring x
						world.setBlock(x + 4, y + 2, z + 2 + -i, lava_stone, 0, 2);
						world.setBlock(x + -4, y + 2, z + 2 + -i, lava_stone, 0, 2);
						// Ring z
						world.setBlock(x + 2 + -i, y + 2, z + 4, lava_stone, 0, 2);
						world.setBlock(x + 2 + -i, y + 2, z + -4, lava_stone, 0, 2);
						// Ring Corners
						world.setBlock(x + 3, y + 2, z + 3, lava_stone, 0, 2);
						world.setBlock(x + 3, y + 2, z + -3, lava_stone, 0, 2);
						world.setBlock(x + -3, y + 2, z + 3, lava_stone, 0, 2);
						world.setBlock(x + -3, y + 2, z + -3, lava_stone, 0, 2);
						// Inner x
						world.setBlock(x + 3 + -e, y + 2, z + 2 + -ee, lava, 0, 2);
						// Inner z
						world.setBlock(x + 2 + -ee, y + 2, z + 3, lava, 0, 2);
						world.setBlock(x + 2 + -ee, y + 2, z + -3, lava, 0, 2);
					}
		// Layer 4
		for (int i = 0; i < 3; i++)
			for (int ii = 0; ii < 7; ii++)
				for (int e = 0; e < 7; e++) {
					// Ring x
					world.setBlock(x + 4, y + 3, z + 3 + -i, lava_stone, 0, 2);
					world.setBlock(x + 4, y + 3, z + -1 + -i, lava_stone, 0, 2);
					world.setBlock(x + -4, y + 3, z + 3 + -i, lava_stone, 0, 2);
					world.setBlock(x + -4, y + 3, z + -1 + -i, lava_stone, 0, 2);
					world.setBlock(x + 5, y + 3, z, lava_stone, 0, 2);
					world.setBlock(x + 4, y + 3, z, lava, 0, 2);
					world.setBlock(x + -5, y + 3, z, lava_stone, 0, 2);
					world.setBlock(x + -4, y + 3, z, lava, 0, 2);
					// Ring z
					world.setBlock(x + 3 + -i, y + 3, z + 4, lava_stone, 0, 2);
					world.setBlock(x + -1 + -i, y + 3, z + 4, lava_stone, 0, 2);
					world.setBlock(x + 3 + -i, y + 3, z + -4, lava_stone, 0, 2);
					world.setBlock(x + -1 + -i, y + 3, z + -4, lava_stone, 0, 2);
					world.setBlock(x, y + 3, z + 5, lava_stone, 0, 2);
					world.setBlock(x, y + 3, z + 4, lava, 0, 2);
					world.setBlock(x, y + 3, z + -5, lava_stone, 0, 2);
					world.setBlock(x, y + 3, z + -4, lava, 0, 2);
					// Inner
					world.setBlock(x + 3 + -ii, y + 3, z + 3 + -e, lava, 0, 2);
				}
		// Layer 5
		for (int i = 0; i < 3; i++)
			for (int ii = 0; ii < 7; ii++)
				for (int e = 0; e < 7; e++)
					for (int ee = 0; ee < 2; ee++) {
						// Ring x
						world.setBlock(x + 5, y + 4, z + 1 + -i, lava_stone, 0, 2);
						world.setBlock(x + 4, y + 4, z + 3 + -ee, lava_stone, 0, 2);
						world.setBlock(x + 4, y + 4, z + -3 + ee, lava_stone, 0, 2);
						world.setBlock(x + -5, y + 4, z + 1 + -i, lava_stone, 0, 2);
						world.setBlock(x + -4, y + 4, z + 3 + -ee, lava_stone, 0, 2);
						world.setBlock(x + -4, y + 4, z + -3 + ee, lava_stone, 0, 2);
						// Ring z
						world.setBlock(x + 1 + -i, y + 4, z + 5, lava_stone, 0, 2);
						world.setBlock(x + 3 + -ee, y + 4, z + 4, lava_stone, 0, 2);
						world.setBlock(x + -3 + ee, y + 4, z + 4, lava_stone, 0, 2);
						world.setBlock(x + 1 + -i, y + 4, z + -5, lava_stone, 0, 2);
						world.setBlock(x + 3 + -ee, y + 4, z + -4, lava_stone, 0, 2);
						world.setBlock(x + -3 + ee, y + 4, z + -4, lava_stone, 0, 2);
						// Inner
						world.setBlock(x + 4, y + 4, z + -1 + i, lava, 0, 2);
						world.setBlock(x + -4, y + 4, z + -1 + i, lava, 0, 2);
						world.setBlock(x + 1 + -i, y + 4, z + 4, lava, 0, 2);
						world.setBlock(x + 1 + -i, y + 4, z + -4, lava, 0, 2);
						world.setBlock(x + 3 + -ii, y + 4, z + 3 + -e, lava, 0, 2);
					}
		// Layer 6 Mid
		for (int i = 0; i < 5; i++)
			for (int ii = 0; ii < 7; ii++)
				for (int e = 0; e < 9; e++) {
					// Ring x
					world.setBlock(x + 5, y + 5, z + 2 + -i, lava_stone, 0, 2);
					world.setBlock(x + 4, y + 5, z + 3, lava_stone, 0, 2);
					world.setBlock(x + 4, y + 5, z + -3, lava_stone, 0, 2);
					world.setBlock(x + -5, y + 5, z + 2 + -i, lava_stone, 0, 2);
					world.setBlock(x + -4, y + 5, z + 3, lava_stone, 0, 2);
					world.setBlock(x + -4, y + 5, z + -3, lava_stone, 0, 2);
					// Ring z
					world.setBlock(x + 2 + -i, y + 5, z + 5, lava_stone, 0, 2);
					world.setBlock(x + 3, y + 5, z + 4, lava_stone, 0, 2);
					world.setBlock(x + -3, y + 5, z + 4, lava_stone, 0, 2);
					world.setBlock(x + 2 + -i, y + 5, z + -5, lava_stone, 0, 2);
					world.setBlock(x + 3, y + 5, z + -4, lava_stone, 0, 2);
					world.setBlock(x + -3, y + 5, z + -4, lava_stone, 0, 2);
					// Inner
					world.setBlock(x + 4 + -e, y + 5, z + 2 + -i, lava, 0, 2);
					world.setBlock(x + 3 + -ii, y + 5, z + 3, lava, 0, 2);
					world.setBlock(x + 3 + -ii, y + 5, z + -3, lava, 0, 2);
					world.setBlock(x + 2 + -i, y + 5, z + 4, lava, 0, 2);
					world.setBlock(x + 2 + -i, y + 5, z + -4, lava, 0, 2);
				}
		// Layer 7
		for (int i = 0; i < 3; i++)
			for (int ii = 0; ii < 7; ii++)
				for (int e = 0; e < 7; e++)
					for (int ee = 0; ee < 2; ee++) {
						// Ring x
						world.setBlock(x + 5, y + 6, z + 1 + -i, lava_stone, 0, 2);
						world.setBlock(x + 4, y + 6, z + 3 + -ee, lava_stone, 0, 2);
						world.setBlock(x + 4, y + 6, z + -3 + ee, lava_stone, 0, 2);
						world.setBlock(x + -5, y + 6, z + 1 + -i, lava_stone, 0, 2);
						world.setBlock(x + -4, y + 6, z + 3 + -ee, lava_stone, 0, 2);
						world.setBlock(x + -4, y + 6, z + -3 + ee, lava_stone, 0, 2);
						// Ring z
						world.setBlock(x + 1 + -i, y + 6, z + 5, lava_stone, 0, 2);
						world.setBlock(x + 3 + -ee, y + 6, z + 4, lava_stone, 0, 2);
						world.setBlock(x + -3 + ee, y + 6, z + 4, lava_stone, 0, 2);
						world.setBlock(x + 1 + -i, y + 6, z + -5, lava_stone, 0, 2);
						world.setBlock(x + 3 + -ee, y + 6, z + -4, lava_stone, 0, 2);
						world.setBlock(x + -3 + ee, y + 6, z + -4, lava_stone, 0, 2);
						// Inner
						world.setBlock(x + 4, y + 6, z + -1 + i, lava, 0, 2);
						world.setBlock(x + -4, y + 6, z + -1 + i, lava, 0, 2);
						world.setBlock(x + 1 + -i, y + 6, z + 4, lava, 0, 2);
						world.setBlock(x + 1 + -i, y + 6, z + -4, lava, 0, 2);
						world.setBlock(x + 3 + -ii, y + 6, z + 3 + -e, lava, 0, 2);
					}
		// Layer 8
		for (int i = 0; i < 3; i++)
			for (int ii = 0; ii < 7; ii++)
				for (int e = 0; e < 7; e++) {
					// Ring x
					world.setBlock(x + 4, y + 7, z + 3 + -i, lava_stone, 0, 2);
					world.setBlock(x + 4, y + 7, z + -1 + -i, lava_stone, 0, 2);
					world.setBlock(x + -4, y + 7, z + 3 + -i, lava_stone, 0, 2);
					world.setBlock(x + -4, y + 7, z + -1 + -i, lava_stone, 0, 2);
					world.setBlock(x + 5, y + 7, z, lava_stone, 0, 2);
					world.setBlock(x + 4, y + 7, z, lava, 0, 2);
					world.setBlock(x + -5, y + 7, z, lava_stone, 0, 2);
					world.setBlock(x + -4, y + 7, z, lava, 0, 2);
					// Ring z
					world.setBlock(x + 3 + -i, y + 7, z + 4, lava_stone, 0, 2);
					world.setBlock(x + -1 + -i, y + 7, z + 4, lava_stone, 0, 2);
					world.setBlock(x + 3 + -i, y + 7, z + -4, lava_stone, 0, 2);
					world.setBlock(x + -1 + -i, y + 7, z + -4, lava_stone, 0, 2);
					world.setBlock(x, y + 7, z + 5, lava_stone, 0, 2);
					world.setBlock(x, y + 7, z + 4, lava, 0, 2);
					world.setBlock(x, y + 7, z + -5, lava_stone, 0, 2);
					world.setBlock(x, y + 7, z + -4, lava, 0, 2);
					// Inner
					world.setBlock(x + 3 + -ii, y + 7, z + 3 + -e, lava, 0, 2);
				}
		// Layer 9
		for (int i = 0; i < 5; i++)
			for (int ii = 0; ii < 2; ii++)
				for (int e = 0; e < 7; e++)
					for (int ee = 0; ee < 5; ee++) {
						// Ring x
						world.setBlock(x + 4, y + 8, z + 2 + -i, lava_stone, 0, 2);
						world.setBlock(x + -4, y + 8, z + 2 + -i, lava_stone, 0, 2);
						// Ring z
						world.setBlock(x + 2 + -i, y + 8, z + 4, lava_stone, 0, 2);
						world.setBlock(x + 2 + -i, y + 8, z + -4, lava_stone, 0, 2);
						// Ring Corners
						world.setBlock(x + 3, y + 8, z + 3, lava_stone, 0, 2);
						world.setBlock(x + 3, y + 8, z + -3, lava_stone, 0, 2);
						world.setBlock(x + -3, y + 8, z + 3, lava_stone, 0, 2);
						world.setBlock(x + -3, y + 8, z + -3, lava_stone, 0, 2);
						// Inner x
						world.setBlock(x + 3 + -e, y + 8, z + 2 + -ee, lava, 0, 2);
						// Inner z
						world.setBlock(x + 2 + -ee, y + 8, z + 3, lava, 0, 2);
						world.setBlock(x + 2 + -ee, y + 8, z + -3, lava, 0, 2);
					}
		// Layer 10
		for (int i = 0; i < 5; i++)
			for (int ii = 0; ii < 2; ii++)
				for (int e = 0; e < 3; e++)
					for (int ee = 0; ee < 3; ee++) {
						// Ring x
						world.setBlock(x + 3, y + 9, z + 2 + -i, lava_stone, 0, 2);
						world.setBlock(x + -3, y + 9, z + 2 + -i, lava_stone, 0, 2);
						// Ring z
						world.setBlock(x + 2 + -i, y + 9, z + 3, lava_stone, 0, 2);
						world.setBlock(x + 2 + -i, y + 9, z + -3, lava_stone, 0, 2);
						// Inner x
						world.setBlock(x + 2, y + 9, z + -2 + ii, lava_stone, 0, 2);
						world.setBlock(x + 2, y + 9, z + 1 + ii, lava_stone, 0, 2);
						world.setBlock(x + -2, y + 9, z + -2 + ii, lava_stone, 0, 2);
						world.setBlock(x + -2, y + 9, z + 1 + ii, lava_stone, 0, 2);
						// Inner z
						world.setBlock(x + 1, y + 9, z + -2, lava_stone, 0, 2);
						world.setBlock(x + -1, y + 9, z + -2, lava_stone, 0, 2);
						world.setBlock(x + 1, y + 9, z + 2, lava_stone, 0, 2);
						world.setBlock(x + -1, y + 9, z + 2, lava_stone, 0, 2);
						// Lava Inner
						world.setBlock(x + 1 + -e, y + 9, z + 1 + -ee, lava, 0, 2);
						world.setBlock(x + 2, y + 9, z, lava, 0, 2);
						world.setBlock(x + -2, y + 9, z, lava, 0, 2);
						world.setBlock(x, y + 9, z + 2, lava, 0, 2);
						world.setBlock(x, y + 9, z + -2, lava, 0, 2);
					}
		// Layer 11
		for (int i = 0; i < 3; i++)
			for (int ii = 0; ii < 3; ii++) {
				world.setBlock(x + 1 + -i, y + 10, z + 1 + -ii, lava_stone, 0, 2);
				world.setBlock(x + 2, y + 10, z, lava_stone, 0, 2);
				world.setBlock(x + -2, y + 10, z, lava_stone, 0, 2);
				world.setBlock(x, y + 10, z + 2, lava_stone, 0, 2);
				world.setBlock(x, y + 10, z + -2, lava_stone, 0, 2);
			}
	}
}
