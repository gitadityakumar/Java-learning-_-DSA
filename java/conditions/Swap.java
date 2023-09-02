public class Swap {
    public static void main(String[] args) {
//        String name = "Aditya Kuamr";
//        greeting(name);
        int a = 10 ;
        int b = 39 ;
        swap(a,b);

    }
    //see in java there is pass by value not pass by reference
    // what does mean ?
    //
//    static void greeting(String naam){
//        System.out.println(naam);
//    }
    static void swap(int a , int b ){
        int temp =a;
        a = b ;
        b = temp ;
        System.out.println( a+" "+b);
    }
}


