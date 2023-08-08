import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.software.os.OperatingSystem;

public class OshiSystemInfoExample {

    public static  void main(String[] arg){
        SystemInfo systemInfo= new SystemInfo();

        OperatingSystem operatingSystem = systemInfo.getOperatingSystem();
        String osName=operatingSystem.getFamily();
        String osVersion=operatingSystem.getVersionInfo().getVersion();

        CentralProcessor processor=systemInfo.getHardware().getProcessor();
        String cpuModel=processor.getProcessorIdentifier().getName();
        int cpuCores=processor.getLogicalProcessorCount();
        long cpuFrequency=processor.getProcessorIdentifier().getVendorFreq();

        GlobalMemory memory = systemInfo.getHardware().getMemory();
        long totalMemory =memory.getTotal();
        long availableMemory=memory.getAvailable();

        // 输出系统信息
        System.out.println("操作系统: " + osName + " " + osVersion);
        System.out.println("处理器: " + cpuModel);
        System.out.println("核心数: " + cpuCores);
        System.out.println("CPU频率: " + cpuFrequency + " Hz");
        System.out.println("总内存: " + totalMemory + " bytes");
        System.out.println("可用内存: " + availableMemory + " bytes");

    }
}
