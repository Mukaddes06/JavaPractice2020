package day22;

public class LoopingThroughAnArray {
    public static void main(String[] args) {
        int [] scores  = new int[4];
        scores[0]=95;
        scores[1]=70;
        scores[2]=88;
        scores[3]=100;
     //  accsesing the elements inside array one by one
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

        // how do we get the size of any array object
        // array object has a property called length


        // how do we get the char count of a String
        //array object has a property called length
        int itemCount = scores.length;
        int lastItemIndex=itemCount-1;

        for (int x = 0; x <itemCount; x++) {
            System.out.println(scores[x]);
        }

        //print this array in reverse order



        //REVERSE
        for(int x=scores.length-1; x>=0; x--){
            System.out.println("index location " + x);
            System.out.print (scores[x]+" ");
        }

    }
}
