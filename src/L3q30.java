import java.util.Scanner;

public class L3q30 {
    public static void main(String[] args) {
        // Calculate Discount Of Product
        /*
Discount Formula
The formula to calculate the discount is:

Discount = List Price - Selling Price
Discount (%) = (Discount/List Price) × 100

*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list price: ");
        double listPrice = input.nextDouble();
        System.out.println("Enter Selling price: ");
        double sellingPrice = input.nextDouble();
        input.close();
        double discount = listPrice-sellingPrice;
        double DiscountPecentage = (discount/listPrice)*100;
        System.out.println("your discount is :"+DiscountPecentage);
    }
}
