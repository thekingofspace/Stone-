
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.raysstone.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.mcreator.raysstone.block.GroutBlock;
import net.mcreator.raysstone.block.CopperSulfateOreBlock;
import net.mcreator.raysstone.block.CobbledCalveriteBlock;
import net.mcreator.raysstone.block.CalveriteBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RaysstoneModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block CALVERITE = register(new CalveriteBlock());
	public static final Block COBBLED_CALVERITE = register(new CobbledCalveriteBlock());
	public static final Block COPPER_SULFATE_ORE = register(new CopperSulfateOreBlock());
	public static final Block GROUT = register(new GroutBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
