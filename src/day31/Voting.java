package day31;

public class Voting {
    public static void main(String[] args) {
        checkEligibility(13);
        checkEligibility(19);
        checkEligibility(63);

        int yourAge=12;
        checkEligibility(yourAge);
    }
    public static void  checkEligibility(int age){

        if(age>18){
            System.out.println("You are eligible to void" );
        }else{
            System.out.println("You are not eligible");
        }
    }
}
