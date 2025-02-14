package day5regex.validateusername;

import java.util.regex.Pattern;

public class ValidateUsername {
    public static void validateUsername(String username){
        String regex = "[a-zA-Z][a-zA-Z0-9_]{4,14}";

        // compiling regex
        Pattern pattern = Pattern.compile(regex);

        // checking username is valid or not
        System.out.println(username + " is valid " + pattern.matches(regex, username));
    }

    public static void main(String[] args) {
        String username = "amber8871_";

        validateUsername(username);
    }
}
