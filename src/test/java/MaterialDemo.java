import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;

public class MaterialDemo {
    public static final Material TEXTURE_SOUP = new Material(TextureAtlas.LOCATION_BLOCKS,
            new ResourceLocation("examplemod", "item/soup"));

    public static void main(String[] args) {
        System.out.println(TEXTURE_SOUP+"result");
    }
}
