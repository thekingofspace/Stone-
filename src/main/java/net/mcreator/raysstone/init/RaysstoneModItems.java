
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.raysstone.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.raysstone.item.PolishedCopperSulfateItem;
import net.mcreator.raysstone.item.CrushedRochelleSaltsItem;
import net.mcreator.raysstone.item.CopperSulfateChunkItem;
import net.mcreator.raysstone.item.CopperInfusedIronItem;
import net.mcreator.raysstone.item.CopperInfusedChunksItem;
import net.mcreator.raysstone.RaysstoneMod;

public class RaysstoneModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RaysstoneMod.MODID);
	public static final RegistryObject<Item> CALVERITE = block(RaysstoneModBlocks.CALVERITE, RaysstoneModTabs.TAB_MINERALS);
	public static final RegistryObject<Item> COBBLED_CALVERITE = block(RaysstoneModBlocks.COBBLED_CALVERITE, RaysstoneModTabs.TAB_MINERALS);
	public static final RegistryObject<Item> COPPER_SULFATE_CHUNK = REGISTRY.register("copper_sulfate_chunk", () -> new CopperSulfateChunkItem());
	public static final RegistryObject<Item> COPPER_SULFATE_ORE = block(RaysstoneModBlocks.COPPER_SULFATE_ORE, RaysstoneModTabs.TAB_ORES);
	public static final RegistryObject<Item> COPPER_INFUSED_IRON = REGISTRY.register("copper_infused_iron", () -> new CopperInfusedIronItem());
	public static final RegistryObject<Item> COPPER_INFUSED_CHUNKS = REGISTRY.register("copper_infused_chunks", () -> new CopperInfusedChunksItem());
	public static final RegistryObject<Item> GROUT = block(RaysstoneModBlocks.GROUT, RaysstoneModTabs.TAB_MINERALS);
	public static final RegistryObject<Item> POLISHED_COPPER_SULFATE = REGISTRY.register("polished_copper_sulfate",
			() -> new PolishedCopperSulfateItem());
	public static final RegistryObject<Item> CRUSHED_ROCHELLE_SALTS = REGISTRY.register("crushed_rochelle_salts",
			() -> new CrushedRochelleSaltsItem());
	public static final RegistryObject<Item> ROCHELLE_SALTS_ORE = block(RaysstoneModBlocks.ROCHELLE_SALTS_ORE, RaysstoneModTabs.TAB_ORES);
	public static final RegistryObject<Item> SCHEELITE_ORE = block(RaysstoneModBlocks.SCHEELITE_ORE, RaysstoneModTabs.TAB_ORES);
	public static final RegistryObject<Item> DSFASDF = block(RaysstoneModBlocks.DSFASDF, RaysstoneModTabs.TAB_ORES);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
