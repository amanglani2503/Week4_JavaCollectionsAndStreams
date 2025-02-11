package day2_collections.listinterface.findingfrequency;

import java.util.*;

public class Frequency {
    public static Map<String, Integer> findFrequency(List<String> list){
        Map<String, Integer> frequency = new HashMap<>();

        for(String string : list){
            frequency.put(string, frequency.getOrDefault(string, 0) + 1);
        }

        return frequency;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "apple", "cherry", "orange"));

        Map<String, Integer> frequency = findFrequency(list);

        System.out.println("Displaying fequencies :- ");
        for(Map.Entry<String, Integer> entry : frequency.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
