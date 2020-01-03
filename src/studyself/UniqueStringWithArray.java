package studyself;

import java.util.Arrays;

public class UniqueStringWithArray {
    public static void main(String[] args) {
        // Write a program that can print out the unique values from  String Array
        //        Ex:
        //            if arr -> {"a" , "a ", "b", "c", "c"}
        //                output: b
        String[] letter = {"A" , "A ", "B", "C", "C"};

        int count=0;
        for (int i = 0; i <letter.length ; i++) {
            if(letter[i].equals(letter[2])){
                count++;
            }
        }
      if(count==1){
          System.out.println(letter[2]);
      }
    }
}
