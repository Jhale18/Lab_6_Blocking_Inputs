import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius = 0;
        while (true) {
            System.out.print("What's the temperature in Celsius? ");
            if (input.hasNextDouble()) {
                celsius = input.nextDouble();
                break;
            } else {
                System.out.println("Please enter a number.");
                input.next();
            }
        }
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("That's %.2f°F.\n", fahrenheit);
    }
}
 
