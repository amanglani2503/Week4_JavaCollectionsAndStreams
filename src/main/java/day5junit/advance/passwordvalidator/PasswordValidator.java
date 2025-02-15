package day5junit.advance.passwordvalidator;

import java.util.regex.Pattern;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        String regex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";

        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(password).matches();
    }

    public static void main(String[] args) {
        String[] passwords = {"Password1", "pass", "helloWorld", "Secure123", "weakpwd", "ValidPass1"};

        for (String password : passwords) {
            System.out.println("Password: " + password + " | Valid: " + isValidPassword(password));
        }
    }
}
