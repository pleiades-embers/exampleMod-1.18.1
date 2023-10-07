package examplemod.datagen.providers.recipes;
import java.util.function.Consumer;
import examplemod.datagen.providers.IDataProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import java.nio.file.Path;


public abstract class RecipeProvider extends net.minecraft.data.recipes.RecipeProvider implements IDataProvider {
    private final Path outputFolder;

    public RecipeProvider(DataGenerator generator){
        super(generator);
        this.outputFolder=generator.getOutputFolder();
    }
    //抽象类合成表
    protected abstract void buildCraftingRecipes(Consumer<FinishedRecipe> consumer);
}
