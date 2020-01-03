package day24;

import java.util.Arrays;

public class ArraysEquality {
    public static void main(String[] args) {
        int [] scores1 = {2,5,6,7,3,34,6};
        int [] scores2 = {22,45,2,5,6,7,3,34,6};
        int [] scores3 = {2,5,6,7,3,34,6};
        System.out.println(scores1==scores2);
        System.out.println(scores2==scores3);
        boolean issSSS2223Equals = Arrays.equals(scores1,scores2);
        System.out.println(issSSS2223Equals);

        boolean isEquals = Arrays.equals(scores1,scores3);
        System.out.println(isEquals);
    }
}
