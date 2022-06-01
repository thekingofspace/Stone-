
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.raysstone.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.raysstone.world.features.ores.ScheeliteOreFeature;
import net.mcreator.raysstone.world.features.ores.RochelleSaltsOreFeature;
import net.mcreator.raysstone.world.features.ores.GroutFeature;
import net.mcreator.raysstone.world.features.ores.CopperSulfateOreFeature;
import net.mcreator.raysstone.world.features.ores.CalveriteFeature;
import net.mcreator.raysstone.RaysstoneMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class RaysstoneModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, RaysstoneMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> CALVERITE = register("calverite", CalveriteFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CalveriteFeature.GENERATE_BIOMES, CalveriteFeature::placedFeature));
	public static final RegistryObject<Feature<?>> COPPER_SULFATE_ORE = register("copper_sulfate_ore", CopperSulfateOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, CopperSulfateOreFeature.GENERATE_BIOMES,
					CopperSulfateOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> GROUT = register("grout", GroutFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, GroutFeature.GENERATE_BIOMES, GroutFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ROCHELLE_SALTS_ORE = register("rochelle_salts_ore", RochelleSaltsOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, RochelleSaltsOreFeature.GENERATE_BIOMES,
					RochelleSaltsOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SCHEELITE_ORE = register("scheelite_ore", ScheeliteOreFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, ScheeliteOreFeature.GENERATE_BIOMES, ScheeliteOreFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
