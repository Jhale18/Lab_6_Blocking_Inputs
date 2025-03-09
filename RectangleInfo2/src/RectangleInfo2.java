import java.util.Scanner;

public class RectangleInfo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = 0;
        double height = 0;
        do {
            System.out.print("Enter the width of the rectangle: ");
            width = scanner.nextDouble();
            if (width <= 0) {
                System.out.println("Error, please enter a positive number.");
            }
        } while (width <= 0);
        do {
            System.out.print("Enter the height of the rectangle: ");
            height = scanner.nextDouble();
            if (height <= 0) {
                System.out.println("Error, please enter a positive number.");
            }
        } while (height <= 0);
        double area = width * height;
        double perimeter = 2 * (width * height);
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        System.out.printf("The area of the rectangle is: %.2f\n", area);
        System.out.printf("The perimeter of the rectangle is: %.2f\n", perimeter);
        System.out.printf("The length of the diagonal is: %.2f\n", diagonal);

    }
}
