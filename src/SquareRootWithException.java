import java.util.Scanner;

public class SquareRootWithException {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();

            if (number < 0) {
                throw new IllegalArgumentException("The number must be non-negative.");
            }

            double squareRoot = Math.sqrt(number);
            System.out.println("The square root of " + number + " is " + squareRoot);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: invalid input.");
        }
    }
}
