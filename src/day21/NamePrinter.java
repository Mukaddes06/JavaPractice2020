package day21;

public class NamePrinter {
    public static void main(String[] args) {
        String name="My name is Mukaddes";

        String myName="";
        for(int x=0;x<=name.length()-1;x++){
            myName=name.substring(x,x+1)+"->";
            System.out.print(myName);
        }
        System.out.println();


        for(int x=0;x<=name.length()-2;x++) {
            myName= name.substring(x, x + 2) + "->";
            System.out.print(myName);
        }
        System.out.println();


        for(int x=0;x<=name.length()-3;x++) {
            myName = name.substring(x, x + 3) + "->";
            System.out.print(myName);
        }
        System.out.println();


        for(int x=0;x<=name.length()-4;x++) {
            myName= name.substring(x, x + 4) + "->";
            System.out.print(myName);

        }
        System.out.println();

    }
}