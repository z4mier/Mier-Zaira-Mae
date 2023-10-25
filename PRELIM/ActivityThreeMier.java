import java.util.Scanner;

public class ActivityThreeMier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] prices = {100.00, 150.00, 300.00, 35.00, 50.00};
        double phpToDollarExchangeRate = 56.00;

        System.out.println("Menu:");
        System.out.println("1. C1 - PHP 100.00");
        System.out.println("2. C2 - PHP 150.00");
        System.out.println("3. C3 - PHP 300.00");
        System.out.println("Add-ons:");
        System.out.println("4. R1 - PHP 35.00");
        System.out.println("5. R2 - PHP 50.00");
        System.out.println("0. Checkout");

        double totalAmount = 0.0;
        int totalQuantity = 0;

        while (true) {
            System.out.print("\nEnter your order (1-5) or (0) to check out: ");
            int order = scanner.nextInt();

            if (order == 0) {
                break;
            }

            if (order >= 1 && order <= 5) {
                System.out.print("Enter the quantity: ");
                int quantity = scanner.nextInt();

                double priceInPHP = prices[order - 1];
                totalQuantity += quantity;
                totalAmount += priceInPHP * quantity;

                // ORDER CODE
                String orderItem = (order <= 3) ? "C" + order : "R" + (order - 3);
                System.out.println("Order Code: " + orderItem);
            } else {
                System.out.println("Invalid order.");
            }
        }
         
        System.out.println("Total Quantity: " + totalQuantity);
        System.out.println("Total Price in PHP: PHP " + totalAmount);
        
        double totalPriceInDollars = totalAmount / phpToDollarExchangeRate;
        System.out.println("Total Price in Dollars: $" + totalPriceInDollars);
        
        scanner.close();
    }
}
