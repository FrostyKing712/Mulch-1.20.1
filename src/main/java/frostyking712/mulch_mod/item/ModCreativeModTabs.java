package frostyking712.mulch_mod.item;

import frostyking712.mulch_mod.MulchMod;
import frostyking712.mulch_mod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MulchMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MULCH_MOD = CREATIVE_MODE_TABS.register("mulch_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BROWN_MULCH.get()))
                    .title(Component.translatable("creativetab.mulch_tab"))
                    .displayItems((pParameters, pOutput) -> {
                       pOutput.accept(ModItems.Wither_Dust.get());

                       pOutput.accept(ModBlocks.BROWN_MULCH.get());
                       pOutput.accept(ModBlocks.AMBER_MULCH.get());
                       pOutput.accept(ModBlocks.BLACK_MULCH.get());
                       pOutput.accept(ModBlocks.BLUE_MULCH.get());
                       pOutput.accept(ModBlocks.RED_MULCH.get());
                       pOutput.accept(ModBlocks.RUBY_MULCH.get());
                       pOutput.accept(ModBlocks.YELLOW_MULCH.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
