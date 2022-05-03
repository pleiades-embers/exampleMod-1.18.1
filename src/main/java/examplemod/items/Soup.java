package examplemod.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class Soup extends Item{
    
    public Soup(Item.Properties properties){
         super(properties.tab(CreativeModeTab.TAB_MATERIALS));
    }
}