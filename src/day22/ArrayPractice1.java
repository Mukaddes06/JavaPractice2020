package day22;

public class ArrayPractice1 {
    public static void main(String[] args) {
        double[] prices = new double[5];
        System.out.println( prices[0] );
        // can NOT print out array  variable directly
        // to see what's inside
        System.out.println(prices);


        prices[0]=2.46;
        prices[1]=12.96;
        prices[2]=992.1;
        prices[3]=500;
        prices[4]=65.123;
        // RUN TIME ERROR
        // prices [5] = 165.33;---->>> ArrayIndexOutBoundOfException!

        System.out.println( prices[0]);
        System.out.println( prices[1]);
        System.out.println( prices[2]);
        System.out.println( prices[3]);
        System.out.println( prices[4]);

        char[] name = new char[8];
        // what default value do we get for char array
        //we get a char represented by ascii code 0
        name[0]='M';
        name[1]='U';
        name[2]='K';
        name[3]='A';
        name[4]='D';
        name[5]='D';
        name[6]='E';
        name[7]='S';

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);
        System.out.println(name[4]);
        System.out.println(name[5]);
        System.out.println(name[6]);
        System.out.println(name[7]);

        // This will actually the content of char array not memory adress
        // And this is only for char array , anything else will print memory adress
        System.out.println(name);

        boolean[] yesNo=new boolean[3];
        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);

        yesNo[0]=true;
        yesNo[1]=false;
        yesNo[2]=10>7==true;

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);


    }
}
