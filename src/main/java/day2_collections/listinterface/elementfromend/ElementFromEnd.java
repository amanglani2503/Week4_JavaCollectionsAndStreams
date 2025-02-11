package day2_collections.listinterface.elementfromend;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.util.Collections.swap;

public class ElementFromEnd {
    public static <T> T elementFromEnd(List<T> inputList, int n){
        if(inputList.isEmpty() || n > inputList.size()){
            throw new IllegalArgumentException("Provide proper arguments");
        }

        // reversing the list
        int i = 0, j = inputList.size()-1;
        while(i < j){
            swap(inputList, i, j);
            i++;
            j--;
        }

        // returning Nth element from last
        return inputList.get(n - 1);
    }

    public static void main(String[] args) {
        // creating a list
        List<Character> list = new LinkedList<>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        List<Integer> list2 = new LinkedList<>(Arrays.asList(1,2,3,4,5,6));

        System.out.println("List : " + list);
        System.out.println("Nth element from list : " + elementFromEnd(list, 2));
    }
}