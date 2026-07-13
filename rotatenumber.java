import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int lastDigit = num % 10;      // Get last digit
        int remaining = num / 10;      // Remove last digit

        // Count the number of digits in the remaining number
        int digits = String.valueOf(remaining).length();

        // Rotate the number
        int rotated = lastDigit * (int)Math.pow(10, digits) + remaining;

        // Display the result
        System.out.println("Rotated Number: " + rotated);

        sc.close();
    }
}
