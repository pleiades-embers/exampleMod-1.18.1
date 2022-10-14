package examplemod.datagen.providers.recipes;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class CraftingRecipes extends RecipeProvider{
    public CraftingRecipes(DataGenerator generator){
        super(generator);
    }
    public static Tag.Named<Item> STONE = Tags.Items.STONE;
    public static Tag.Named<Item> COBBLESTONE = Tags.Items.COBBLESTONE;
    public static Tag.Named<Item> GLASS = Tags.Items.GLASS;

    public static final String MOD_ID = "examplemod";

    static ResourceLocation makeId(String id) {
        return new ResourceLocation(MOD_ID, id);
    }
    @Override
    protected void  buildCraftingRecipes(Consumer<FinishedRecipe> consumer){

        // ===================================================
//        ShapedRecipeBuilder.shaped(Items.QUARTZ, 2)
//                .pattern("a")
//                .pattern("a")
//                .pattern("a")
//                .define('a', STONE)
//                .save(consumer, makeId("materials/"));
    }
}
