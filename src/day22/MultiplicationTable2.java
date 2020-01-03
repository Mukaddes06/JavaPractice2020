package day22;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        for (int timesTable = 1; timesTable <= 10; timesTable++) {
            System.out.println("Multiplication table of " + timesTable);

            for (int base = 1; base <= 12; base++) {
                System.out.println(timesTable + "x" + base + "=" + timesTable * base);
            }
        }
    }
}
