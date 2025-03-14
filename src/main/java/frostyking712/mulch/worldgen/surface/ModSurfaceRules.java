package frostyking712.mulch.worldgen.surface;

import com.google.common.collect.ImmutableList;
import frostyking712.mulch.block.ModBlocks;
import frostyking712.mulch.worldgen.biome.ModBiomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;

public class ModSurfaceRules {
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final SurfaceRules.RuleSource BROWN_MULCH = makeStateRule(ModBlocks.BROWN_MULCH.get());
    private static final SurfaceRules.RuleSource YELLOW_MULCH = makeStateRule(ModBlocks.YELLOW_MULCH.get());
    private static final SurfaceRules.RuleSource AMBER_MULCH = makeStateRule(ModBlocks.AMBER_MULCH.get());
    private static final SurfaceRules.RuleSource RUBY_MULCH = makeStateRule(ModBlocks.RUBY_MULCH.get());
    private static final SurfaceRules.RuleSource RED_MULCH = makeStateRule(ModBlocks.RED_MULCH.get());
    private static final SurfaceRules.RuleSource BLACK_MULCH = makeStateRule(ModBlocks.BLACK_MULCH.get());
    private static final SurfaceRules.RuleSource BLUE_MULCH = makeStateRule(ModBlocks.BLUE_MULCH.get());
    private static final SurfaceRules.RuleSource PORTAL_CORE_MULCH = makeStateRule(ModBlocks.PORTAL_CORE_MULCH.get());
    private static final SurfaceRules.RuleSource BEDROCK = makeStateRule(Blocks.BEDROCK);

    public static SurfaceRules.RuleSource makeRules() {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);

        SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        return SurfaceRules.sequence(
                SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.MULCH_WORLD),
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, BROWN_MULCH)),

                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, grassSurface)
        ));
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
    public static SurfaceRules.RuleSource dimRules() {
        return dimRules(true, false, true);
    }

    static ImmutableList.Builder<SurfaceRules.RuleSource> builder = ImmutableList.builder();

    public static SurfaceRules.RuleSource dimRules(boolean isSurface, boolean bedrockRoof, boolean bedrockFloor) {
        SurfaceRules.ConditionSource deepslateLevel = SurfaceRules.verticalGradient("deepslate", VerticalAnchor.absolute(0), VerticalAnchor.absolute(8));

        if (bedrockFloor) {
            builder.add(SurfaceRules.ifTrue(SurfaceRules.verticalGradient("bedrock_floor", VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(5)), BEDROCK));
        }

        builder.add(SurfaceRules.ifTrue(SurfaceRules.verticalGradient("portal_core_mulch", VerticalAnchor.absolute(-50), VerticalAnchor.absolute(-1)), PORTAL_CORE_MULCH ));
        builder.add(SurfaceRules.ifTrue(SurfaceRules.verticalGradient("blue_mulch", VerticalAnchor.absolute(-30), VerticalAnchor.absolute(-1)), BLUE_MULCH));
        builder.add(SurfaceRules.ifTrue(SurfaceRules.verticalGradient("black_mulch", VerticalAnchor.absolute(-10), VerticalAnchor.absolute(-1)), BLACK_MULCH));
        builder.add(SurfaceRules.ifTrue(SurfaceRules.verticalGradient("red_mulch", VerticalAnchor.absolute(5), VerticalAnchor.absolute(0)), RED_MULCH));
        builder.add(SurfaceRules.ifTrue(SurfaceRules.verticalGradient("ruby_mulch", VerticalAnchor.absolute(20), VerticalAnchor.absolute(0)), RUBY_MULCH));
        builder.add(SurfaceRules.ifTrue(SurfaceRules.verticalGradient("amber_mulch", VerticalAnchor.absolute(40), VerticalAnchor.absolute(0)), AMBER_MULCH));
        builder.add(SurfaceRules.ifTrue(SurfaceRules.verticalGradient("yellow_mulch", VerticalAnchor.absolute(58), VerticalAnchor.absolute(0)), YELLOW_MULCH));
        builder.add(SurfaceRules.ifTrue(SurfaceRules.verticalGradient("brown_mulch", VerticalAnchor.absolute(256), VerticalAnchor.absolute(0)), BROWN_MULCH));

        return SurfaceRules.sequence(builder.build().toArray((rules) -> {
            return new SurfaceRules.RuleSource[rules];
        }));
    }
}
