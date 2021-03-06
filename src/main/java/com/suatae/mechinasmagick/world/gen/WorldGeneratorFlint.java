package com.suatae.mechinasmagick.world.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;

import com.suatae.mechinasmagick.common.init.registry.BlockReg;

import cpw.mods.fml.common.IWorldGenerator;





public class WorldGeneratorFlint implements IWorldGenerator {
	public static Block	air		= Blocks.air;
	public static Block	stone	= Blocks.stone;
	public static Block	grass	= Blocks.grass;
	public static Block	sand	= Blocks.sand;
	public static Block	gravel	= Blocks.gravel;
	public static Block	flint	= BlockReg.blockFlint;

	public static Block	ew		= BlockReg.EW;
	public static Block	ns		= BlockReg.NS;
	public static Block	ne		= BlockReg.NE;
	public static Block	se		= BlockReg.SE;
	public static Block	sw		= BlockReg.SW;
	public static Block	nw		= BlockReg.NW;

	public static int	y		= -1;
	public static int	yy		= 1;
	public static int	zz		= 1;

	@Override
	public void generate(Random random, int chunkx, int chunkz, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		int x = chunkx * 16;
		int z = chunkz * 16;
		switch (world.provider.dimensionId) {
			case -1:
				generatenether(world, x, z, random);
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

	private void generatenether(World world, int x, int z, Random random) {}

	private void generateSurface(World world, int x, int z, Random random) {
		// Flint 01
		if (random.nextInt(6) == 0) {
			int randx = x + random.nextInt(16);
			int randy = world.getTopSolidOrLiquidBlock(x, z);
			int randz = z + random.nextInt(16);
			if (world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.river
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.deepOcean
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.ocean
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.mesa
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.mesaPlateau
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.mesaPlateau_F) {
				Block block = world.getBlock(randx, randy + y, randz);
				if (!(block != grass)) {
					if (world.isAirBlock(randx, randy + yy, randz)) {
						if (world.isAirBlock(randx, randy, randz + zz)) {
							if (world.isAirBlock(randx, randy, randz - zz)) {
								flint01GenGrass(world, randx, randy, randz);
							}
						}
					}
				}
				Block block1 = world.getBlock(randx, randy + y, randz);
				if (!(block1 != stone)) {
					if (world.isAirBlock(randx, randy + yy, randz)) {
						if (world.isAirBlock(randx, randy, randz + zz)) {
							if (world.isAirBlock(randx, randy, randz - zz)) {
								flint01Genstone(world, randx, randy, randz);
							}
						}
					}
				}
				Block block2 = world.getBlock(randx, randy + y, randz);
				if (!(block2 != sand)) {
					if (world.isAirBlock(randx, randy + yy, randz)) {
						if (world.isAirBlock(randx, randy, randz + zz)) {
							if (world.isAirBlock(randx, randy, randz - zz)) {
								flint01Gensand(world, randx, randy, randz);
							}
						}
					}
				}
				Block block3 = world.getBlock(randx, randy + y, randz);
				if (!(block3 != gravel)) {
					if (world.isAirBlock(randx, randy + yy, randz)) {
						if (world.isAirBlock(randx, randy, randz + zz)) {
							if (world.isAirBlock(randx, randy, randz - zz)) {
								flint01Gengravel(world, randx, randy, randz);
							}
						}
					}
				}
			}
		}
		// Flint 02
		if (random.nextInt(8) == 0) {
			int randx = x + random.nextInt(16);
			int randy = world.getTopSolidOrLiquidBlock(x, z);
			int randz = z + random.nextInt(16);
			if (world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.river
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.deepOcean
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.ocean
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.mesa
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.mesaPlateau
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.mesaPlateau_F) {
				Block block = world.getBlock(randx, randy + y, randz);
				if (!(block != grass)) {
					if (world.isAirBlock(randx, randy + yy, randz)) {
						if (world.isAirBlock(randx, randy, randz + zz)) {
							if (world.isAirBlock(randx, randy, randz - zz)) {
								flint02GenGrass(world, randx, randy, randz);
							}
						}
					}
				}
				Block block1 = world.getBlock(randx, randy + y, randz);
				if (!(block1 != stone)) {
					if (world.isAirBlock(randx, randy + yy, randz)) {
						if (world.isAirBlock(randx, randy, randz + zz)) {
							if (world.isAirBlock(randx, randy, randz - zz)) {
								flint02Genstone(world, randx, randy, randz);
							}
						}
					}
				}
				Block block2 = world.getBlock(randx, randy + y, randz);
				if (!(block2 != sand)) {
					if (world.isAirBlock(randx, randy + yy, randz)) {
						if (world.isAirBlock(randx, randy, randz + zz)) {
							if (world.isAirBlock(randx, randy, randz - zz)) {
								flint02Gensand(world, randx, randy, randz);
							}
						}
					}
				}
				Block block3 = world.getBlock(randx, randy + y, randz);
				if (!(block3 != gravel)) {
					if (world.isAirBlock(randx, randy + yy, randz)) {
						if (world.isAirBlock(randx, randy, randz + zz)) {
							if (world.isAirBlock(randx, randy, randz - zz)) {
								flint02Gengravel(world, randx, randy, randz);
							}
						}
					}
				}
			}
		}
		// Flint 03
		if (random.nextInt(16) == 0) {
			int randx = x + random.nextInt(16);
			int randy = world.getTopSolidOrLiquidBlock(x, z);
			int randz = z + random.nextInt(16);
			if (world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.river
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.deepOcean
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.ocean
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.mesa
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.mesaPlateau
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.mesaPlateau_F) {
				Block block = world.getBlock(randx, randy + y, randz);
				if (!(block != grass)) {
					if (world.isAirBlock(randx, randy + yy, randz)) {
						if (world.isAirBlock(randx, randy, randz + zz)) {
							if (world.isAirBlock(randx, randy, randz - zz)) {
								flint03GenGrass(world, randx, randy, randz);
							}
						}
					}
				}
				Block block1 = world.getBlock(randx, randy + y, randz);
				if (!(block1 != stone)) {
					if (world.isAirBlock(randx, randy + yy, randz)) {
						if (world.isAirBlock(randx, randy, randz + zz)) {
							if (world.isAirBlock(randx, randy, randz - zz)) {
								flint03Genstone(world, randx, randy, randz);
							}
						}
					}
				}
				Block block2 = world.getBlock(randx, randy + y, randz);
				if (!(block2 != sand)) {
					if (world.isAirBlock(randx, randy + yy, randz)) {
						if (world.isAirBlock(randx, randy, randz + zz)) {
							if (world.isAirBlock(randx, randy, randz - zz)) {
								flint03Gensand(world, randx, randy, randz);
							}
						}
					}
				}
				Block block3 = world.getBlock(randx, randy + y, randz);
				if (!(block3 != gravel)) {
					if (world.isAirBlock(randx, randy + yy, randz)) {
						if (world.isAirBlock(randx, randy, randz + zz)) {
							if (world.isAirBlock(randx, randy, randz - zz)) {
								flint03Gengravel(world, randx, randy, randz);
							}
						}
					}
				}
			}
		}
		// Flint 04
		if (random.nextInt(12) == 0) {
			int randx = x + random.nextInt(16);
			int randy = world.getTopSolidOrLiquidBlock(x, z);
			int randz = z + random.nextInt(16);
			if (world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.river
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.deepOcean
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.ocean
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.mesa
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.mesaPlateau
					&& world.getBiomeGenForCoords(randx, randz) != BiomeGenBase.mesaPlateau_F) {
				Block block = world.getBlock(randx, randy + y, randz);
				if (!(block != grass)) {
					if (world.isAirBlock(randx, randy + yy, randz)) {
						if (world.isAirBlock(randx, randy, randz + zz)) {
							if (world.isAirBlock(randx, randy, randz - zz)) {
								flint04GenGrass(world, randx, randy, randz);
							}
						}
					}
				}
				Block block1 = world.getBlock(randx, randy + y, randz);
				if (!(block1 != stone)) {
					Block blocka = world.getBlock(randx, randy + yy, randz);
					if (world.isAirBlock(randx, randy + yy, randz)) {
						if (world.isAirBlock(randx, randy, randz + zz)) {
							if (world.isAirBlock(randx, randy, randz - zz)) {
								flint04Genstone(world, randx, randy, randz);
							}
						}
					}
				}
				Block block2 = world.getBlock(randx, randy + y, randz);
				if (!(block2 != sand)) {
					Block blocka = world.getBlock(randx, randy + yy, randz);
					if (world.isAirBlock(randx, randy + yy, randz)) {
						if (world.isAirBlock(randx, randy, randz + zz)) {
							if (world.isAirBlock(randx, randy, randz - zz)) {
								flint04Gensand(world, randx, randy, randz);
							}
						}
					}
				}
				Block block3 = world.getBlock(randx, randy + y, randz);
				if (!(block3 != gravel)) {
					if (world.isAirBlock(randx, randy + yy, randz)) {
						if (world.isAirBlock(randx, randy, randz + zz)) {
							if (world.isAirBlock(randx, randy, randz - zz)) {
								flint04Gengravel(world, randx, randy, randz);
							}
						}
					}
				}
			}
		}
	}

	private void generateEnd(World world, int x, int z, Random random) {}

	// Flint 01
	private void flint01GenGrass(World world, int x, int y, int z) {

		// Flint Block
		world.setBlock(x, y, z, flint, 0, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 - iii, y - 1 + i, z + 1 - ii, grass, 0, 2);
				}
		world.setBlock(x, y, z + 1, ns, 0, 2);
		world.setBlock(x, y, z - 1, ns, 0, 2);
		world.setBlock(x + 1, y, z, ew, 0, 2);
		world.setBlock(x - 1, y, z, ew, 0, 2);
		world.setBlock(x + 1, y, z + 1, ne, 0, 2);
		world.setBlock(x + 1, y, z - 1, se, 0, 2);
		world.setBlock(x - 1, y, z - 1, sw, 0, 2);
		world.setBlock(x - 1, y, z + 1, nw, 0, 2);
	}

	private void flint01Genstone(World world, int x, int y, int z) {

		// Flint Block
		world.setBlock(x, y, z, flint, 0, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, stone, 0, 2);
				}
		world.setBlock(x, y, z + 1, ns, 0, 2);
		world.setBlock(x, y, z - 1, ns, 0, 2);
		world.setBlock(x + 1, y, z, ew, 0, 2);
		world.setBlock(x - 1, y, z, ew, 0, 2);
		world.setBlock(x + 1, y, z + 1, ne, 0, 2);
		world.setBlock(x + 1, y, z - 1, se, 0, 2);
		world.setBlock(x - 1, y, z - 1, sw, 0, 2);
		world.setBlock(x - 1, y, z + 1, nw, 0, 2);
	}

	private void flint01Gensand(World world, int x, int y, int z) {

		// Flint Block
		world.setBlock(x, y, z, flint, 0, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, sand, 0, 2);
				}
		world.setBlock(x, y, z + 1, ns, 0, 2);
		world.setBlock(x, y, z - 1, ns, 0, 2);
		world.setBlock(x + 1, y, z, ew, 0, 2);
		world.setBlock(x - 1, y, z, ew, 0, 2);
		world.setBlock(x + 1, y, z + 1, ne, 0, 2);
		world.setBlock(x + 1, y, z - 1, se, 0, 2);
		world.setBlock(x - 1, y, z - 1, sw, 0, 2);
		world.setBlock(x - 1, y, z + 1, nw, 0, 2);
	}

	private void flint01Gengravel(World world, int x, int y, int z) {

		// Flint Block
		world.setBlock(x, y, z, flint, 0, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, gravel, 0, 2);
				}
		world.setBlock(x, y, z + 1, ns, 0, 2);
		world.setBlock(x, y, z - 1, ns, 0, 2);
		world.setBlock(x + 1, y, z, ew, 0, 2);
		world.setBlock(x - 1, y, z, ew, 0, 2);
		world.setBlock(x + 1, y, z + 1, ne, 0, 2);
		world.setBlock(x + 1, y, z - 1, se, 0, 2);
		world.setBlock(x - 1, y, z - 1, sw, 0, 2);
		world.setBlock(x - 1, y, z + 1, nw, 0, 2);
	}

	// Flint 02
	private void flint02GenGrass(World world, int x, int y, int z) {

		// Flint Block
		world.setBlock(x, y, z, flint, 1, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, grass, 0, 2);
				}
		world.setBlock(x, y, z + 1, ns, 0, 2);
		world.setBlock(x, y, z - 1, ns, 0, 2);
		world.setBlock(x + 1, y, z, ew, 0, 2);
		world.setBlock(x - 1, y, z, ew, 0, 2);
		world.setBlock(x + 1, y, z + 1, ne, 0, 2);
		world.setBlock(x + 1, y, z - 1, se, 0, 2);
		world.setBlock(x - 1, y, z - 1, sw, 0, 2);
		world.setBlock(x - 1, y, z + 1, nw, 0, 2);
	}

	private void flint02Genstone(World world, int x, int y, int z) {

		// Flint Block
		world.setBlock(x, y, z, flint, 1, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, stone, 0, 2);
				}
		world.setBlock(x, y, z + 1, ns, 0, 2);
		world.setBlock(x, y, z - 1, ns, 0, 2);
		world.setBlock(x + 1, y, z, ew, 0, 2);
		world.setBlock(x - 1, y, z, ew, 0, 2);
		world.setBlock(x + 1, y, z + 1, ne, 0, 2);
		world.setBlock(x + 1, y, z - 1, se, 0, 2);
		world.setBlock(x - 1, y, z - 1, sw, 0, 2);
		world.setBlock(x - 1, y, z + 1, nw, 0, 2);
	}

	private void flint02Gensand(World world, int x, int y, int z) {

		// Flint Block
		world.setBlock(x, y, z, flint, 1, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, sand, 0, 2);
				}
		world.setBlock(x, y, z + 1, ns, 0, 2);
		world.setBlock(x, y, z - 1, ns, 0, 2);
		world.setBlock(x + 1, y, z, ew, 0, 2);
		world.setBlock(x - 1, y, z, ew, 0, 2);
		world.setBlock(x + 1, y, z + 1, ne, 0, 2);
		world.setBlock(x + 1, y, z - 1, se, 0, 2);
		world.setBlock(x - 1, y, z - 1, sw, 0, 2);
		world.setBlock(x - 1, y, z + 1, nw, 0, 2);
	}

	private void flint02Gengravel(World world, int x, int y, int z) {

		// Flint Block
		world.setBlock(x, y, z, flint, 1, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, gravel, 0, 2);
				}
		world.setBlock(x, y, z + 1, ns, 0, 2);
		world.setBlock(x, y, z - 1, ns, 0, 2);
		world.setBlock(x + 1, y, z, ew, 0, 2);
		world.setBlock(x - 1, y, z, ew, 0, 2);
		world.setBlock(x + 1, y, z + 1, ne, 0, 2);
		world.setBlock(x + 1, y, z - 1, se, 0, 2);
		world.setBlock(x - 1, y, z - 1, sw, 0, 2);
		world.setBlock(x - 1, y, z + 1, nw, 0, 2);
	}

	// Flint 03
	private void flint03GenGrass(World world, int x, int y, int z) {

		// Flint Block
		world.setBlock(x, y, z, flint, 2, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, grass, 0, 2);
				}
		world.setBlock(x, y, z + 1, ns, 0, 2);
		world.setBlock(x, y, z - 1, ns, 0, 2);
		world.setBlock(x + 1, y, z, ew, 0, 2);
		world.setBlock(x - 1, y, z, ew, 0, 2);
		world.setBlock(x + 1, y, z + 1, ne, 0, 2);
		world.setBlock(x + 1, y, z - 1, se, 0, 2);
		world.setBlock(x - 1, y, z - 1, sw, 0, 2);
		world.setBlock(x - 1, y, z + 1, nw, 0, 2);
	}

	private void flint03Genstone(World world, int x, int y, int z) {

		// Flint Block
		world.setBlock(x, y, z, flint, 2, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, stone, 0, 2);
				}
		world.setBlock(x, y, z + 1, ns, 0, 2);
		world.setBlock(x, y, z - 1, ns, 0, 2);
		world.setBlock(x + 1, y, z, ew, 0, 2);
		world.setBlock(x - 1, y, z, ew, 0, 2);
		world.setBlock(x + 1, y, z + 1, ne, 0, 2);
		world.setBlock(x + 1, y, z - 1, se, 0, 2);
		world.setBlock(x - 1, y, z - 1, sw, 0, 2);
		world.setBlock(x - 1, y, z + 1, nw, 0, 2);
	}

	private void flint03Gensand(World world, int x, int y, int z) {

		// Flint Block
		world.setBlock(x, y, z, flint, 2, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, sand, 0, 2);
				}
		world.setBlock(x, y, z + 1, ns, 0, 2);
		world.setBlock(x, y, z - 1, ns, 0, 2);
		world.setBlock(x + 1, y, z, ew, 0, 2);
		world.setBlock(x - 1, y, z, ew, 0, 2);
		world.setBlock(x + 1, y, z + 1, ne, 0, 2);
		world.setBlock(x + 1, y, z - 1, se, 0, 2);
		world.setBlock(x - 1, y, z - 1, sw, 0, 2);
		world.setBlock(x - 1, y, z + 1, nw, 0, 2);
	}

	private void flint03Gengravel(World world, int x, int y, int z) {

		// Flint Block
		world.setBlock(x, y, z, flint, 2, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, gravel, 0, 2);
				}
		world.setBlock(x, y, z + 1, ns, 0, 2);
		world.setBlock(x, y, z - 1, ns, 0, 2);
		world.setBlock(x + 1, y, z, ew, 0, 2);
		world.setBlock(x - 1, y, z, ew, 0, 2);
		world.setBlock(x + 1, y, z + 1, ne, 0, 2);
		world.setBlock(x + 1, y, z - 1, se, 0, 2);
		world.setBlock(x - 1, y, z - 1, sw, 0, 2);
		world.setBlock(x - 1, y, z + 1, nw, 0, 2);
	}

	// Flint 04
	private void flint04GenGrass(World world, int x, int y, int z) {

		// Flint Block
		world.setBlock(x, y, z, flint, 3, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, grass, 0, 2);
				}
		world.setBlock(x, y, z + 1, ns, 0, 2);
		world.setBlock(x, y, z - 1, ns, 0, 2);
		world.setBlock(x + 1, y, z, ew, 0, 2);
		world.setBlock(x - 1, y, z, ew, 0, 2);
		world.setBlock(x + 1, y, z + 1, ne, 0, 2);
		world.setBlock(x + 1, y, z - 1, se, 0, 2);
		world.setBlock(x - 1, y, z - 1, sw, 0, 2);
		world.setBlock(x - 1, y, z + 1, nw, 0, 2);
	}

	private void flint04Genstone(World world, int x, int y, int z) {

		// Flint Block
		world.setBlock(x, y, z, flint, 3, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, stone, 0, 2);
				}
		world.setBlock(x, y, z + 1, ns, 0, 2);
		world.setBlock(x, y, z - 1, ns, 0, 2);
		world.setBlock(x + 1, y, z, ew, 0, 2);
		world.setBlock(x - 1, y, z, ew, 0, 2);
		world.setBlock(x + 1, y, z + 1, ne, 0, 2);
		world.setBlock(x + 1, y, z - 1, se, 0, 2);
		world.setBlock(x - 1, y, z - 1, sw, 0, 2);
		world.setBlock(x - 1, y, z + 1, nw, 0, 2);
	}

	private void flint04Gensand(World world, int x, int y, int z) {

		// Flint Block
		world.setBlock(x, y, z, flint, 3, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, sand, 0, 2);
				}
		world.setBlock(x, y, z + 1, ns, 0, 2);
		world.setBlock(x, y, z - 1, ns, 0, 2);
		world.setBlock(x + 1, y, z, ew, 0, 2);
		world.setBlock(x - 1, y, z, ew, 0, 2);
		world.setBlock(x + 1, y, z + 1, ne, 0, 2);
		world.setBlock(x + 1, y, z - 1, se, 0, 2);
		world.setBlock(x - 1, y, z - 1, sw, 0, 2);
		world.setBlock(x - 1, y, z + 1, nw, 0, 2);
	}

	private void flint04Gengravel(World world, int x, int y, int z) {

		// Flint Block
		world.setBlock(x, y, z, flint, 3, 2);

		// Main y- Blocks
		for (int i = 0; i < 1; i++)
			for (int ii = 0; ii < 3; ii++)
				for (int iii = 0; iii < 3; iii++) {
					world.setBlock(x + 1 + -iii, y + -1 + i, z + 1 + -ii, gravel, 0, 2);
				}
		world.setBlock(x, y, z + 1, ns, 0, 2);
		world.setBlock(x, y, z - 1, ns, 0, 2);
		world.setBlock(x + 1, y, z, ew, 0, 2);
		world.setBlock(x - 1, y, z, ew, 0, 2);
		world.setBlock(x + 1, y, z + 1, ne, 0, 2);
		world.setBlock(x + 1, y, z - 1, se, 0, 2);
		world.setBlock(x - 1, y, z - 1, sw, 0, 2);
		world.setBlock(x - 1, y, z + 1, nw, 0, 2);
	}
}
