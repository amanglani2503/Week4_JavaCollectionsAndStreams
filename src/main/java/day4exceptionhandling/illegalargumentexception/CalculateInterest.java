package day4exceptionhandling.illegalargumentexception;

import day4exceptionhandling.uncheckedexception.CustomArithmeticException;

public class CalculateInterest {
    public static double calculateInterest(double principalAmount, double time, double rate) throws CustomIllegalArgumentException {
        if(principalAmount < 0 || rate < 0){
            throw new CustomIllegalArgumentException("Invalid Input : Amount and rate must be positive");
        }

        return (principalAmount * rate * time)/100;
    }

    public static void main(String[] args) {
        try{
            double amount = 10000;
            double rate = 2.5;
            double time = 2;

            double interest = calculateInterest(amount, time, rate);
            System.out.println("Calculated Interest : " + interest);
        } catch (CustomIllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
