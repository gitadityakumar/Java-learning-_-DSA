import java.util.Scanner;

public class L3q14 {
    public static void main(String[] args) {
        //Volume Of Cone Java Program
        //volume of cone= pie x r2 x h/3
        Scanner input = new Scanner(System.in);
        float r = input.nextFloat();
        float h = input.nextFloat();
        float volume = (float) (Math.PI*(r/2)*(h/3));
        System.out.println(volume);
        input.close();
    }
}
