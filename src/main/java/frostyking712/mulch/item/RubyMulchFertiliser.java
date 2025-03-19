package frostyking712.mulch.item;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;

public class RubyMulchFertiliser extends Item {
    public RubyMulchFertiliser(Properties pProperties) {
        super(pProperties);
    }
    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos centerPos = context.getClickedPos();
        Player player = context.getPlayer();

        if (!level.isClientSide) {  // Server-side only
            boolean didGrow = false;

            for (int dx = -7; dx <= 7; dx++) {  // Loop over X (-7 to +7)
                for (int dz = -7; dz <= 7; dz++) {  // Loop over Z (-7 to +7)
                    BlockPos pos = centerPos.offset(dx, 0, dz);
                    BlockState state = level.getBlockState(pos);
                    Block block = state.getBlock();

                    if (block instanceof BonemealableBlock && block instanceof CropBlock crop) {
                        int maxAge = crop.getMaxAge();
                        BlockState fullyGrownState = crop.getStateForAge(maxAge);

                        // If the crop is not fully grown, set it to fully grown
                        if (state.getValue(CropBlock.AGE) < maxAge) {
                            level.setBlock(pos, fullyGrownState, 2);
                            level.sendBlockUpdated(pos, state, fullyGrownState, 3);
                            didGrow = true;

                            // Particles for crop growth
                            spawnParticles(level, pos);
                        }
                    }
                    // 🌾 Handle Sugarcane Growth (up to 5 blocks)
                    else if (block == Blocks.SUGAR_CANE) {
                        growColumn(level, pos, Blocks.SUGAR_CANE, 5); // Grow up to 5 blocks
                        didGrow = true;
                    }
                    // 🌵 Handle Cactus Growth (up to 5 blocks)
                    else if (block == Blocks.CACTUS) {
                        growColumn(level, pos, Blocks.CACTUS, 5); // Grow up to 5 blocks
                        didGrow = true;
                    }
                    // 🌱 Handle Nether Wart Growth (up to max age of 3)
                    else if (block == Blocks.NETHER_WART) {
                        if (state.getValue(NetherWartBlock.AGE) < 3) {
                            BlockState fullyGrownState = Blocks.NETHER_WART.defaultBlockState().setValue(NetherWartBlock.AGE, 3);
                            level.setBlock(pos, fullyGrownState, 2);
                            level.sendBlockUpdated(pos, state, fullyGrownState, 3);
                            didGrow = true;

                            // Particles for Nether Wart growth
                            spawnParticles(level, pos);
                        }
                    }
                }
            }
            if (didGrow) {
                context.getItemInHand().shrink(1);
            }
        }
        return InteractionResult.FAIL;
    }

    private void growColumn(Level level, BlockPos basePos, Block blockType, int maxHeight) {
        BlockPos topPos = basePos.above();
        int height = 1;  // Already one block is there

        // Count existing height
        while (level.getBlockState(topPos).is(blockType)) {
            height++;
            topPos = topPos.above();
        }

        // Grow up to maxHeight (if there's space)
        while (height < maxHeight && level.isEmptyBlock(topPos)) {
            level.setBlock(topPos, blockType.defaultBlockState(), 2);
            level.sendBlockUpdated(topPos, Blocks.AIR.defaultBlockState(), blockType.defaultBlockState(), 3);
            spawnParticles(level, topPos);

            height++;
            topPos = topPos.above();
        }
    }
    private void spawnParticles(Level level, BlockPos pos) {
        if (level instanceof ServerLevel serverLevel) {
            serverLevel.sendParticles(ParticleTypes.HAPPY_VILLAGER,
                    pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5,
                    20, 0.5, 0.5, 0.5, 0.1);
        }
    }
}
