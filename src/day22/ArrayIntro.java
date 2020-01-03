package day22;

public class ArrayIntro {
    public static void main(String[] args) {
        //Syntax for creating variable and assigning value
        // dataType variableName = value here
        int num1= 10;
        System.out.println(num1);
        // syntax for creating variable to store multiple items
        // and assigning a values
        // dataType [] variableName= new dataType [count of item];
        // this array can hold 4 items, its also known as array size

        int[] scores = new int[4];
        scores[0]=95;
        scores[1]=70;
        scores[2]=88;
        scores[3]=100;
      /*
      accessing the elements inside
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);*/

        for (int i=0;i<=3;i++){
            System.out.println(scores[i]);
        }
      // uptading the value ast certain index

        /* scores[1]==99;
        System.out.println(scores[1]);*/

       // once array is created with certain size , we CAN NOT CHANGE THE SIZE!
        // When you create new Array object
        // it will get default value in each element
        int[] numbers=new int[3];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        // create an byte array with size 4
        // and stored into a variable called data
        // assign value for each index location
        // print out the values at each index
        // update last index value
        // then print it out

        byte [] data  = new byte[4];
        data[0]=95;
        data[1]=70;
        data[2]=88;
        data[3]=100;

        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);

        data[1]=99;
        System.out.println(data[1]);


    }
}
