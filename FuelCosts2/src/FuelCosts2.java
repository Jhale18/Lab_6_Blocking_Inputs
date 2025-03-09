import java.util.Scanner;

public class FuelCosts2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double gallons = 0;
        double milesPerGallon = 0;
        double pricePerGallon = 0;
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            gallons = input.nextDouble();
            if (gallons <= 0) {
                System.out.println("Error: Please enter a positive number.");
            }
        } while (gallons <= 0);
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            milesPerGallon = input.nextDouble();
            if (milesPerGallon <= 0) {
                System.out.println("Error: Please enter a positive number.");
            }
        } while (milesPerGallon <= 0);
        do {
            System.out.print("Enter the price of gas per gallon: ");
            pricePerGallon = input.nextDouble();
            if (pricePerGallon <= 0) {
                System.out.println("Error: Please enter a positive number.");
            }
        } while (pricePerGallon <= 0);
        double costToDrive100Miles = (100 / milesPerGallon) * pricePerGallon;
        double distanceWithFullTank = gallons * milesPerGallon;
        System.out.printf("The cost to drive 100 miles is: $%.2f\n", costToDrive100Miles);
        System.out.printf("The car can go %.2f miles with a full tank of gas.\n", distanceWithFullTank);
    }
}
