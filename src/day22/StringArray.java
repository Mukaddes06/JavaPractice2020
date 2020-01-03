package day22;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringArray {
    public static void main(String[] args) {
        String [] myFamily = new String[4];
        myFamily[0]="Mukaddes Kay";
        myFamily[1]="Osman Kay";
        myFamily[2]="Kagan Kay";
        myFamily[3]="Alp Kay";

        System.out.println(myFamily[0] );
        System.out.println(myFamily[1] );
        System.out.println(myFamily[2] );
        System.out.println(myFamily[3] );

        // immutable means you can not changes the internal structure of the object
        // if you have String abc="Hello"
        // if you do abc.toUppercase--->> it will create new String onject "HELLO"
        // and it does not change original hello at all!

        // not resizable --> specifically for array
       // we can not change the size of array once we create them with certain size
       // However , we can change the elements inside this array
       // and it means : IT IS NOT IMMUTABLE


    }
}
