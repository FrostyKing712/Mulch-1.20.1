package frostyking712.mulch.datagen;

import frostyking712.mulch.Mulch;
import frostyking712.mulch.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Mulch.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.MULCH_PORTAL_LIGHTER);

        simpleItem(ModItems.BROWN_MULCH_FERTILISER);
        simpleItem(ModItems.YELLOW_MULCH_FERTILISER);
        simpleItem(ModItems.AMBER_MULCH_FERTILISER);
        simpleItem(ModItems.RUBY_MULCH_FERTILISER);
        simpleItem(ModItems.RED_MULCH_FERTILISER);
        simpleItem(ModItems.BLACK_MULCH_FERTILISER);
        simpleItem(ModItems.BLUE_MULCH_FERTILISER);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(Mulch.MOD_ID,"item/" + item.getId().getPath()));
    }
}