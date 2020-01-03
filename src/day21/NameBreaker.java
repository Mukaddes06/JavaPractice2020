package day21;

public class NameBreaker {
    public static void main(String[] args) {
        String name = "Nursultan";

        for (int i = 0; i <= name.length() -1; i++) {
            System.out.print(name.substring(i, i + 1));
            if (name.substring(i, i + 1).equalsIgnoreCase("l")) {
                break;
            }

        }
        System.out.println("==================================");
        for (int i = 0; i <name.length() ; i++) {

            System.out.print(name.charAt(i));

            if(name.charAt(i)=='l'){
                System.out.print(" FOUND IT!!!!! ");
                break;

            }


        }
    }
}
