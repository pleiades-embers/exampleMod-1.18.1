import com.google.gson.JsonParseException;  //解析JSon的
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader; // stream输入流

public class VersionDetector {

    // 假设你已经有了这两个类和方法
    // 请根据实际情况替换为你自己的实现
    static class WorldVersion {}
    static class DetectedVersion extends WorldVersion {
        DetectedVersion(Object parsedJson) {}
    }
    static class GsonHelper {
        static Object parse(InputStreamReader reader) { return new Object(); }
    }

    private static final WorldVersion BUILT_IN = new WorldVersion();

    public static WorldVersion tryDetectVersion() {
        try {
            InputStream inputstream = VersionDetector.class.getResourceAsStream("/version.json");

            WorldVersion worldversion;
            label63: {
                DetectedVersion detectedversion;
                try {
                    if (inputstream == null) {
                        System.out.println("Missing version information!");
                        worldversion = BUILT_IN;
                        break label63;
                    }

                    InputStreamReader inputstreamreader = new InputStreamReader(inputstream);

                    try {
                        detectedversion = new DetectedVersion(GsonHelper.parse(inputstreamreader));
                    } catch (Throwable throwable2) {
                        try {
                            inputstreamreader.close();
                        } catch (Throwable throwable1) {
                            throwable2.addSuppressed(throwable1);
                        }

                        throw throwable2;
                    }

                    inputstreamreader.close();
                } catch (Throwable throwable3) {
                    if (inputstream != null) {
                        try {
                            inputstream.close();
                        } catch (Throwable throwable) {
                            throwable3.addSuppressed(throwable);
                        }
                    }

                    throw throwable3;
                }

                if (inputstream != null) {
                    inputstream.close();
                }

                return detectedversion;
            }

            if (inputstream != null) {
                inputstream.close();
            }

            return worldversion;
        } catch (JsonParseException | IOException ioexception) {
            throw new IllegalStateException("Game version information is corrupt", ioexception);
        }
    }

    public static void main(String[] args) {
        WorldVersion version = tryDetectVersion();
        System.out.println("Detected version11111: " + version);
    }
}