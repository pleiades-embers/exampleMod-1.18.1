package examplemod.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

public class ItemRegistry extends Item{
    public ItemRegistry(Item.Properties properties){
        //物品不可修复
        super(properties.setNoRepair());
    }
    @Override
    public @NotNull String toString(){
        String regName= this.getRegistryName() != null ? this.getRegistryName().getPath() :"unregistered";
        return this.getClass().getSimpleName() + "[" + regName + "]";
    }

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "examplemod");

    public static final RegistryObject<Item> SOUP = ITEMS.register("soup", () -> new Soup(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
}
