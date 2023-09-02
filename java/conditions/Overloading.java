public class Overloading {
    public static void main(String[] args) {
        //two or more functions can have same name if
        //they have different types of data input
        //they have different number of arguments
        //function overloading happens at compile time
        fun(4);
        fun("Aditya");
        fun(3,37,4);
    }
    static  void fun(int a ){
        System.out.println(a);
    }
    static  void fun(String a ){
        System.out.println(a);
    }
    static  void fun(int a , int b , int c){
        System.out.println(a + " " + b +" " + c );
    }
}
// this is called function overloading