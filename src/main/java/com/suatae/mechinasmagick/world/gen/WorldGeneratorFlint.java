package com.suatae.mechinasmagick.world.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;

import com.suatae.mechinasmagick.common.init.BlockReg;

import cpw.mods.fml.common.IWorldGenerator;





public class WorldGeneratorFlint implements IWorldGenerator {
	public static Block	AIR			= Blocks.air;
	public static Block	STONE		= Blocks.stone;
	public static Block	GRASS		= Blocks.grass;
	public static Block	SAND		= Blocks.sand;
	public static Block	GRAVEL		= Blocks.gravel;
	public static Block	FLINT_01	= BlockReg.blockFlint01;
	public static Block	FLINT_02	= BlockReg.blockFlint02;
	public static Block	FLINT_03	= BlockReg.blockFlint03;
	public static Block	FLINT_04	= BlockReg.blockFlint04;
	public static Block	EW			= BlockReg.EW;
	public static Block	NS			= BlockReg.NS;
	public static Block	NE			= BlockReg.NE;
	public static Block	SE			= BlockReg.SE;
	public static Block	SW			= BlockReg.SW;
	public static Block	NW			= BlockReg.NW;

	public static int	Y			= -1;
	public static int	YY			= 1;
	public static int	ZZ			= 1;

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
		// Flint 01
		if (random.nextInt(6) == 0) {
			int randX = X + random.nextInt(16);
			int randY = world.getTopSolidOrLiquidBlock(X, Z);
			int randZ = Z + random.nextInt(16);
			if (world.getBiomeGenForCoords(randX, randZ) != BiomeGenBase.river
					&& world.getBiomeGenForCoords(randX, randZ) != BiomeGenBase.deepOcean
					&& world.getBiomeGenForCoords(randX, randZ) != BiomeGenBase.ocean) {
				Block block = world.getBlock(randX, randY + Y, randZ);
				if (!(block != GRASS)) {
					Block blocka = world.getBlock(randX, randY + YY, randZ);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randX, randY, randZ + ZZ);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randX, randY, randZ - ZZ);
							if (!(blockz2 != AIR)) {
								flint01GenGrass(world, randX, randY, randZ);
							}
						}
					}
				}
				Block block1 = world.getBlock(randX, randY + Y, randZ);
				if (!(block1 != STONE)) {
					Block blocka = world.getBlock(randX, randY + YY, randZ);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randX, randY, randZ + ZZ);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randX, randY, randZ - ZZ);
							if (!(blockz2 != AIR)) {
								flint01GenStone(world, randX, randY, randZ);
							}
						}
					}
				}
				Block block2 = world.getBlock(randX, randY + Y, randZ);
				if (!(block2 != SAND)) {
					Block blocka = world.getBlock(randX, randY + YY, randZ);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randX, randY, randZ + ZZ);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randX, randY, randZ - ZZ);
							if (!(blockz2 != AIR)) {
								flint01GenSand(world, randX, randY, randZ);
							}
						}
					}
				}
				Block block3 = world.getBlock(randX, randY + Y, randZ);
				if (!(block3 != GRAVEL)) {
					Block blocka = world.getBlock(randX, randY + YY, randZ);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randX, randY, randZ + ZZ);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randX, randY, randZ - ZZ);
							if (!(blockz2 != AIR)) {
								flint01GenGravel(world, randX, randY, randZ);
							}
						}
					}
				}
			}
		}
		// Flint 02
		if (random.nextInt(8) == 0) {
			int randX = X + random.nextInt(16);
			int randY = world.getTopSolidOrLiquidBlock(X, Z);
			int randZ = Z + random.nextInt(16);
			if (world.getBiomeGenForCoords(randX, randZ) != BiomeGenBase.river
					&& world.getBiomeGenForCoords(randX, randZ) != BiomeGenBase.deepOcean
					&& world.getBiomeGenForCoords(randX, randZ) != BiomeGenBase.ocean) {
				Block block = world.getBlock(randX, randY + Y, randZ);
				if (!(block != GRASS)) {
					Block blocka = world.getBlock(randX, randY + YY, randZ);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randX, randY, randZ + ZZ);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randX, randY, randZ - ZZ);
							if (!(blockz2 != AIR)) {
								flint02GenGrass(world, randX, randY, randZ);
							}
						}
					}
				}
				Block block1 = world.getBlock(randX, randY + Y, randZ);
				if (!(block1 != STONE)) {
					Block blocka = world.getBlock(randX, randY + YY, randZ);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randX, randY, randZ + ZZ);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randX, randY, randZ - ZZ);
							if (!(blockz2 != AIR)) {
								flint02GenStone(world, randX, randY, randZ);
							}
						}
					}
				}
				Block block2 = world.getBlock(randX, randY + Y, randZ);
				if (!(block2 != SAND)) {
					Block blocka = world.getBlock(randX, randY + YY, randZ);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randX, randY, randZ + ZZ);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randX, randY, randZ - ZZ);
							if (!(blockz2 != AIR)) {
								flint02GenSand(world, randX, randY, randZ);
							}
						}
					}
				}
				Block block3 = world.getBlock(randX, randY + Y, randZ);
				if (!(block3 != GRAVEL)) {
					Block blocka = world.getBlock(randX, randY + YY, randZ);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randX, randY, randZ + ZZ);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randX, randY, randZ - ZZ);
							if (!(blockz2 != AIR)) {
								flint02GenGravel(world, randX, randY, randZ);
							}
						}
					}
				}
			}
		}
		// Flint 03
		if (random.nextInt(16) == 0) {
			int randX = X + random.nextInt(16);
			int randY = world.getTopSolidOrLiquidBlock(X, Z);
			int randZ = Z + random.nextInt(16);
			if (world.getBiomeGenForCoords(randX, randZ) != BiomeGenBase.river
					&& world.getBiomeGenForCoords(randX, randZ) != BiomeGenBase.deepOcean
					&& world.getBiomeGenForCoords(randX, randZ) != BiomeGenBase.ocean) {
				Block block = world.getBlock(randX, randY + Y, randZ);
				if (!(block != GRASS)) {
					Block blocka = world.getBlock(randX, randY + YY, randZ);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randX, randY, randZ + ZZ);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randX, randY, randZ - ZZ);
							if (!(blockz2 != AIR)) {
								flint03GenGrass(world, randX, randY, randZ);
							}
						}
					}
				}
				Block block1 = world.getBlock(randX, randY + Y, randZ);
				if (!(block1 != STONE)) {
					Block blocka = world.getBlock(randX, randY + YY, randZ);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randX, randY, randZ + ZZ);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randX, randY, randZ - ZZ);
							if (!(blockz2 != AIR)) {
								flint03GenStone(world, randX, randY, randZ);
							}
						}
					}
				}
				Block block2 = world.getBlock(randX, randY + Y, randZ);
				if (!(block2 != SAND)) {
					Block blocka = world.getBlock(randX, randY + YY, randZ);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randX, randY, randZ + ZZ);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randX, randY, randZ - ZZ);
							if (!(blockz2 != AIR)) {
								flint03GenSand(world, randX, randY, randZ);
							}
						}
					}
				}
				Block block3 = world.getBlock(randX, randY + Y, randZ);
				if (!(block3 != GRAVEL)) {
					Block blocka = world.getBlock(randX, randY + YY, randZ);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randX, randY, randZ + ZZ);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randX, randY, randZ - ZZ);
							if (!(blockz2 != AIR)) {
								flint03GenGravel(world, randX, randY, randZ);
							}
						}
					}
				}
			}
		}
		// Flint 04
		if (random.nextInt(12) == 0) {
			int randX = X + random.nextInt(16);
			int randY = world.getTopSolidOrLiquidBlock(X, Z);
			int randZ = Z + random.nextInt(16);
			if (world.getBiomeGenForCoords(randX, randZ) != BiomeGenBase.river
					&& world.getBiomeGenForCoords(randX, randZ) != BiomeGenBase.deepOcean
					&& world.getBiomeGenForCoords(randX, randZ) != BiomeGenBase.ocean) {
				Block block = world.getBlock(randX, randY + Y, randZ);
				if (!(block != GRASS)) {
					Block blocka = world.getBlock(randX, randY + YY, randZ);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randX, randY, randZ + ZZ);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randX, randY, randZ - ZZ);
							if (!(blockz2 != AIR)) {
								flint04GenGrass(world, randX, randY, randZ);
							}
						}
					}
				}
				Block block1 = world.getBlock(randX, randY + Y, randZ);
				if (!(block1 != STONE)) {
					Block blocka = world.getBlock(randX, randY + YY, randZ);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randX, randY, randZ + ZZ);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randX, randY, randZ - ZZ);
							if (!(blockz2 != AIR)) {
								flint04GenStone(world, randX, randY, randZ);
							}
						}
					}
				}
				Block block2 = world.getBlock(randX, randY + Y, randZ);
				if (!(block2 != SAND)) {
					Block blocka = world.getBlock(randX, randY + YY, randZ);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randX, randY, randZ + ZZ);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randX, randY, randZ - ZZ);
							if (!(blockz2 != AIR)) {
								flint04GenSand(world, randX, randY, randZ);
							}
						}
					}
				}
				Block block3 = world.getBlock(randX, randY + Y, randZ);
				if (!(block3 != GRAVEL)) {
					Block blocka = world.getBlock(randX, randY + YY, randZ);
					if (!(blocka != AIR)) {
						Block blockz1 = world.getBlock(randX, randY, randZ + ZZ);
						if (!(blockz1 != AIR)) {
							Block blockz2 = world.getBlock(randX, randY, randZ - ZZ);
							if (!(blockz2 != AIR)) {
								flint04GenGravel(world, randX, randY, randZ);
							}
						}
					}
				}
			}
		}
	}

	private void generateEnd(World world, int X, int Z, Random random) {}

	// Flint 01
	private void flint01GenGrass(World world, int X, int Y, int Z) {

		// Flint Block
		world.setBlock(X, Y, Z, FLINT_01, 0, 2);

		// Main Y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(X + 1 - iii, Y - 1 + i, Z + 1 - ii, GRASS, 0, 2);
				}
		world.setBlock(X, Y, Z + 1, NS, 0, 2);
		world.setBlock(X, Y, Z - 1, NS, 0, 2);
		world.setBlock(X + 1, Y, Z, EW, 0, 2);
		world.setBlock(X - 1, Y, Z, EW, 0, 2);
		world.setBlock(X + 1, Y, Z + 1, NE, 0, 2);
		world.setBlock(X + 1, Y, Z - 1, SE, 0, 2);
		world.setBlock(X - 1, Y, Z - 1, SW, 0, 2);
		world.setBlock(X - 1, Y, Z + 1, NW, 0, 2);
	}

	private void flint01GenStone(World world, int X, int Y, int Z) {

		// Flint Block
		world.setBlock(X, Y, Z, FLINT_01, 0, 2);

		// Main Y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(X + 1 + -iii, Y + -1 + i, Z + 1 + -ii, STONE, 0, 2);
				}
		world.setBlock(X, Y, Z + 1, NS, 0, 2);
		world.setBlock(X, Y, Z - 1, NS, 0, 2);
		world.setBlock(X + 1, Y, Z, EW, 0, 2);
		world.setBlock(X - 1, Y, Z, EW, 0, 2);
		world.setBlock(X + 1, Y, Z + 1, NE, 0, 2);
		world.setBlock(X + 1, Y, Z - 1, SE, 0, 2);
		world.setBlock(X - 1, Y, Z - 1, SW, 0, 2);
		world.setBlock(X - 1, Y, Z + 1, NW, 0, 2);
	}

	private void flint01GenSand(World world, int X, int Y, int Z) {

		// Flint Block
		world.setBlock(X, Y, Z, FLINT_01, 0, 2);

		// Main Y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(X + 1 + -iii, Y + -1 + i, Z + 1 + -ii, SAND, 0, 2);
				}
		world.setBlock(X, Y, Z + 1, NS, 0, 2);
		world.setBlock(X, Y, Z - 1, NS, 0, 2);
		world.setBlock(X + 1, Y, Z, EW, 0, 2);
		world.setBlock(X - 1, Y, Z, EW, 0, 2);
		world.setBlock(X + 1, Y, Z + 1, NE, 0, 2);
		world.setBlock(X + 1, Y, Z - 1, SE, 0, 2);
		world.setBlock(X - 1, Y, Z - 1, SW, 0, 2);
		world.setBlock(X - 1, Y, Z + 1, NW, 0, 2);
	}

	private void flint01GenGravel(World world, int X, int Y, int Z) {

		// Flint Block
		world.setBlock(X, Y, Z, FLINT_01, 0, 2);

		// Main Y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(X + 1 + -iii, Y + -1 + i, Z + 1 + -ii, GRAVEL, 0, 2);
				}
		world.setBlock(X, Y, Z + 1, NS, 0, 2);
		world.setBlock(X, Y, Z - 1, NS, 0, 2);
		world.setBlock(X + 1, Y, Z, EW, 0, 2);
		world.setBlock(X - 1, Y, Z, EW, 0, 2);
		world.setBlock(X + 1, Y, Z + 1, NE, 0, 2);
		world.setBlock(X + 1, Y, Z - 1, SE, 0, 2);
		world.setBlock(X - 1, Y, Z - 1, SW, 0, 2);
		world.setBlock(X - 1, Y, Z + 1, NW, 0, 2);
	}

	// Flint 02
	private void flint02GenGrass(World world, int X, int Y, int Z) {

		// Flint Block
		world.setBlock(X, Y, Z, FLINT_02, 0, 2);

		// Main Y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(X + 1 + -iii, Y + -1 + i, Z + 1 + -ii, GRASS, 0, 2);
				}
		world.setBlock(X, Y, Z + 1, NS, 0, 2);
		world.setBlock(X, Y, Z - 1, NS, 0, 2);
		world.setBlock(X + 1, Y, Z, EW, 0, 2);
		world.setBlock(X - 1, Y, Z, EW, 0, 2);
		world.setBlock(X + 1, Y, Z + 1, NE, 0, 2);
		world.setBlock(X + 1, Y, Z - 1, SE, 0, 2);
		world.setBlock(X - 1, Y, Z - 1, SW, 0, 2);
		world.setBlock(X - 1, Y, Z + 1, NW, 0, 2);
	}

	private void flint02GenStone(World world, int X, int Y, int Z) {

		// Flint Block
		world.setBlock(X, Y, Z, FLINT_02, 0, 2);

		// Main Y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(X + 1 + -iii, Y + -1 + i, Z + 1 + -ii, STONE, 0, 2);
				}
		world.setBlock(X, Y, Z + 1, NS, 0, 2);
		world.setBlock(X, Y, Z - 1, NS, 0, 2);
		world.setBlock(X + 1, Y, Z, EW, 0, 2);
		world.setBlock(X - 1, Y, Z, EW, 0, 2);
		world.setBlock(X + 1, Y, Z + 1, NE, 0, 2);
		world.setBlock(X + 1, Y, Z - 1, SE, 0, 2);
		world.setBlock(X - 1, Y, Z - 1, SW, 0, 2);
		world.setBlock(X - 1, Y, Z + 1, NW, 0, 2);
	}

	private void flint02GenSand(World world, int X, int Y, int Z) {

		// Flint Block
		world.setBlock(X, Y, Z, FLINT_02, 0, 2);

		// Main Y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(X + 1 + -iii, Y + -1 + i, Z + 1 + -ii, SAND, 0, 2);
				}
		world.setBlock(X, Y, Z + 1, NS, 0, 2);
		world.setBlock(X, Y, Z - 1, NS, 0, 2);
		world.setBlock(X + 1, Y, Z, EW, 0, 2);
		world.setBlock(X - 1, Y, Z, EW, 0, 2);
		world.setBlock(X + 1, Y, Z + 1, NE, 0, 2);
		world.setBlock(X + 1, Y, Z - 1, SE, 0, 2);
		world.setBlock(X - 1, Y, Z - 1, SW, 0, 2);
		world.setBlock(X - 1, Y, Z + 1, NW, 0, 2);
	}

	private void flint02GenGravel(World world, int X, int Y, int Z) {

		// Flint Block
		world.setBlock(X, Y, Z, FLINT_02, 0, 2);

		// Main Y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(X + 1 + -iii, Y + -1 + i, Z + 1 + -ii, GRAVEL, 0, 2);
				}
		world.setBlock(X, Y, Z + 1, NS, 0, 2);
		world.setBlock(X, Y, Z - 1, NS, 0, 2);
		world.setBlock(X + 1, Y, Z, EW, 0, 2);
		world.setBlock(X - 1, Y, Z, EW, 0, 2);
		world.setBlock(X + 1, Y, Z + 1, NE, 0, 2);
		world.setBlock(X + 1, Y, Z - 1, SE, 0, 2);
		world.setBlock(X - 1, Y, Z - 1, SW, 0, 2);
		world.setBlock(X - 1, Y, Z + 1, NW, 0, 2);
	}

	// Flint 03
	private void flint03GenGrass(World world, int X, int Y, int Z) {

		// Flint Block
		world.setBlock(X, Y, Z, FLINT_03, 0, 2);

		// Main Y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(X + 1 + -iii, Y + -1 + i, Z + 1 + -ii, GRASS, 0, 2);
				}
		world.setBlock(X, Y, Z + 1, NS, 0, 2);
		world.setBlock(X, Y, Z - 1, NS, 0, 2);
		world.setBlock(X + 1, Y, Z, EW, 0, 2);
		world.setBlock(X - 1, Y, Z, EW, 0, 2);
		world.setBlock(X + 1, Y, Z + 1, NE, 0, 2);
		world.setBlock(X + 1, Y, Z - 1, SE, 0, 2);
		world.setBlock(X - 1, Y, Z - 1, SW, 0, 2);
		world.setBlock(X - 1, Y, Z + 1, NW, 0, 2);
	}

	private void flint03GenStone(World world, int X, int Y, int Z) {

		// Flint Block
		world.setBlock(X, Y, Z, FLINT_03, 0, 2);

		// Main Y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(X + 1 + -iii, Y + -1 + i, Z + 1 + -ii, STONE, 0, 2);
				}
		world.setBlock(X, Y, Z + 1, NS, 0, 2);
		world.setBlock(X, Y, Z - 1, NS, 0, 2);
		world.setBlock(X + 1, Y, Z, EW, 0, 2);
		world.setBlock(X - 1, Y, Z, EW, 0, 2);
		world.setBlock(X + 1, Y, Z + 1, NE, 0, 2);
		world.setBlock(X + 1, Y, Z - 1, SE, 0, 2);
		world.setBlock(X - 1, Y, Z - 1, SW, 0, 2);
		world.setBlock(X - 1, Y, Z + 1, NW, 0, 2);
	}

	private void flint03GenSand(World world, int X, int Y, int Z) {

		// Flint Block
		world.setBlock(X, Y, Z, FLINT_03, 0, 2);

		// Main Y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(X + 1 + -iii, Y + -1 + i, Z + 1 + -ii, SAND, 0, 2);
				}
		world.setBlock(X, Y, Z + 1, NS, 0, 2);
		world.setBlock(X, Y, Z - 1, NS, 0, 2);
		world.setBlock(X + 1, Y, Z, EW, 0, 2);
		world.setBlock(X - 1, Y, Z, EW, 0, 2);
		world.setBlock(X + 1, Y, Z + 1, NE, 0, 2);
		world.setBlock(X + 1, Y, Z - 1, SE, 0, 2);
		world.setBlock(X - 1, Y, Z - 1, SW, 0, 2);
		world.setBlock(X - 1, Y, Z + 1, NW, 0, 2);
	}

	private void flint03GenGravel(World world, int X, int Y, int Z) {

		// Flint Block
		world.setBlock(X, Y, Z, FLINT_03, 0, 2);

		// Main Y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(X + 1 + -iii, Y + -1 + i, Z + 1 + -ii, GRAVEL, 0, 2);
				}
		world.setBlock(X, Y, Z + 1, NS, 0, 2);
		world.setBlock(X, Y, Z - 1, NS, 0, 2);
		world.setBlock(X + 1, Y, Z, EW, 0, 2);
		world.setBlock(X - 1, Y, Z, EW, 0, 2);
		world.setBlock(X + 1, Y, Z + 1, NE, 0, 2);
		world.setBlock(X + 1, Y, Z - 1, SE, 0, 2);
		world.setBlock(X - 1, Y, Z - 1, SW, 0, 2);
		world.setBlock(X - 1, Y, Z + 1, NW, 0, 2);
	}

	// Flint 04
	private void flint04GenGrass(World world, int X, int Y, int Z) {

		// Flint Block
		world.setBlock(X, Y, Z, FLINT_04, 0, 2);

		// Main Y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(X + 1 + -iii, Y + -1 + i, Z + 1 + -ii, GRASS, 0, 2);
				}
		world.setBlock(X, Y, Z + 1, NS, 0, 2);
		world.setBlock(X, Y, Z - 1, NS, 0, 2);
		world.setBlock(X + 1, Y, Z, EW, 0, 2);
		world.setBlock(X - 1, Y, Z, EW, 0, 2);
		world.setBlock(X + 1, Y, Z + 1, NE, 0, 2);
		world.setBlock(X + 1, Y, Z - 1, SE, 0, 2);
		world.setBlock(X - 1, Y, Z - 1, SW, 0, 2);
		world.setBlock(X - 1, Y, Z + 1, NW, 0, 2);
	}

	private void flint04GenStone(World world, int X, int Y, int Z) {

		// Flint Block
		world.setBlock(X, Y, Z, FLINT_04, 0, 2);

		// Main Y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(X + 1 + -iii, Y + -1 + i, Z + 1 + -ii, STONE, 0, 2);
				}
		world.setBlock(X, Y, Z + 1, NS, 0, 2);
		world.setBlock(X, Y, Z - 1, NS, 0, 2);
		world.setBlock(X + 1, Y, Z, EW, 0, 2);
		world.setBlock(X - 1, Y, Z, EW, 0, 2);
		world.setBlock(X + 1, Y, Z + 1, NE, 0, 2);
		world.setBlock(X + 1, Y, Z - 1, SE, 0, 2);
		world.setBlock(X - 1, Y, Z - 1, SW, 0, 2);
		world.setBlock(X - 1, Y, Z + 1, NW, 0, 2);
	}

	private void flint04GenSand(World world, int X, int Y, int Z) {

		// Flint Block
		world.setBlock(X, Y, Z, FLINT_04, 0, 2);

		// Main Y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(X + 1 + -iii, Y + -1 + i, Z + 1 + -ii, SAND, 0, 2);
				}
		world.setBlock(X, Y, Z + 1, NS, 0, 2);
		world.setBlock(X, Y, Z - 1, NS, 0, 2);
		world.setBlock(X + 1, Y, Z, EW, 0, 2);
		world.setBlock(X - 1, Y, Z, EW, 0, 2);
		world.setBlock(X + 1, Y, Z + 1, NE, 0, 2);
		world.setBlock(X + 1, Y, Z - 1, SE, 0, 2);
		world.setBlock(X - 1, Y, Z - 1, SW, 0, 2);
		world.setBlock(X - 1, Y, Z + 1, NW, 0, 2);
	}

	private void flint04GenGravel(World world, int X, int Y, int Z) {

		// Flint Block
		world.setBlock(X, Y, Z, FLINT_04, 0, 2);

		// Main Y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(X + 1 + -iii, Y + -1 + i, Z + 1 + -ii, GRAVEL, 0, 2);
				}
		world.setBlock(X, Y, Z + 1, NS, 0, 2);
		world.setBlock(X, Y, Z - 1, NS, 0, 2);
		world.setBlock(X + 1, Y, Z, EW, 0, 2);
		world.setBlock(X - 1, Y, Z, EW, 0, 2);
		world.setBlock(X + 1, Y, Z + 1, NE, 0, 2);
		world.setBlock(X + 1, Y, Z - 1, SE, 0, 2);
		world.setBlock(X - 1, Y, Z - 1, SW, 0, 2);
		world.setBlock(X - 1, Y, Z + 1, NW, 0, 2);
	}
}
