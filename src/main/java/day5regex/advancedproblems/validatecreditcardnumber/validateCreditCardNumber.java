package day5regex.advancedproblems.validatecreditcardnumber;

import java.util.regex.Pattern;

public class validateCreditCardNumber {
    public static boolean isValid(String creditCardNumber){
        String regex = "^[4-5]\\d{15}";
        return Pattern.matches(regex, creditCardNumber);
    }

    public static void main(String[] args) {
        String creditCardNumber = "5392315642897683";
        System.out.println(creditCardNumber + " is valid : " + isValid(creditCardNumber));
    }
}
