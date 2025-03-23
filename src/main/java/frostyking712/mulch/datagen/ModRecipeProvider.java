package frostyking712.mulch.datagen;

import frostyking712.mulch.Mulch;
import frostyking712.mulch.block.ModBlocks;
import frostyking712.mulch.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

import static frostyking712.mulch.util.ModTags.Items.MulchTag;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    private ResourceLocation makeID(String name) {
        return ResourceLocation.fromNamespaceAndPath(Mulch.MOD_ID, name);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BROWN_MULCH.get(), 4)
                .pattern(" D ")
                .pattern("DYD")
                .pattern(" D ")
                .define('D', Items.DIRT)
                .define('Y', Items.BROWN_DYE)
                .unlockedBy(getHasName(Items.DIRT), has(Items.DIRT))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.YELLOW_MULCH.get(), 4)
                .pattern(" M ")
                .pattern("MYM")
                .pattern(" M ")
                .define('M', ModBlocks.BROWN_MULCH.get())
                .define('Y', Items.YELLOW_DYE)
                .unlockedBy(getHasName(Items.DIRT), has(Items.DIRT))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AMBER_MULCH.get(), 4)
                .pattern(" M ")
                .pattern("MYM")
                .pattern(" M ")
                .define('M', ModBlocks.YELLOW_MULCH.get())
                .define('Y', Items.ORANGE_DYE)
                .unlockedBy(getHasName(Items.DIRT), has(Items.DIRT))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUBY_MULCH.get(), 4)
                .pattern(" M ")
                .pattern("MYM")
                .pattern(" M ")
                .define('M', ModBlocks.AMBER_MULCH.get())
                .define('Y', Items.PINK_DYE)
                .unlockedBy(getHasName(Items.DIRT), has(Items.DIRT))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_MULCH.get(), 4)
                .pattern(" M ")
                .pattern("MYM")
                .pattern(" M ")
                .define('M', ModBlocks.RUBY_MULCH.get())
                .define('Y', Items.RED_DYE)
                .unlockedBy(getHasName(Items.DIRT), has(Items.DIRT))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_MULCH.get(), 4)
                .pattern(" M ")
                .pattern("MYM")
                .pattern(" M ")
                .define('M', ModBlocks.RED_MULCH.get())
                .define('Y', Items.BLACK_DYE)
                .unlockedBy(getHasName(Items.DIRT), has(Items.DIRT))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_MULCH.get(), 4)
                .pattern(" M ")
                .pattern("MYM")
                .pattern(" M ")
                .define('M', ModBlocks.BLACK_MULCH.get())
                .define('Y', Items.BLUE_DYE)
                .unlockedBy(getHasName(Items.DIRT), has(Items.DIRT))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PORTAL_CORE_MULCH.get(), 8)
                .pattern("MMM")
                .pattern("MEM")
                .pattern("MMM")
                .define('M', MulchTag )
                .define('E', Items.ENDER_PEARL)
                .unlockedBy(getHasName(Items.DIRT), has(Items.DIRT))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MULCH_PORTAL_LIGHTER.get())
                .pattern("MFM")
                .pattern("MEM")
                .pattern("MMM")
                .define('M', MulchTag )
                .define('E', Items.ENDER_PEARL)
                .define('F', Items.FLINT_AND_STEEL)
                .unlockedBy(getHasName(Items.DIRT), has(Items.DIRT))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BROWN_MULCH.get())
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.BROWN_MULCH_FERTILISER.get())
                .unlockedBy(getHasName(ModItems.BROWN_MULCH_FERTILISER.get()), has(ModItems.BROWN_MULCH_FERTILISER.get()))
                .save(pWriter, (makeID("brown_mulch_from_brown_mulch_fertiliser")));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.YELLOW_MULCH.get())
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.YELLOW_MULCH_FERTILISER.get())
                .unlockedBy(getHasName(ModItems.YELLOW_MULCH_FERTILISER.get()), has(ModItems.YELLOW_MULCH_FERTILISER.get()))
                .save(pWriter, (makeID("yellow_mulch_from_yellow_mulch_fertiliser")));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AMBER_MULCH.get())
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.AMBER_MULCH_FERTILISER.get())
                .unlockedBy(getHasName(ModItems.AMBER_MULCH_FERTILISER.get()), has(ModItems.AMBER_MULCH_FERTILISER.get()))
                .save(pWriter, (makeID("amber_mulch_from_amber_mulch_fertiliser")));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUBY_MULCH.get())
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.RUBY_MULCH_FERTILISER.get())
                .unlockedBy(getHasName(ModItems.RUBY_MULCH_FERTILISER.get()), has(ModItems.RUBY_MULCH_FERTILISER.get()))
                .save(pWriter, (makeID("ruby_mulch_from_ruby_mulch_fertiliser")));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_MULCH.get())
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.RED_MULCH_FERTILISER.get())
                .unlockedBy(getHasName(ModItems.RED_MULCH_FERTILISER.get()), has(ModItems.RED_MULCH_FERTILISER.get()))
                .save(pWriter, (makeID("red_mulch_from_red_mulch_fertiliser")));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_MULCH.get())
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.BLACK_MULCH_FERTILISER.get())
                .unlockedBy(getHasName(ModItems.BLACK_MULCH_FERTILISER.get()), has(ModItems.BLACK_MULCH_FERTILISER.get()))
                .save(pWriter, (makeID("black_mulch_from_black_mulch_fertiliser")));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_MULCH.get())
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.BLUE_MULCH_FERTILISER.get())
                .unlockedBy(getHasName(ModItems.BLUE_MULCH_FERTILISER.get()), has(ModItems.BLUE_MULCH_FERTILISER.get()))
                .save(pWriter, (makeID("blue_mulch_from_blue_mulch_fertiliser")));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BROWN_MULCH_FERTILISER.get(), 4)
                .requires(ModBlocks.BROWN_MULCH.get())
                .unlockedBy(getHasName(ModBlocks.BROWN_MULCH.get()), has(ModBlocks.BROWN_MULCH.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.YELLOW_MULCH_FERTILISER.get(), 4)
                .requires(ModBlocks.YELLOW_MULCH.get())
                .unlockedBy(getHasName(ModBlocks.YELLOW_MULCH.get()), has(ModBlocks.YELLOW_MULCH.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AMBER_MULCH_FERTILISER.get(), 4)
                .requires(ModBlocks.AMBER_MULCH.get())
                .unlockedBy(getHasName(ModBlocks.AMBER_MULCH.get()), has(ModBlocks.AMBER_MULCH.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUBY_MULCH_FERTILISER.get(), 4)
                .requires(ModBlocks.RUBY_MULCH.get())
                .unlockedBy(getHasName(ModBlocks.RUBY_MULCH.get()), has(ModBlocks.RUBY_MULCH.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RED_MULCH_FERTILISER.get(), 4)
                .requires(ModBlocks.RED_MULCH.get())
                .unlockedBy(getHasName(ModBlocks.RED_MULCH.get()), has(ModBlocks.RED_MULCH.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BLACK_MULCH_FERTILISER.get(), 4)
                .requires(ModBlocks.BLACK_MULCH.get())
                .unlockedBy(getHasName(ModBlocks.BLACK_MULCH.get()), has(ModBlocks.BLACK_MULCH.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BLUE_MULCH_FERTILISER.get(), 4)
                .requires(ModBlocks.BLUE_MULCH.get())
                .unlockedBy(getHasName(ModBlocks.BLUE_MULCH.get()), has(ModBlocks.BLUE_MULCH.get()))
                .save(pWriter);
    }
}
