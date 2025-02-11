package day2_collections.setinterface.areequal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AreEqual {
    public static <T> boolean areEqual(Set<T> set1, Set<T> set2){
        if(set1.size() != set2.size()){     // if sizes are unequal, sets cannot be equal
            return false;
        }

        for(T element : set1){
            if(!set2.contains(element)){    // if element of set1 not found in set2
                return false;
            }
        }

        // all elements of set1 found in set2 and sizes were equal too. thus they are equal
        return true;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,2,1));

        // checking if sets are equal
        boolean areSetsEqual = areEqual(set1, set2);

        if(areSetsEqual){
            System.out.println("Sets are equal !");
        } else {
            System.out.println("Sets are not equal !");
        }
    }
}
