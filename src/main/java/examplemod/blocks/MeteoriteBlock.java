package examplemod.blocks;

import net.minecraft.core.Registry;
import net.minecraft.world.level.block.AirBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class MeteoriteBlock extends Block {
    public MeteoriteBlock(Properties properties) {
        super(properties);
    }

    public static final Block MeteoriteBlock=register("meteorite_block",new AirBlock(BlockBehaviour.Properties.of(Material.AIR).noCollission().noDrops().air()));
    private static Block register(String str, Block p_50797_) {
        return Registry.register(Registry.BLOCK, str, p_50797_);
    }
}
