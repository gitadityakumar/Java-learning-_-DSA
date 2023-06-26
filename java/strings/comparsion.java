public class comparsion {
    public static void main(String[] args) {
        String name1 = "Tony";
        String name2 = "Tony";
        if (name1.compareTo(name2) == 0) { // not correct method in java here we are treating string like primitve data
                                           // types
            System.out.println("equal");

        } else {
            System.out.println("not equal");
        }
        // this block of code is coreect and it will pass all test cases
        // here strng are object and non primitive type of data types and have different
        // method
        // to store in memory
        if (new String("Tony") == new String("Tony")) {
            System.out.println("equal");

        } else {
            System.out.println("not equal");
        }
    }
}
