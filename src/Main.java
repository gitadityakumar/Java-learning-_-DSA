public class Main {

    public static void main(String[] args) {
        int value1 = 5;
        int value2 = 10;

        System.out.println("Before swapping: value1 = " + value1 + ", value2 = " + value2);

        // Calling the swapValues method to swap the values
        swapValues(value1, value2);

        System.out.println("After swapping: value1 = " + value1 + ", value2 = " + value2);
    }

    // Method to swap two integer values
    public static void swapValues(int a, int b) {
        System.out.println("Swapping values...");

        // Using a temporary variable to perform the swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Inside swapValues method: a = " + a + ", b = " + b);
    }
}
