package examplemod.datagen;


import examplemod.datagen.providers.recipes.CraftingRecipes;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = "examplemod",bus=Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public  static void onGatherData(GatherDataEvent dataEvent) {
        onGatherData(dataEvent.getGenerator(), dataEvent.getExistingFileHelper());
    }

    public static void onGatherData(DataGenerator generator, ExistingFileHelper existingFileHelper) {

        //Recipes
        generator.addProvider(new CraftingRecipes(generator));
    }



}
