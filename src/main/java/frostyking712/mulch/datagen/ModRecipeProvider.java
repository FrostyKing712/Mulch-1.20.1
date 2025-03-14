package frostyking712.mulch.datagen;

import frostyking712.mulch.block.ModBlocks;
import frostyking712.mulch.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

import static frostyking712.mulch.util.ModTags.Items.MulchTag;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BROWN_MULCH.get(), 8)
                .pattern("DDD")
                .pattern("DYD")
                .pattern("DDD")
                .define('D', Items.DIRT)
                .define('Y', Items.BROWN_DYE)
                .unlockedBy(getHasName(Items.DIRT), has(Items.DIRT))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.YELLOW_MULCH.get(), 8)
                .pattern("DDD")
                .pattern("DYD")
                .pattern("DDD")
                .define('D', Items.DIRT)
                .define('Y', Items.YELLOW_DYE)
                .unlockedBy(getHasName(Items.DIRT), has(Items.DIRT))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AMBER_MULCH.get(), 8)
                .pattern("DDD")
                .pattern("DYD")
                .pattern("DDD")
                .define('D', Items.DIRT)
                .define('Y', Items.ORANGE_DYE)
                .unlockedBy(getHasName(Items.DIRT), has(Items.DIRT))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUBY_MULCH.get(), 8)
                .pattern("DDD")
                .pattern("DYD")
                .pattern("DDD")
                .define('D', Items.DIRT)
                .define('Y', Items.PINK_DYE)
                .unlockedBy(getHasName(Items.DIRT), has(Items.DIRT))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_MULCH.get(), 8)
                .pattern("DDD")
                .pattern("DYD")
                .pattern("DDD")
                .define('D', Items.DIRT)
                .define('Y', Items.RED_DYE)
                .unlockedBy(getHasName(Items.DIRT), has(Items.DIRT))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_MULCH.get(), 8)
                .pattern("DDD")
                .pattern("DYD")
                .pattern("DDD")
                .define('D', Items.DIRT)
                .define('Y', Items.BLACK_DYE)
                .unlockedBy(getHasName(Items.DIRT), has(Items.DIRT))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_MULCH.get(), 8)
                .pattern("DDD")
                .pattern("DYD")
                .pattern("DDD")
                .define('D', Items.DIRT)
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
    }
}
