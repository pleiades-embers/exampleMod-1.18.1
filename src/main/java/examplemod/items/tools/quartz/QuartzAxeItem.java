package examplemod.items.tools.quartz;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;

public class QuartzAxeItem extends AxeItem {

    public QuartzAxeItem(Item.Properties props, QuartzToolType type) {
        super(type.getToolTier(), 8.0F, -3.0F, props);
    }

}
