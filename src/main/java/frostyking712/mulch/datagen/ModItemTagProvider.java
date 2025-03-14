package frostyking712.mulch.datagen;

import frostyking712.mulch.Mulch;
import frostyking712.mulch.block.ModBlocks;
import frostyking712.mulch.item.ModItems;
import frostyking712.mulch.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, Mulch.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Items.MulchTag)
                .add(Item.byBlock(ModBlocks.BROWN_MULCH.get()))
                .add(Item.byBlock(ModBlocks.YELLOW_MULCH.get()))
                .add(Item.byBlock(ModBlocks.AMBER_MULCH.get()))
                .add(Item.byBlock(ModBlocks.RUBY_MULCH.get()))
                .add(Item.byBlock(ModBlocks.RED_MULCH.get()))
                .add(Item.byBlock(ModBlocks.BLACK_MULCH.get()))
                .add(Item.byBlock(ModBlocks.BLUE_MULCH.get()));

        this.tag(ModTags.Items.PortalMulchTag)
                .add(Item.byBlock(ModBlocks.PORTAL_CORE_MULCH.get()))
                .add(ModItems.MULCH_PORTAL_LIGHTER.get());
    }
}
