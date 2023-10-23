import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define exchange rates (fixed for this example)
        double usdToEur = 0.85;  // 1 USD to EUR
        double usdToGbp = 0.75;  // 1 USD to GBP

        System.out.println("Currency Converter");
        System.out.println("1. USD to EUR");
        System.out.println("2. USD to GBP");
        System.out.print("Select an option (1/2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the amount in USD: ");
                double usdAmount = scanner.nextDouble();
                double eurAmount = usdAmount * usdToEur;
                System.out.println("Equivalent amount in EUR: " + eurAmount);
                break;
            case 2:
                System.out.print("Enter the amount in USD: ");
                double usdAmount2 = scanner.nextDouble();
                double gbpAmount = usdAmount2 * usdToGbp;
                System.out.println("Equivalent amount in GBP: " + gbpAmount);
                break;
            default:
                System.out.println("Invalid option. Please select 1 or 2.");
        }

        scanner.close();
    }
}
