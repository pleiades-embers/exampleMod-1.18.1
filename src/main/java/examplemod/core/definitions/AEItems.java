package examplemod.core.definitions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import com.mojang.datafixers.types.Func;

import examplemod.items.tools.quartz.QuartzAxeItem;
import examplemod.items.tools.quartz.QuartzToolType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public final class AEItems {

    private static final List<ItemDefinition<?>> ITEMS = new ArrayList<>();
    public static final ResourceLocation CENTUS_QUARTZ_AXE= id("centus_quartz_axe");
    private static ResourceLocation id(String id) {
        return new ResourceLocation("ae2", id);
    }
    public static final ItemDefinition<QuartzAxeItem> CERTUS_QUARTZ_AXE = item("Certus Quartz Axe"
            ,CENTUS_QUARTZ_AXE, p -> new QuartzAxeItem(p, QuartzToolType.CERTUS),CreativeModeTab.TAB_TOOLS);



    public static <T extends Item> ItemDefinition<T> item(String name, ResourceLocation id,
            Function<Item.Properties, T> factory, CreativeModeTab group) {
        
        Item.Properties p =new Item.Properties().tab(group);
        T item = factory.apply(p);
        
        item.setRegistryName(id);

        ItemDefinition<T> definition = new ItemDefinition<>();
                
        return definition;
    }

    public static List<ItemDefinition<?>> getItems() {
        return Collections.unmodifiableList(ITEMS);
    }
}