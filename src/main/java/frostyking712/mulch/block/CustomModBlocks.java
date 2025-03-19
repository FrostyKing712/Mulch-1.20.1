package frostyking712.mulch.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.piston.MovingPistonBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;

public class CustomModBlocks extends FarmBlock {
    private static final VoxelShape FULL_BLOCK_SHAPE = Shapes.block();

    public CustomModBlocks(Properties pProperties) {
        super(pProperties);
    }
    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, IPlantable plantable) {
        var type = plantable.getPlantType(world, pos.relative(direction));
        return type == PlantType.CROP  // Wheat, Carrots, Potatoes, Beetroots
                || type == PlantType.PLAINS // Grass, Flowers, Saplings
                || type == PlantType.NETHER // Nether Wart
                || type == PlantType.WATER  // Lily Pads
                || type == PlantType.BEACH  // Sugarcane, Cactus
                || type == PlantType.DESERT; // More desert plants
    }
    @Override
    public void fallOn(Level level, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        entity.causeFallDamage(fallDistance, 1.0F, level.damageSources().fall());
    }
    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        return true;
    }
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return FULL_BLOCK_SHAPE;
    }
    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {

    }
}