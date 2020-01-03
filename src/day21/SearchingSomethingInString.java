package day21;

public class SearchingSomethingInString {
    public static void main(String[] args) {
        String myName = "Mukaddes Kay";
        int charCount = myName.length();
        System.out.println("charCount = " + charCount); // char count--> charCount = 19
        int lastCharIndexOf = charCount - 1;
        System.out.println("lastCharIndexOf = " + lastCharIndexOf); // char count--> lastCharIndexOf = 18

        // Find out index of all the a in class insensitive manner
        // i will go through each and every letter of the String
        //                     --->>each character I can use substrin(0,1) and so on
        //                     --->>going to 0 to last index ---->> for loop
        // i will check whether current character I am looking at
        // equals to a Or A --->>> currentCharacter.equalsIgnoreCase("a")
        // if its i will print the index  println(the variable you use to keep the index
        // if nor --->> just move on
        // perform this action until I reach last character  If I go over last character index i stop

        for (int x = 0; x <= lastCharIndexOf ; x++) {
            String currentChar= myName.substring(x,x+1);
           if(currentChar.equalsIgnoreCase("a")){
    System.out.println("The index of a or A is " + x);
}
        }
        for (int x = 0; x <= lastCharIndexOf-2 ; x++) {
            String currentChar = myName.substring(x, x + +3);
            if (currentChar.equalsIgnoreCase("des")) {
                System.out.println("The index of a or des is " + x);
            }
        }
    }
}
