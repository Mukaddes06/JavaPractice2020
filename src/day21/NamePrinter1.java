package day21;

public class NamePrinter1 {
    public static void main(String[] args) {
        String myName = "My name is Mukaddes";
        int charCount = myName.length();
        System.out.println("charCount = " + charCount); // char count--> charCount = 19
        int lastCharIndexOf = charCount - 1;
        System.out.println("lastCharIndexOf = " + lastCharIndexOf); // char count--> lastCharIndexOf = 18
        for (int x = 0; x < charCount; x++) {
            System.out.print(myName.substring(x, x + 1) + "->");
        }
        for (int x = 0; x <= lastCharIndexOf - 1; x++) {
            System.out.print(myName.substring(x, x + 2) + "->");

        }
        System.out.println("=========================");

        for (int x = 0; x <= lastCharIndexOf - 2; x++) {
            System.out.print(myName.substring(x, x + 2) + "->");

        }
        System.out.println("===========================");
        for (int x = 0; x <= lastCharIndexOf - 3; x++) {
            System.out.print(myName.substring(x, x + 3) + "->");
        }
        System.out.println("===========================");
    }
}