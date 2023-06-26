import javax.sound.sampled.SourceDataLine;

public class intro {
    public static void main(String[] args) {
        // strings array
        String cars[] = { "vlovo", "BMW", "Ford", "Mazda" };

        // acessing the element of an array
        System.out.println(cars[1]);

        // changing an array element
        cars[0] = "Maruti";
        System.out.println(cars[0]);

        // finding the array length
        System.out.println(cars.length);

        // printing every element of an array using for loop
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        // using for-each loop to print the elements fo an array
        // this can be read like this: for each String element (called i - as in index)
        // in cars, print out the value of i.
        for (String i : cars) {
            System.out.println(i);
        }

    }

}
