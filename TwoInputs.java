

import java.util.Scanner; // Import the Scanner class

public class TwoInputs {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first input
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt(); // Read the first integer input

        // Prompt the user for the second input
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt(); // Read the second integer input

        int sum=num1+num2;
        // Display the entered numbers
        System.out.println(sum);

        // Close the scanner to release system resources
        scanner.close();
    }
}