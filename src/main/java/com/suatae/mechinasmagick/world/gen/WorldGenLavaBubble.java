package com.suatae.mechinasmagick.world.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;

import com.suatae.mechinasmagick.common.core.lib.REF;

import cpw.mods.fml.common.IWorldGenerator;





public class WorldGenLavaBubble implements IWorldGenerator {
	public static Block	AIR			= REF.BLOCK.air;
	public static Block	LAVA		= REF.BLOCK.lava;
	public static Block	LAVA_STONE	= REF.BLOCK.lavaS;

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		int X = chunkX * 16;
		int Z = chunkZ * 16;
		switch (world.provider.dimensionId) {
			case -1:
				generateNether(world, X, Z, random);
				break;
			case 0:
				generateSurface(world, X, Z, random);
				break;
			case 1:
				generateEnd(world, X, Z, random);
				break;
			default:
				generateSurface(world, X, Z, random);
		}

	}

	private void generateNether(World world, int X, int Z, Random random) {}

	private void generateSurface(World world, int X, int Z, Random random) {
		// Lava Bubble
		if (random.nextInt(32) == 0) {
			int randX = X + random.nextInt(16);
			int randY = 12 + random.nextInt(38);
			int randZ = Z + random.nextInt(16);
			if (world.getBiomeGenForCoords(randX, randZ) != BiomeGenBase.deepOcean
					&& world.getBiomeGenForCoords(randX, randZ) != BiomeGenBase.ocean) {
				GenLavaBubble(world, randX, randY, randZ);
			}
		}
	}

	private void generateEnd(World world, int X, int Z, Random random) {}

	private void GenLavaBubble(World world, int X, int Y, int Z) {
		// Bottom-to-Top
		// Layer 1
		for (int i = 0; i < 3; i++)
			for (int ii = 0; ii < 3; ii++) {
				world.setBlock(X + 1 + -i, Y, Z + 1 + -ii, LAVA_STONE, 0, 2);
				world.setBlock(X + 2, Y, Z, LAVA_STONE, 0, 2);
				world.setBlock(X + -2, Y, Z, LAVA_STONE, 0, 2);
				world.setBlock(X, Y, Z + 2, LAVA_STONE, 0, 2);
				world.setBlock(X, Y, Z + -2, LAVA_STONE, 0, 2);
			}
		// Layer 2
		for (int i = 0; i < 5; i++)
			for (int ii = 0; ii < 2; ii++)
				for (int e = 0; e < 3; e++)
					for (int ee = 0; ee < 3; ee++) {
						// Ring X
						world.setBlock(X + 3, Y + 1, Z + 2 + -i, LAVA_STONE, 0, 2);
						world.setBlock(X + -3, Y + 1, Z + 2 + -i, LAVA_STONE, 0, 2);
						// Ring Z
						world.setBlock(X + 2 + -i, Y + 1, Z + 3, LAVA_STONE, 0, 2);
						world.setBlock(X + 2 + -i, Y + 1, Z + -3, LAVA_STONE, 0, 2);
						// Inner X
						world.setBlock(X + 2, Y + 1, Z + -2 + ii, LAVA_STONE, 0, 2);
						world.setBlock(X + 2, Y + 1, Z + 1 + ii, LAVA_STONE, 0, 2);
						world.setBlock(X + -2, Y + 1, Z + -2 + ii, LAVA_STONE, 0, 2);
						world.setBlock(X + -2, Y + 1, Z + 1 + ii, LAVA_STONE, 0, 2);
						// Inner Z
						world.setBlock(X + 1, Y + 1, Z + -2, LAVA_STONE, 0, 2);
						world.setBlock(X + -1, Y + 1, Z + -2, LAVA_STONE, 0, 2);
						world.setBlock(X + 1, Y + 1, Z + 2, LAVA_STONE, 0, 2);
						world.setBlock(X + -1, Y + 1, Z + 2, LAVA_STONE, 0, 2);
						// Lava Inner
						world.setBlock(X + 1 + -e, Y + 1, Z + 1 + -ee, LAVA, 0, 2);
						world.setBlock(X + 2, Y + 1, Z, LAVA, 0, 2);
						world.setBlock(X + -2, Y + 1, Z, LAVA, 0, 2);
						world.setBlock(X, Y + 1, Z + 2, LAVA, 0, 2);
						world.setBlock(X, Y + 1, Z + -2, LAVA, 0, 2);
					}
		// Layer 3
		for (int i = 0; i < 5; i++)
			for (int ii = 0; ii < 2; ii++)
				for (int e = 0; e < 7; e++)
					for (int ee = 0; ee < 5; ee++) {
						// Ring X
						world.setBlock(X + 4, Y + 2, Z + 2 + -i, LAVA_STONE, 0, 2);
						world.setBlock(X + -4, Y + 2, Z + 2 + -i, LAVA_STONE, 0, 2);
						// Ring Z
						world.setBlock(X + 2 + -i, Y + 2, Z + 4, LAVA_STONE, 0, 2);
						world.setBlock(X + 2 + -i, Y + 2, Z + -4, LAVA_STONE, 0, 2);
						// Ring Corners
						world.setBlock(X + 3, Y + 2, Z + 3, LAVA_STONE, 0, 2);
						world.setBlock(X + 3, Y + 2, Z + -3, LAVA_STONE, 0, 2);
						world.setBlock(X + -3, Y + 2, Z + 3, LAVA_STONE, 0, 2);
						world.setBlock(X + -3, Y + 2, Z + -3, LAVA_STONE, 0, 2);
						// Inner X
						world.setBlock(X + 3 + -e, Y + 2, Z + 2 + -ee, LAVA, 0, 2);
						// Inner Z
						world.setBlock(X + 2 + -ee, Y + 2, Z + 3, LAVA, 0, 2);
						world.setBlock(X + 2 + -ee, Y + 2, Z + -3, LAVA, 0, 2);
					}
		// Layer 4
		for (int i = 0; i < 3; i++)
			for (int ii = 0; ii < 7; ii++)
				for (int e = 0; e < 7; e++) {
					// Ring X
					world.setBlock(X + 4, Y + 3, Z + 3 + -i, LAVA_STONE, 0, 2);
					world.setBlock(X + 4, Y + 3, Z + -1 + -i, LAVA_STONE, 0, 2);
					world.setBlock(X + -4, Y + 3, Z + 3 + -i, LAVA_STONE, 0, 2);
					world.setBlock(X + -4, Y + 3, Z + -1 + -i, LAVA_STONE, 0, 2);
					world.setBlock(X + 5, Y + 3, Z, LAVA_STONE, 0, 2);
					world.setBlock(X + 4, Y + 3, Z, LAVA, 0, 2);
					world.setBlock(X + -5, Y + 3, Z, LAVA_STONE, 0, 2);
					world.setBlock(X + -4, Y + 3, Z, LAVA, 0, 2);
					// Ring Z
					world.setBlock(X + 3 + -i, Y + 3, Z + 4, LAVA_STONE, 0, 2);
					world.setBlock(X + -1 + -i, Y + 3, Z + 4, LAVA_STONE, 0, 2);
					world.setBlock(X + 3 + -i, Y + 3, Z + -4, LAVA_STONE, 0, 2);
					world.setBlock(X + -1 + -i, Y + 3, Z + -4, LAVA_STONE, 0, 2);
					world.setBlock(X, Y + 3, Z + 5, LAVA_STONE, 0, 2);
					world.setBlock(X, Y + 3, Z + 4, LAVA, 0, 2);
					world.setBlock(X, Y + 3, Z + -5, LAVA_STONE, 0, 2);
					world.setBlock(X, Y + 3, Z + -4, LAVA, 0, 2);
					// Inner
					world.setBlock(X + 3 + -ii, Y + 3, Z + 3 + -e, LAVA, 0, 2);
				}
		// Layer 5
		for (int i = 0; i < 3; i++)
			for (int ii = 0; ii < 7; ii++)
				for (int e = 0; e < 7; e++)
					for (int ee = 0; ee < 2; ee++) {
						// Ring X
						world.setBlock(X + 5, Y + 4, Z + 1 + -i, LAVA_STONE, 0, 2);
						world.setBlock(X + 4, Y + 4, Z + 3 + -ee, LAVA_STONE, 0, 2);
						world.setBlock(X + 4, Y + 4, Z + -3 + ee, LAVA_STONE, 0, 2);
						world.setBlock(X + -5, Y + 4, Z + 1 + -i, LAVA_STONE, 0, 2);
						world.setBlock(X + -4, Y + 4, Z + 3 + -ee, LAVA_STONE, 0, 2);
						world.setBlock(X + -4, Y + 4, Z + -3 + ee, LAVA_STONE, 0, 2);
						// Ring Z
						world.setBlock(X + 1 + -i, Y + 4, Z + 5, LAVA_STONE, 0, 2);
						world.setBlock(X + 3 + -ee, Y + 4, Z + 4, LAVA_STONE, 0, 2);
						world.setBlock(X + -3 + ee, Y + 4, Z + 4, LAVA_STONE, 0, 2);
						world.setBlock(X + 1 + -i, Y + 4, Z + -5, LAVA_STONE, 0, 2);
						world.setBlock(X + 3 + -ee, Y + 4, Z + -4, LAVA_STONE, 0, 2);
						world.setBlock(X + -3 + ee, Y + 4, Z + -4, LAVA_STONE, 0, 2);
						// Inner
						world.setBlock(X + 4, Y + 4, Z + -1 + i, LAVA, 0, 2);
						world.setBlock(X + -4, Y + 4, Z + -1 + i, LAVA, 0, 2);
						world.setBlock(X + 1 + -i, Y + 4, Z + 4, LAVA, 0, 2);
						world.setBlock(X + 1 + -i, Y + 4, Z + -4, LAVA, 0, 2);
						world.setBlock(X + 3 + -ii, Y + 4, Z + 3 + -e, LAVA, 0, 2);
					}
		// Layer 6 Mid
		for (int i = 0; i < 5; i++)
			for (int ii = 0; ii < 7; ii++)
				for (int e = 0; e < 9; e++) {
					// Ring X
					world.setBlock(X + 5, Y + 5, Z + 2 + -i, LAVA_STONE, 0, 2);
					world.setBlock(X + 4, Y + 5, Z + 3, LAVA_STONE, 0, 2);
					world.setBlock(X + 4, Y + 5, Z + -3, LAVA_STONE, 0, 2);
					world.setBlock(X + -5, Y + 5, Z + 2 + -i, LAVA_STONE, 0, 2);
					world.setBlock(X + -4, Y + 5, Z + 3, LAVA_STONE, 0, 2);
					world.setBlock(X + -4, Y + 5, Z + -3, LAVA_STONE, 0, 2);
					// Ring Z
					world.setBlock(X + 2 + -i, Y + 5, Z + 5, LAVA_STONE, 0, 2);
					world.setBlock(X + 3, Y + 5, Z + 4, LAVA_STONE, 0, 2);
					world.setBlock(X + -3, Y + 5, Z + 4, LAVA_STONE, 0, 2);
					world.setBlock(X + 2 + -i, Y + 5, Z + -5, LAVA_STONE, 0, 2);
					world.setBlock(X + 3, Y + 5, Z + -4, LAVA_STONE, 0, 2);
					world.setBlock(X + -3, Y + 5, Z + -4, LAVA_STONE, 0, 2);
					// Inner
					world.setBlock(X + 4 + -e, Y + 5, Z + 2 + -i, LAVA, 0, 2);
					world.setBlock(X + 3 + -ii, Y + 5, Z + 3, LAVA, 0, 2);
					world.setBlock(X + 3 + -ii, Y + 5, Z + -3, LAVA, 0, 2);
					world.setBlock(X + 2 + -i, Y + 5, Z + 4, LAVA, 0, 2);
					world.setBlock(X + 2 + -i, Y + 5, Z + -4, LAVA, 0, 2);
				}
		// Layer 7
		for (int i = 0; i < 3; i++)
			for (int ii = 0; ii < 7; ii++)
				for (int e = 0; e < 7; e++)
					for (int ee = 0; ee < 2; ee++) {
						// Ring X
						world.setBlock(X + 5, Y + 6, Z + 1 + -i, LAVA_STONE, 0, 2);
						world.setBlock(X + 4, Y + 6, Z + 3 + -ee, LAVA_STONE, 0, 2);
						world.setBlock(X + 4, Y + 6, Z + -3 + ee, LAVA_STONE, 0, 2);
						world.setBlock(X + -5, Y + 6, Z + 1 + -i, LAVA_STONE, 0, 2);
						world.setBlock(X + -4, Y + 6, Z + 3 + -ee, LAVA_STONE, 0, 2);
						world.setBlock(X + -4, Y + 6, Z + -3 + ee, LAVA_STONE, 0, 2);
						// Ring Z
						world.setBlock(X + 1 + -i, Y + 6, Z + 5, LAVA_STONE, 0, 2);
						world.setBlock(X + 3 + -ee, Y + 6, Z + 4, LAVA_STONE, 0, 2);
						world.setBlock(X + -3 + ee, Y + 6, Z + 4, LAVA_STONE, 0, 2);
						world.setBlock(X + 1 + -i, Y + 6, Z + -5, LAVA_STONE, 0, 2);
						world.setBlock(X + 3 + -ee, Y + 6, Z + -4, LAVA_STONE, 0, 2);
						world.setBlock(X + -3 + ee, Y + 6, Z + -4, LAVA_STONE, 0, 2);
						// Inner
						world.setBlock(X + 4, Y + 6, Z + -1 + i, LAVA, 0, 2);
						world.setBlock(X + -4, Y + 6, Z + -1 + i, LAVA, 0, 2);
						world.setBlock(X + 1 + -i, Y + 6, Z + 4, LAVA, 0, 2);
						world.setBlock(X + 1 + -i, Y + 6, Z + -4, LAVA, 0, 2);
						world.setBlock(X + 3 + -ii, Y + 6, Z + 3 + -e, LAVA, 0, 2);
					}
		// Layer 8
		for (int i = 0; i < 3; i++)
			for (int ii = 0; ii < 7; ii++)
				for (int e = 0; e < 7; e++) {
					// Ring X
					world.setBlock(X + 4, Y + 7, Z + 3 + -i, LAVA_STONE, 0, 2);
					world.setBlock(X + 4, Y + 7, Z + -1 + -i, LAVA_STONE, 0, 2);
					world.setBlock(X + -4, Y + 7, Z + 3 + -i, LAVA_STONE, 0, 2);
					world.setBlock(X + -4, Y + 7, Z + -1 + -i, LAVA_STONE, 0, 2);
					world.setBlock(X + 5, Y + 7, Z, LAVA_STONE, 0, 2);
					world.setBlock(X + 4, Y + 7, Z, LAVA, 0, 2);
					world.setBlock(X + -5, Y + 7, Z, LAVA_STONE, 0, 2);
					world.setBlock(X + -4, Y + 7, Z, LAVA, 0, 2);
					// Ring Z
					world.setBlock(X + 3 + -i, Y + 7, Z + 4, LAVA_STONE, 0, 2);
					world.setBlock(X + -1 + -i, Y + 7, Z + 4, LAVA_STONE, 0, 2);
					world.setBlock(X + 3 + -i, Y + 7, Z + -4, LAVA_STONE, 0, 2);
					world.setBlock(X + -1 + -i, Y + 7, Z + -4, LAVA_STONE, 0, 2);
					world.setBlock(X, Y + 7, Z + 5, LAVA_STONE, 0, 2);
					world.setBlock(X, Y + 7, Z + 4, LAVA, 0, 2);
					world.setBlock(X, Y + 7, Z + -5, LAVA_STONE, 0, 2);
					world.setBlock(X, Y + 7, Z + -4, LAVA, 0, 2);
					// Inner
					world.setBlock(X + 3 + -ii, Y + 7, Z + 3 + -e, LAVA, 0, 2);
				}
		// Layer 9
		for (int i = 0; i < 5; i++)
			for (int ii = 0; ii < 2; ii++)
				for (int e = 0; e < 7; e++)
					for (int ee = 0; ee < 5; ee++) {
						// Ring X
						world.setBlock(X + 4, Y + 8, Z + 2 + -i, LAVA_STONE, 0, 2);
						world.setBlock(X + -4, Y + 8, Z + 2 + -i, LAVA_STONE, 0, 2);
						// Ring Z
						world.setBlock(X + 2 + -i, Y + 8, Z + 4, LAVA_STONE, 0, 2);
						world.setBlock(X + 2 + -i, Y + 8, Z + -4, LAVA_STONE, 0, 2);
						// Ring Corners
						world.setBlock(X + 3, Y + 8, Z + 3, LAVA_STONE, 0, 2);
						world.setBlock(X + 3, Y + 8, Z + -3, LAVA_STONE, 0, 2);
						world.setBlock(X + -3, Y + 8, Z + 3, LAVA_STONE, 0, 2);
						world.setBlock(X + -3, Y + 8, Z + -3, LAVA_STONE, 0, 2);
						// Inner X
						world.setBlock(X + 3 + -e, Y + 8, Z + 2 + -ee, LAVA, 0, 2);
						// Inner Z
						world.setBlock(X + 2 + -ee, Y + 8, Z + 3, LAVA, 0, 2);
						world.setBlock(X + 2 + -ee, Y + 8, Z + -3, LAVA, 0, 2);
					}
		// Layer 10
		for (int i = 0; i < 5; i++)
			for (int ii = 0; ii < 2; ii++)
				for (int e = 0; e < 3; e++)
					for (int ee = 0; ee < 3; ee++) {
						// Ring X
						world.setBlock(X + 3, Y + 9, Z + 2 + -i, LAVA_STONE, 0, 2);
						world.setBlock(X + -3, Y + 9, Z + 2 + -i, LAVA_STONE, 0, 2);
						// Ring Z
						world.setBlock(X + 2 + -i, Y + 9, Z + 3, LAVA_STONE, 0, 2);
						world.setBlock(X + 2 + -i, Y + 9, Z + -3, LAVA_STONE, 0, 2);
						// Inner X
						world.setBlock(X + 2, Y + 9, Z + -2 + ii, LAVA_STONE, 0, 2);
						world.setBlock(X + 2, Y + 9, Z + 1 + ii, LAVA_STONE, 0, 2);
						world.setBlock(X + -2, Y + 9, Z + -2 + ii, LAVA_STONE, 0, 2);
						world.setBlock(X + -2, Y + 9, Z + 1 + ii, LAVA_STONE, 0, 2);
						// Inner Z
						world.setBlock(X + 1, Y + 9, Z + -2, LAVA_STONE, 0, 2);
						world.setBlock(X + -1, Y + 9, Z + -2, LAVA_STONE, 0, 2);
						world.setBlock(X + 1, Y + 9, Z + 2, LAVA_STONE, 0, 2);
						world.setBlock(X + -1, Y + 9, Z + 2, LAVA_STONE, 0, 2);
						// Lava Inner
						world.setBlock(X + 1 + -e, Y + 9, Z + 1 + -ee, LAVA, 0, 2);
						world.setBlock(X + 2, Y + 9, Z, LAVA, 0, 2);
						world.setBlock(X + -2, Y + 9, Z, LAVA, 0, 2);
						world.setBlock(X, Y + 9, Z + 2, LAVA, 0, 2);
						world.setBlock(X, Y + 9, Z + -2, LAVA, 0, 2);
					}
		// Layer 11
		for (int i = 0; i < 3; i++)
			for (int ii = 0; ii < 3; ii++) {
				world.setBlock(X + 1 + -i, Y + 10, Z + 1 + -ii, LAVA_STONE, 0, 2);
				world.setBlock(X + 2, Y + 10, Z, LAVA_STONE, 0, 2);
				world.setBlock(X + -2, Y + 10, Z, LAVA_STONE, 0, 2);
				world.setBlock(X, Y + 10, Z + 2, LAVA_STONE, 0, 2);
				world.setBlock(X, Y + 10, Z + -2, LAVA_STONE, 0, 2);
			}
	}
}
