package day22;

public class CanvasDayModuleLinkGenerator {
    public static void main(String[] args) {
        String baseURL="https://learn.cybertekschool.com/courses/278/modules#3318";
        String dayMsg= "this will lead to you";

      //  for (int moduleNumber = 3317; moduleNumber <=3317+25 ; moduleNumber++) {
        // }
        // 3297 is day one module ID
        // get from say 1 till day 22
        for (int day = 21; day <=56 ; day++) {
            System.out.println(dayMsg + day);
            //if day is 21 the number is 3317 according to reguirement
            //if day is 22 the number is 3318 according to reguirement
            System.out.println(baseURL+(3317-21 + day));

        }
    }
}
