package day4exceptionhandling.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide {
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

        } catch (CustomInputMismatchException e){
            System.out.println("Input Mismatch Exception : " + e.getMessage());
        } catch (CustomArithmeticException e){
            System.out.println("Arithmetic Exception : " + e.getMessage());
        }
    }
}
