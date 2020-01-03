package day24;

import java.util.Arrays;
public class HWStringPrices {
    public static void main(String[] args) {
        double[] prices = new double[] {7.25,9.55 ,19.99 } ;
        System.out.println("Arrays.toString(prices) result " + Arrays.toString(prices) );
        String pricesString = Arrays.toString(prices) ;
        System.out.println("pricesString = " + pricesString);
        for (int i = 0; i < pricesString.length(); i++) {
            System.out.println( "character at index " +i + " is : " +pricesString.charAt(i)  );
        }
    }
}
