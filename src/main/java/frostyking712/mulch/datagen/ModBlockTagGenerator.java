package frostyking712.mulch.datagen;

import frostyking712.mulch.Mulch;
import frostyking712.mulch.block.ModBlocks;
import frostyking712.mulch.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator  extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Mulch.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.MulchTag)
                .add(ModBlocks.BROWN_MULCH.get())
                .add(ModBlocks.YELLOW_MULCH.get())
                .add(ModBlocks.AMBER_MULCH.get())
                .add(ModBlocks.RUBY_MULCH.get())
                .add(ModBlocks.RED_MULCH.get())
                .add(ModBlocks.BLACK_MULCH.get())
                .add(ModBlocks.BLUE_MULCH.get());
        this.tag(ModTags.Blocks.PortalMulchTag)
                .add(ModBlocks.PORTAL_CORE_MULCH.get());
    }
}
