package frostyking712.mulch.worldgen.portal;

import frostyking712.mulch.Mulch;
import frostyking712.mulch.block.ModBlocks;
import frostyking712.mulch.item.ModItems;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.resources.ResourceLocation;

public class ModPortal {
    public static void registerPortals() {
        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.PORTAL_CORE_MULCH.get())
                .lightWithItem(ModItems.MULCH_PORTAL_LIGHTER.get())
                .destDimID(ResourceLocation.fromNamespaceAndPath(Mulch.MOD_ID, "mulchdim"))
                .tintColor(255, 0, 255)
                .registerPortal();
    }
}