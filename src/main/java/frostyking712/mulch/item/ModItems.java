package frostyking712.mulch.item;

import frostyking712.mulch.Mulch;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Mulch.MOD_ID);

    public static final RegistryObject<Item> MULCH_PORTAL_LIGHTER = ITEMS.register("mulch_portal_lighter",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> BROWN_MULCH_FERTILISER = ITEMS.register("brown_mulch_fertiliser",
            () -> new BrownMulchFertiliser(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_MULCH_FERTILISER = ITEMS.register("yellow_mulch_fertiliser",
            () -> new YellowMulchFertiliser(new Item.Properties()));
    public static final RegistryObject<Item> AMBER_MULCH_FERTILISER = ITEMS.register("amber_mulch_fertiliser",
            () -> new AmberMulchFertiliser(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_MULCH_FERTILISER = ITEMS.register("ruby_mulch_fertiliser",
            () -> new RubyMulchFertiliser(new Item.Properties()));
    public static final RegistryObject<Item> RED_MULCH_FERTILISER = ITEMS.register("red_mulch_fertiliser",
            () -> new RedMulchFertiliser(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_MULCH_FERTILISER = ITEMS.register("black_mulch_fertiliser",
            () -> new BlackMulchFertiliser(new Item.Properties()));
    public static final RegistryObject<Item> BLUE_MULCH_FERTILISER = ITEMS.register("blue_mulch_fertiliser",
            () -> new BlueMulchFertiliser(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
