package day24;

import java.util.Arrays;

public class ArraysMethodSorting {
    public static void main(String[] args) {
        int[] scores= {99,44,23,19,55};
        System.out.println(Arrays.toString(scores));
        System.out.println("---------------String Sorting---------------");
        // for printing the content of the array ---->> low the high
        // toString  --->> Arrays.toString(yourArrayHere)
       Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        // first item value
        System.out.println("first item value : " +scores[0]);
        char [] nameChars = {'G',' ','d', 'Z', '9', 'A'};
        System.out.println("Before sorting nameChars = " + Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println("After sorting nameChars = " + Arrays.toString(nameChars));

        System.out.println("---------------Boolean Sorting----Sort method does not work for boolean array-----------");
        boolean[] FiveSiwitchOnOffs = {true, false,false,true,true};
        System.out.println(" FiveSiwitchOnOffs = " + Arrays.toString(FiveSiwitchOnOffs));
  // Arrays.sort(arrObject) does not return a value that we can store
        // it only takes action reshuffle the index of original array object to keep
    }
}
