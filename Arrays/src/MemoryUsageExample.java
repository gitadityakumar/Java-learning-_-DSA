import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

public class MemoryUsageExample {
    public static void main(String[] args) {
        // Get MemoryMXBean instance
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();

        // Get heap memory usage
        MemoryUsage heapMemoryUsage = memoryMXBean.getHeapMemoryUsage();
        System.out.println("Heap Memory Usage:");
        printMemoryUsage(heapMemoryUsage);

        // Get non-heap memory usage
        MemoryUsage nonHeapMemoryUsage = memoryMXBean.getNonHeapMemoryUsage();
        System.out.println("\nNon-Heap Memory Usage:");
        printMemoryUsage(nonHeapMemoryUsage);
    }

    private static void printMemoryUsage(MemoryUsage memoryUsage) {
        System.out.println("  Init: " + bytesToMegabytes(memoryUsage.getInit()) + " MB");
        System.out.println("  Used: " + bytesToMegabytes(memoryUsage.getUsed()) + " MB");
        System.out.println("  Committed: " + bytesToMegabytes(memoryUsage.getCommitted()) + " MB");
        System.out.println("  Max: " + bytesToMegabytes(memoryUsage.getMax()) + " MB");
    }

    private static long bytesToMegabytes(long bytes) {
        return bytes / (1024 * 1024);
    }
}
