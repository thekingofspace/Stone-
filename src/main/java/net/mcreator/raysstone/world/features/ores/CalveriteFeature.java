
package net.mcreator.raysstone.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.raysstone.init.RaysstoneModBlocks;

import java.util.Set;
import java.util.Random;

public class CalveriteFeature extends OreFeature {
	public static final CalveriteFeature FEATURE = (CalveriteFeature) new CalveriteFeature().setRegistryName("raysstone:calverite");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(CalveriteFeatureRuleTest.INSTANCE, RaysstoneModBlocks.CALVERITE.defaultBlockState(), 27))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(37)))).squared().count(25);
	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public CalveriteFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}

	private static class CalveriteFeatureRuleTest extends RuleTest {
		static final CalveriteFeatureRuleTest INSTANCE = new CalveriteFeatureRuleTest();
		static final com.mojang.serialization.Codec<CalveriteFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		static final RuleTestType<CalveriteFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("raysstone:calverite_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;
			if (blockAt.getBlock() == Blocks.DEEPSLATE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.DEEPSLATE_COAL_ORE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.DEEPSLATE_IRON_ORE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.DEEPSLATE_REDSTONE_ORE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.DEEPSLATE_GOLD_ORE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.DEEPSLATE_LAPIS_ORE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.DEEPSLATE_DIAMOND_ORE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.DEEPSLATE_EMERALD_ORE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.DEEPSLATE_COPPER_ORE)
				blockCriteria = true;
			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
