package day2_collections.listinterface.reverselist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.util.Collections.swap;

public class ReverseList {
    public static <T> void reverseList(List<T> list){
        int i = 0, j = list.size() - 1;

        // swapping elements from first and second halfs
        while(i < j){
            swap(list, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(1,2,3,4,5));


        System.out.println("Displaying original ArrayList :-");
        System.out.println(arrayList);

        // reversing ArrayList
        reverseList(arrayList);
        System.out.println("Displaying reversed ArrayList");
        System.out.println(arrayList);


        System.out.println("Displaying original LinkedList :-");
        System.out.println(linkedList);

        // reversing LinkedList
        reverseList(linkedList);
        System.out.println("Displaying reversed LinkedList");
        System.out.println(linkedList);

    }
}
