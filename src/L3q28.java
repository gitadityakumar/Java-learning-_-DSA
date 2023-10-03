import java.util.Scanner;

public class L3q28 {
    public static void main(String[] args) {
        // Constants (adjust these values as needed)
        double ratePerKWh = 0.12;  // Rate per kWh in dollars
        double additionalFees = 10.0;  // Additional fees in dollars
        double taxRate = 0.05;  // Tax rate (5% in this example)

        // Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the electricity consumption (in kWh): ");
        double consumption = input.nextDouble();
        input.close();

        // Calculate the energy charge
        double energyCharge = consumption * ratePerKWh;

        // Calculate the total bill amount including additional fees and taxes
        double totalBill = energyCharge + additionalFees;
        double taxAmount = totalBill * taxRate;
        totalBill += taxAmount;

        // Display the bill
        System.out.println("Electricity Bill Statement");
        System.out.println("------------------------------");
        System.out.println("Electricity Consumption: " + consumption + " kWh");
        System.out.println("Energy Charge: $" + energyCharge);
        System.out.println("Additional Fees: $" + additionalFees);
        System.out.println("Tax (" + (taxRate * 100) + "%): $" + taxAmount);
        System.out.println("Total Bill Amount: $" + totalBill);
    }
}
