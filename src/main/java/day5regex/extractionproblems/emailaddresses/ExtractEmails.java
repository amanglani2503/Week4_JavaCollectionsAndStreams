package day5regex.extractionproblems.emailaddresses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void extractEmail(String text){

        String regex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z]{2,})+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }

    public static void main(String[] args) {
        String text = "Reach me at first.last@email.co.in, user123@sub.example.net, and test_email@gmail.com!";

        extractEmail(text);
    }
}
