package day5regex.hexcolorcode;

import java.util.regex.Pattern;

public class HexColorCode {
    public static void validColorCode(String code){
        String regex = "#[a-fA-F0-9]{6}";

        Pattern pattern = Pattern.compile(regex);

        System.out.println(code + " is valid " + pattern.matches(regex, code));
    }

    public static void main(String[] args) {
        String code = "#FFA500";

        validColorCode(code);
    }
}
