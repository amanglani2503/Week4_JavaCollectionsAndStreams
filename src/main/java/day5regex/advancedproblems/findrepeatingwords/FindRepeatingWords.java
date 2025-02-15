package day5regex.advancedproblems.findrepeatingwords;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatingWords {
    public static List<String> repeatingWords(String text){
        List<String> repeatingWords = new ArrayList<>();

        String regex = "\\b(\\w+)\\b(?:\\s+\\1\\b)";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            repeatingWords.add(matcher.group(1));
        }

        return repeatingWords;
    }

    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";

        List<String> repeatingWords = repeatingWords(text);
        for(String word : repeatingWords){
            System.out.println(word);
        }
    }
}
