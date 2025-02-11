package day2_collections.listinterface.removeduplicates;

import com.beust.ah.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static <T> List<T> removeDuplicates(List<T> inputList){
        List<T> uniqueElements = new ArrayList<>();

        for(T element : inputList){
            if(!uniqueElements.contains(element)){
                uniqueElements.add(element);
            }
        }

        return uniqueElements;
    }

    public static void main(String[] args) {
        // creating list
        List<Integer> list = new ArrayList<>(Arrays.asList(3,1,2,3,2,1,4,5,3));

        // displaying original list
        System.out.println("Original List :-");
        System.out.println(list);

        // removing duplicates
        List<Integer> uniqueElements = removeDuplicates(list);
        System.out.println("Displaying list with unique elements :-");
        System.out.println(uniqueElements);
    }
}
