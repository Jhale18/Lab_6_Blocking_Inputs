import java.util.Scanner;
import java.util.Random;

public class HighOrLow2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int randomNum = random.nextInt(10) + 1;
        int guess = 0;
        do {
            System.out.print("Guess a number 1-10 ");
            if (input.hasNextInt()) {
                guess = input.nextInt();
                if (guess < 1 || guess > 10) {
                    System.out.println("Please enter a number between 1 and 10.");
                }
            } else {
                System.out.println("error, please enter a valid number.");
                input.next();
            }
        } while (guess < 1 || guess > 10);
        System.out.println("The random number was: " + randomNum);
        if (guess < randomNum) {
            System.out.println("The guess is too low.");
        } else if (guess > randomNum) {
            System.out.println("The guess is too high.");
        } else {
            System.out.println("your guess was correct");
        }
    }
}
