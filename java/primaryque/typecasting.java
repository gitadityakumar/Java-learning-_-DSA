public class typecasting { // Type casting is when you assign a value of one primitive data type to another
                           // type
    public static void main(String[] args) {
        int myint = 9;
        double mydouble = myint; // automatic widening casting int to double
        System.out.println(myint);
        System.out.println(mydouble);

        double MyDouble = 9.87d; // Narrowing casting must be done manually by placing the type in parentheses in
                                 // front of the value
        int Myint = (int) MyDouble;
        System.out.println(MyDouble);
        System.out.println(Myint);
    }
}
