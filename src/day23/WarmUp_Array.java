package day23;

public class WarmUp_Array {
    public static void main(String[] args) {
        int [] numbers = new int[]{1,4,7,8,5,9,10};
     //reverse
        for (int i = numbers.length-1; i>=0 ; i--) {
            System.out.print(numbers[i] + " " );
        }

        //lastItem

        int size=numbers.length;
        int lastItem = size-1;
        int lastItemValue= numbers[lastItem];
        System.out.println("last item is " + lastItemValue);

        //MiddleOne
        int middle=0;
        for (int i = 0; i <numbers.length-1 ; i++) {
            System.out.println("Middle one = " + numbers[numbers.length/2]);
        // sum
            int sum = 0;
            for (int z=0; z<numbers.length; z++){
                sum += numbers[z];
            }
            System.out.println("sum is " + sum);

      //Max
            int max = numbers[0];
            for (int k = 0; k <numbers.length ; k++) {
                if(numbers[k]>max){
                    max=numbers[k];
                }
            }
            System.out.println("max = " + max);

            //min
            int min = numbers[0];
            for (int x = 0; x <numbers.length-1 ; x++) {
                if(numbers[x]<min){
                    min=numbers[x];
                }
            }
            System.out.println("min = " + min);
                //Average
                // average
                int average = sum / (numbers.length);
                System.out.println("average is " + average);

            }

        }

        }


