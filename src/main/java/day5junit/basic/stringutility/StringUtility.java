package day5junit.basic.stringutility;

import java.util.Scanner;

public class StringUtility {

    public String reverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public boolean isPalindrome(String string) {
        String reversed = reverse(string);
        return string.equalsIgnoreCase(reversed);
    }

    public String toUpperCase(String string) {
        return string.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringUtility stringUtility = new StringUtility();

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = stringUtility.reverse(input);
        System.out.println("Reversed String : " + reversed);
        
        boolean isPalindrome = stringUtility.isPalindrome(input);
        System.out.println(input + " is Palindrome : " + isPalindrome);

        String upperCaseString = stringUtility.toUpperCase(input);
        System.out.println("Uppercase String : " + upperCaseString);

        scanner.close();
    }
}
