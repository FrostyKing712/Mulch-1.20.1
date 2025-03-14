package frostyking712.mulch.datagen;

import frostyking712.mulch.Mulch;
import frostyking712.mulch.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Mulch.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.BROWN_MULCH);
        blockWithItem(ModBlocks.YELLOW_MULCH);
        blockWithItem(ModBlocks.AMBER_MULCH);
        blockWithItem(ModBlocks.RUBY_MULCH);
        blockWithItem(ModBlocks.RED_MULCH);
        blockWithItem(ModBlocks.BLACK_MULCH);
        blockWithItem(ModBlocks.BLUE_MULCH);

        blockWithItem(ModBlocks.PORTAL_CORE_MULCH);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}