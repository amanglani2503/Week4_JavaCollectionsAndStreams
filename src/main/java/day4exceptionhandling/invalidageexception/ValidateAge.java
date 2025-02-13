package day4exceptionhandling.invalidageexception;

import java.util.Scanner;

public class ValidateAge {
    public static void validateAge(int age) throws InvalidAgeException{
        if(age >= 18){
            System.out.println("Access Granted");
            return;
        }

        // throws exceptio if age is smaller than 18
        throw new InvalidAgeException("Age must be 18 or above");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age : ");
        int age = sc.nextInt();

        try{
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception occured : " + e.getMessage());
        }
    }
}
