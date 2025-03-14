package frostyking712.mulch.util;

import frostyking712.mulch.Mulch;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
       public static final TagKey<Block> MulchTag = tag("mulch");
        public static final TagKey<Block> PortalMulchTag = tag("portal_mulch");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Mulch.MOD_ID, name));
        }
    }
    public static class Items {
        public static final TagKey<Item> MulchTag = tag("mulch");
        public static final TagKey<Item> PortalMulchTag = tag("portal_mulch");

            private static TagKey<Item> tag(String name) {
                return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Mulch.MOD_ID, name));
            }
    }
}
