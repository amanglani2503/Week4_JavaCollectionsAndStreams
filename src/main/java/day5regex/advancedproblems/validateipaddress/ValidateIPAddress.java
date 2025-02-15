package day5regex.advancedproblems.validateipaddress;

import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static boolean validIP(String ip){
        String regex = "^((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.){3}((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?))";

        return Pattern.matches(regex, ip);
    }

    public static void main(String[] args) {
        String ip = "255.255.0.0";

        System.out.println(ip + " is a valid IP address : " + validIP(ip));
    }
}
