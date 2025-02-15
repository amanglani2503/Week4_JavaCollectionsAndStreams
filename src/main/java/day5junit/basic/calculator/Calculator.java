package day5junit.basic.calculator;

import java.util.Scanner;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Calculator Operations: \n1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        System.out.print("Enter operation (1-4): ");
        int choice = scanner.nextInt();

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        try {
            int result = switch (choice) {
                case 1 -> calculator.add(num1, num2);
                case 2 -> calculator.subtract(num1, num2);
                case 3 -> calculator.multiply(num1, num2);
                case 4 -> calculator.divide(num1, num2);
                default -> throw new IllegalArgumentException("Invalid operation choice!");
            };

            System.out.println("Result: " + result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
