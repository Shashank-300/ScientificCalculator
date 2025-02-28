package org.example;

import java.util.Scanner;

public class ScientificCalculator {

    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    public static long factorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public static double naturalLog(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Natural logarithm is defined for positive numbers only.");
        }
        return Math.log(x);
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nScientific Calculator Menu");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power Function (x^b)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            String choice = scanner.nextLine();

            try {
                switch (choice) {
                    case "1":
                        System.out.print("Enter number: ");
                        double num = Double.parseDouble(scanner.nextLine());
                        System.out.println("Square root of " + num + " is " + squareRoot(num));
                        break;
                    case "2":
                        System.out.print("Enter an integer: ");
                        int n = Integer.parseInt(scanner.nextLine());
                        System.out.println("Factorial of " + n + " is " + factorial(n));
                        break;
                    case "3":
                        System.out.print("Enter number: ");
                        double num2 = Double.parseDouble(scanner.nextLine());
                        System.out.println("Natural logarithm of " + num2 + " is " + naturalLog(num2));
                        break;
                    case "4":
                        System.out.print("Enter base: ");
                        double base = Double.parseDouble(scanner.nextLine());
                        System.out.print("Enter exponent: ");
                        double exp = Double.parseDouble(scanner.nextLine());
                        System.out.println(base + " raised to the power " + exp + " is " + power(base, exp));
                        break;
                    case "5":
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please select between 1 and 5.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
