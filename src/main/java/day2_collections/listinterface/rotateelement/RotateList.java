package day2_collections.listinterface.rotateelement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateList {
    public static <T> List<T> rotateList(List<T> inputList, int positions) {
        if(inputList.isEmpty()){
            return inputList;
        }

        List<T> rotatedList = new ArrayList<>();

        // handling if positions to be rotated is greater than size of list
        positions = positions % inputList.size();

        for (int i = positions; i < inputList.size(); i++) {
            rotatedList.add(inputList.get(i));
        }

        for (int i = 0; i < positions; i++) {
            rotatedList.add(inputList.get(i));
        }

        return rotatedList;
    }

    public static void main(String[] args) {
        // creating a list
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println("Original List :- ");
        System.out.println(list);
        List<Integer> rotatedList = rotateList(list, 2);

        System.out.println("Displaying rotated List :- ");
        System.out.println(rotatedList);
    }
}