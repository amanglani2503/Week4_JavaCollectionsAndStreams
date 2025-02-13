package day4exceptionhandling.finallyblock;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
    public static int divide(int a, int b) throws CustomArithmeticException{
        if(b == 0){
            throw new CustomArithmeticException("Division by zero !!");
        }

        return a/b;
    }

    public static void main(String[] args) throws CustomArithmeticException {
        try{
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter value of a : ");
            if (!sc.hasNextInt()) {
                throw new InputMismatchException("Input mismatch! Please enter an integer.");
            }
            int a = sc.nextInt();

            System.out.print("Enter value of b : ");
            if (!sc.hasNextInt()) {
                throw new InputMismatchException("Input mismatch! Please enter an integer.");
            }
            int b = sc.nextInt();

            System.out.println("Result : " + divide(a, b));

        } catch (CustomArithmeticException e){
            System.out.println("Arithmetic Exception : " + e.getMessage());
        } finally {
            System.out.println("Operation completed !!");
        }
    }
}
