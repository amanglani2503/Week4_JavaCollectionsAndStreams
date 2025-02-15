package day5regex.advancedproblems.validatessn;

import java.util.regex.Pattern;

public class ValidateSSN {
    public static boolean isValid(String ssnNumber){
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";

        return Pattern.matches(regex, ssnNumber);
    }

    public static void main(String[] args) {
        String ssnNumber = "123-45-6789";

        System.out.println(ssnNumber + " is valid : " + isValid(ssnNumber));
    }
}
