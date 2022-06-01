
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.raysstone.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.raysstone.block.entity.DsfasdfBlockEntity;
import net.mcreator.raysstone.RaysstoneMod;

public class RaysstoneModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, RaysstoneMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> DSFASDF = register("dsfasdf", RaysstoneModBlocks.DSFASDF, DsfasdfBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
