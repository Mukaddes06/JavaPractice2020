package day23;

public class ForEachLoopPracticeSalary {
    public static void main(String[] args) {
        long[] salaries = {100000L, 200000L, 300000L, 400000L, 500000L};
        for (long myOffers : salaries) {
            if (myOffers > 100000L) {
                continue;
            }

            System.out.println("myOffers = " + myOffers);
        }
        // i need to pick up an item from this array so i can comprae with other items
        // since firs one is right there, I just decided to pick it up
        // and mak it temporarily the max value
        //can I pick 2nd ord 3rd instead---->>Yes you can!

        /*
        plain englis logic to find max salary
        write down the first number as temporarily max salary on a paper
        then go through each number and compare the number
        if the number you are comparing is more than what is on paper
        delete that number and replace with bigger number
        keep doing this until you dont have any more number left
         */
      
        long max=salaries[0];
        // check the current salary is more than max
        for (long salary : salaries) {
            // if so replace the existing value of max with current bigger salary
            if(salary>max){
                max=salary;
        }
        }
        System.out.println("maxSalary = " + max);
    }
}
