package examplemod.core.definitions;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.world.item.CreativeModeTab;

public final class Items {

    private static final List<ItemDefinition<?>> ITEMS = new ArrayList<>();

    public static final ItemDefinition CERTUS_QUARTZ_AXE = item("Certus Quartz Axe", CreativeModeTab.TAB_TOOLS);

    static ItemDefinition item(String string, CreativeModeTab group) {
        return null;
    }

}