
public class stb {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        // charAt 0 index
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'R');
        System.out.println(sb);

        // inset a char
        sb.insert(0, 's');
        System.out.println(sb);

        // delete the char
        sb.delete(0, 1);
        System.out.println(sb);
    }
}
