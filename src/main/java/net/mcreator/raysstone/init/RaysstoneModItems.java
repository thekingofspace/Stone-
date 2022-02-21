
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.raysstone.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.raysstone.item.CopperSulfateChunkItem;
import net.mcreator.raysstone.item.CopperInfusedIronItem;
import net.mcreator.raysstone.item.CopperInfusedChunksItem;
import net.mcreator.raysstone.item.CastItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RaysstoneModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item CALVERITE = register(RaysstoneModBlocks.CALVERITE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item COBBLED_CALVERITE = register(RaysstoneModBlocks.COBBLED_CALVERITE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item COPPER_SULFATE_CHUNK = register(new CopperSulfateChunkItem());
	public static final Item COPPER_SULFATE_ORE = register(RaysstoneModBlocks.COPPER_SULFATE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item COPPER_INFUSED_IRON = register(new CopperInfusedIronItem());
	public static final Item COPPER_INFUSED_CHUNKS = register(new CopperInfusedChunksItem());
	public static final Item GROUT = register(RaysstoneModBlocks.GROUT, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item CAST = register(new CastItem());
	public static final Item CARNEGIE_ORE = register(RaysstoneModBlocks.CARNEGIE_ORE, RaysstoneModTabs.TAB_ORES);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
