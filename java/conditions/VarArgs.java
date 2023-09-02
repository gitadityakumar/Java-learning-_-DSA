import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //when you do not know how many args you are going to give
        //then we use variable length arguments
        fun(1,33,5,6,6,7,78,7,38);
        multiple(1,4,"this","skdjfaljsfl;jas");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    //always put variable args at the end of all variable
    static void multiple(int a , int b , String ...variable){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(variable));
    }
}
