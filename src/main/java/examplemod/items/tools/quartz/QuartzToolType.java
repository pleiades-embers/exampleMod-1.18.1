package examplemod.items.tools.quartz;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum QuartzToolType {

    CERTUS;

    private final Tier toolTier;

    QuartzToolType () {
        this.toolTier =new Tier(){

            @Override
            public int getUses() {
                // TODO Auto-generated method stub
                return 0;
            }

            @Override
            public float getSpeed() {
                // TODO Auto-generated method stub
                return 0;
            }

            @Override
            public float getAttackDamageBonus() {
                // TODO Auto-generated method stub
                return 0;
            }

            @Override
            public int getLevel() {
                // TODO Auto-generated method stub
                return 0;
            }

            @Override
            public int getEnchantmentValue() {
                // TODO Auto-generated method stub
                return 0;
            }

            @Override
            public Ingredient getRepairIngredient() {
                // TODO Auto-generated method stub
                return null;
            }
            
        };
    }


    public final Tier getToolTier() {
        return toolTier;
    }

}
