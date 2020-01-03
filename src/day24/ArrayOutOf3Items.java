package day24;
import java.util.Arrays;
public class ArrayOutOf3Items {
    public static void main(String[] args) {
        // create an double array of 3 items ; and put the value
        //get a string representation out of this array and save it as pricesString
        // print each and every character i this String in this format
        // character at index 1 is: yourCharacterHere
        // character at index 2 is : yourCharacterHere and so on all the way till last

        double[] prices = {1.34, 3.00, 2.02};
        System.out.println("Arrays.toString(prices)" +Arrays.toString(prices));

        String pricesString = Arrays.toString(prices);
        System.out.println("pricesString" + pricesString);
// we are looping over a String not an array so we stop at last character finishes
        for (int i = 0; i <pricesString.length() ; i++) {
            System.out.println( "character at index" + i + "is:" + pricesString.charAt(i));
        }
        // the OLE PURPOSE OF Arrays.toString(yourArray) is To SEE WHAT IS INSIDE

        // for sorting an array in ascending order
        // sort    --->>  Arrays.sort(yourArrayHere)

        // for checking for equality of 2 array object content
        // equals  ---->> Arrays.equals(firstArray,secondArray)

        // This method will give you string representation of any type of array
        // the result will look --->>   [item1 , item 2 , item 3 ...... lastItem]


    }
}