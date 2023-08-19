public class Typeconversion_casting {
    public static void main(String[] args) {
        byte b = 44;
        char c = 'a';
        short s = 1024;
        int i = 3443;
        float f = 34.34f;
        double d = 324.342323d;
        double D =  (f * b) + (i/c) - (d*s);
        System.out.println((f * b) + " "+ (i/c ) + " " + (d*s));
        System.out.println(D);
    }
}
