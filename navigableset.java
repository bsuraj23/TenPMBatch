package arraylist;
import java.util.*;
public class navigableset {
    public static void main(String[] args) {

        NavigableSet navSet = new TreeSet();


        navSet.add(10);
        navSet.add(20);
        navSet.add(5);
        navSet.add(40);
        navSet.add(30);

        System.out.println("\nElements of sortedSet: " + navSet);

        System.out.println("\nSmallest element from subSet of larger than 25: " + navSet.ceiling(25));

        System.out.println("\nLargest element from subSet of smaller than 25: " + navSet.floor(25));

        System.out.println("\nSmallest element from subSet of larger than 25: " + navSet.higher(25));

        System.out.println("\nLargest element from subSet of smaller than 25: " + navSet.lower(25));

        System.out.println("\nSubset with upperBound, including it: " + navSet.headSet(30, true));

        System.out.println("\nSubset with upperBound, excluding it: " + navSet.headSet(30, false));

        System.out.println("\nSubset with lowwerBound, including it: " + navSet.tailSet(30, true));

        System.out.println("\nSubset with lowerBound, excluding it: " + navSet.tailSet(30, false));

        System.out.println("\nRemove the first element: " + navSet.pollFirst());

        System.out.println("\nRemove the last element: " + navSet.pollLast());

    }

}

