package day5regex.licensenumber;

import java.util.regex.Pattern;

public class ValidLicenseNumber {
    public static void validLicenseNumber(String licenseNumber){
        String regex = "[A-Z]{2}[0-9]{4}$";

        // compiling regex
        Pattern pattern = Pattern.compile(regex);

        // validating license number
        System.out.println(licenseNumber + " is valid " + pattern.matches(regex, licenseNumber));
    }

    public static void main(String[] args) {
        String licenseNumber = "AB1234";

        validLicenseNumber(licenseNumber);
    }
}
