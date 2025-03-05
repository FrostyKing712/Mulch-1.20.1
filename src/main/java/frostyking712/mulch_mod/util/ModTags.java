package frostyking712.mulch_mod.util;

import frostyking712.mulch_mod.MulchMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
       public static final TagKey<Block> MulchTag = tag("mulch");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(MulchMod.MOD_ID, name));
        }
    }
}
