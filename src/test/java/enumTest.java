
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.kinds.K1;
import examplemod.items.ItemRegistry;
import net.minecraft.SharedConstants;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistryEntry;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class enumTest{


    public static void main(String[] string) {
        Class<?> clz=QuartzToolTypeTest.class;
        QuartzToolTypeTest[] ReflectEnumTest = (QuartzToolTypeTest[]) clz.getEnumConstants();
        System.out.println(Arrays.toString(ReflectEnumTest));
        if(SharedConstants.IS_RUNNING_IN_IDE){
            String s = enumTest.class.getSimpleName();
            System.out.println(s);
        }
    }





}
enum QuartzToolTypeTest {
    CERTUS,
    AREAS
}


