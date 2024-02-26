public class HeapSizeInfo {
    public static void main(String[] args) {
        // Get the runtime instance
        Runtime runtime = Runtime.getRuntime();

        // Total memory allocated to JVM
        long totalMemory = runtime.totalMemory();

        // Free memory in JVM
        long freeMemory = runtime.freeMemory();

        // Maximum memory that JVM can use
        long maxMemory = runtime.maxMemory();

        // Convert bytes to megabytes for better readability
        long totalMemoryMB = totalMemory / (1024 * 1024);
        long freeMemoryMB = freeMemory / (1024 * 1024);
        long maxMemoryMB = maxMemory / (1024 * 1024);

        // Print heap size information
        System.out.println("Total Memory (Heap): " + totalMemoryMB + " MB");
        System.out.println("Free Memory (Heap): " + freeMemoryMB + " MB");
        System.out.println("Max Memory (Heap): " + maxMemoryMB + " MB");
    }
}
