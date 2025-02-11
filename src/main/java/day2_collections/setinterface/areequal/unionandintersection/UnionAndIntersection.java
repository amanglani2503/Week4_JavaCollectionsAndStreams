package day2_collections.setinterface.areequal.unionandintersection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2){
        Set<T> unionSet = new HashSet<>();

        // adding elements of set1 to union
        for(T element : set1){
            unionSet.add(element);
        }

        // adding elements of set2 to union
        for(T element : set2){
            unionSet.add(element);
        }

        // returning union set
        return unionSet;
    }

    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> intersectionSet = new HashSet<>();

        // adding elements of set1 that are in set2 also to intersection
        for (T element : set1) {
            if(set2.contains(element)){
                intersectionSet.add(element);
            }
        }

        // returning union set
        return intersectionSet;
    }

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Arrays.asList("Aditya", "Ashish", "Harsh", "Aman"));
        Set<String> set2 = new HashSet<>(Arrays.asList("Harsh", "Piyush", "Rohit", "Ashish"));

        // displaying original sets
        System.out.println("Set 1 : " + set1);
        System.out.println("Set 2 : " + set2);

        Set<String> unionSet = union(set1, set2);
        System.out.println("Union Set : " + unionSet);

        Set<String> intersectionSet = intersection(set1, set2);
        System.out.println("Union Set : " + intersectionSet);
    }
}
