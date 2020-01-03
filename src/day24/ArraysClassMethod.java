package day24;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class ArraysClassMethod {
    public static void main(String[] args) {
        // Arrays class a class coming from java.util package
        // it has a lot of pre-built method to work with array object

        String[] superHeros = {"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash"};
        //System.out.println( superHeros );
        System.out.println("Arrays.toString(superHeros)    result :     ");
        System.out.println(Arrays.toString(superHeros));
        // saving the string result into a variable and print
        String superHerosAsString = Arrays.toString(superHeros);
        System.out.println(" superHerosAsString    result :     ");
        System.out.println(superHerosAsString);

        // how do we get first character of superHerosAsString variable
        System.out.println(" superHerosAsString.charAt(0)   result :     ");
        System.out.println(superHerosAsString.charAt(0));
        System.out.println("--------------------------");

       int []numbers = {10,44,55,3,78};
        System.out.println("Arrays.toString(numbers) RESULT");
        System.out.println(Arrays.toString(numbers));



    }
}
