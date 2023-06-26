public class sl {
    public static void main(String[] args) {
        String TXT = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("the lengh of the txt is :" + TXT.length()); // using length() method to determine the length
                                                                        // of a txt
        System.out.println(TXT.toUpperCase()); // toUppercase method to print in uppercase
        System.out.println(TXT.toLowerCase()); // toLowercase methid to print in lowercase
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7
    }
}
