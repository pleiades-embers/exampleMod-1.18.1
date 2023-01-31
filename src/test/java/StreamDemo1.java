import examplemod.ExampleMod;
import net.minecraft.DetectedVersion;
import net.minecraft.WorldVersion;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;


public class StreamDemo1 {

    private  static final Logger LOGGER= LogManager.getLogger();
    public static final WorldVersion BUILT_IN =DetectedVersion.getClass();

    public static void main(String[] args) {
        try {
            InputStream inputStream= DetectedVersion.class.getResourceAsStream("./version.json");
            WorldVersion wroldversion = null;
            try {
                if(inputStream==null){
                    LOGGER.warn("Missing version information!");
                    wroldversion = BUILT_IN;
                }
            }catch (Throwable trowable3){
                  throw trowable3;
            }
            return wroldversion;
        } catch (IOException ioexception){
            System.out.println(ioexception);
            throw new IllegalStateException("Game version information is corrupt", ioexception);
        }



    }
}
