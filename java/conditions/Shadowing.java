public class Shadowing {
    static int a = 100; //this will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(a);
        int a;
       // System.out.println(a);//scope will begin when value is initialized
        a = 40 ;
        System.out.println(a);
        fun();

    }
    static  void fun() {
        System.out.println(a);
    }
}
