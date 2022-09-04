
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.raysstone.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.raysstone.block.ScheeliteOreBlock;
import net.mcreator.raysstone.block.RochelleSaltsOreBlock;
import net.mcreator.raysstone.block.PlastarBlock;
import net.mcreator.raysstone.block.GroutBlock;
import net.mcreator.raysstone.block.CopperSulfateOreBlock;
import net.mcreator.raysstone.block.CobbledCalveriteBlock;
import net.mcreator.raysstone.block.CalveriteBlock;
import net.mcreator.raysstone.RaysstoneMod;

public class RaysstoneModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RaysstoneMod.MODID);
	public static final RegistryObject<Block> CALVERITE = REGISTRY.register("calverite", () -> new CalveriteBlock());
	public static final RegistryObject<Block> COBBLED_CALVERITE = REGISTRY.register("cobbled_calverite", () -> new CobbledCalveriteBlock());
	public static final RegistryObject<Block> COPPER_SULFATE_ORE = REGISTRY.register("copper_sulfate_ore", () -> new CopperSulfateOreBlock());
	public static final RegistryObject<Block> GROUT = REGISTRY.register("grout", () -> new GroutBlock());
	public static final RegistryObject<Block> ROCHELLE_SALTS_ORE = REGISTRY.register("rochelle_salts_ore", () -> new RochelleSaltsOreBlock());
	public static final RegistryObject<Block> SCHEELITE_ORE = REGISTRY.register("scheelite_ore", () -> new ScheeliteOreBlock());
	public static final RegistryObject<Block> PLASTAR = REGISTRY.register("plastar", () -> new PlastarBlock());
}
