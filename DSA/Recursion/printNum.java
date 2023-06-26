//   Que  --> print number from 5 to 1 using recursion
// when a function call itself is called recursion, recursion is more like iteration 
// a very basic recursive funtion to print numbers from five to one 
public class printNum { // class defined
    public static void printnum(int n) { // recusive function declaration
        if (n == 0) { // defining base case --> means telling our function where to stop
            return;
        }
        System.out.println(n); // printing the values
        printnum(n - 1); // recursion

    }

    public static void main(String[] args) {
        int n = 5;
        printnum(5);
    }
}