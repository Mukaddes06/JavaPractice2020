package day48;

public class HR_Action {
        public static void main(String[] args) {

            HourlyEmployee e1= new HourlyEmployee( "Su",101,55,2000);
            e1.calculateAnnualSalary();
            System.out.println("e1 = " + e1);

            HourlyEmployee e2=new HourlyEmployee("ahmet",102,57,2080);
            e2.calculateAnnualSalary();
            System.out.println("e2 = " + e2);

            FullTimeEmployee e3 = new FullTimeEmployee("Kagan",103,6000);
            e3.calculateAnnualSalary();
            System.out.println("e3 = " + e3);

            FullTimeEmployee e4 = new FullTimeEmployee("Alp",104,13000);
            e4.calculateAnnualSalary();
            System.out.println("e4 = " + e4);

            // each and every class we create , it will become a data type (reference type)
        }
    }



