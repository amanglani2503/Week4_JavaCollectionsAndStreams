package day5regex.extractionproblems.captitalizedwords;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalizedWords {
    public static List<String> extractCapitalizedWords(String text){
        List<String> captializedWords = new ArrayList<>();

        String regex = "\\b[A-Z][a-zA-Z]+\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            captializedWords.add(matcher.group());
        }

        return captializedWords;
    }

    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        List<String> captializedWords = extractCapitalizedWords(text);

        for(String word : captializedWords){
            System.out.println(word);
        }
    }
}
