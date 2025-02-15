package day5regex.advancedproblems.extractcurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrency {
    public static List<String> extractCurrency(String text){
        List<String> currencyValues = new ArrayList<>();

        String regex = "\\d+\\.\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            currencyValues.add(matcher.group());
        }

        return currencyValues;
    }

    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";

        List<String> currencyValues = extractCurrency(text);

        for (String values : currencyValues){
            System.out.println(values);
        }
    }
}
