package frostyking712.mulch.datagen.loot;

import frostyking712.mulch.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;


public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.BROWN_MULCH.get());
        this.dropSelf(ModBlocks.YELLOW_MULCH.get());
        this.dropSelf(ModBlocks.AMBER_MULCH.get());
        this.dropSelf(ModBlocks.RUBY_MULCH.get());
        this.dropSelf(ModBlocks.RED_MULCH.get());
        this.dropSelf(ModBlocks.BLACK_MULCH.get());
        this.dropSelf(ModBlocks.BLUE_MULCH.get());
        this.dropSelf(ModBlocks.PORTAL_CORE_MULCH.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}