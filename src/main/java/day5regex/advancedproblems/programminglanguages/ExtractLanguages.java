package day5regex.advancedproblems.programminglanguages;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLanguages {
    public static List<String> extractProgrammingLanguages(String text, String[] languages){
        List<String> programmingLanguages = new ArrayList<>();

        for (String language : languages){
            String regex = "\\b" + language + "\\b";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            if(matcher.find()){
                programmingLanguages.add(language);
            }
        }
        return programmingLanguages;
    }

    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        String[] languages = {"Java", "Go", "Python", "JavaScript", "Swift", "C", "C++"};

        List<String> programmingLanguages = extractProgrammingLanguages(text, languages);

        for(String language : programmingLanguages){
            System.out.println(language);
        }
    }
}
