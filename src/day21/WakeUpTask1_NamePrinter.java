package day21;

public class WakeUpTask1_NamePrinter {
    public static void main(String[] args) {
        //              0123456789012345678
        String myName= "My name is Mukaddes";
      /*  for (char i = 0; i <myName.length()-1; i++) {
            if(i==myName.length()-1){
                System.out.println(myName.charAt(i));
            }else{
                System.out.print(myName.charAt(i) + "->");
            }
        */
      int charCount = myName.length();
        System.out.println("charCount = " + charCount); // char count--> charCount = 19
      int lastCharIndexOf= charCount-1;
        System.out.println("lastCharIndexOf = " + lastCharIndexOf); // char count--> lastCharIndexOf = 18

       // System.out.println(myName.substring(0,1)); // it gives first caharacter M
     //   System.out.println(myName.substring(1,2)); //  y
        for (int x = 0; x <=lastCharIndexOf ; x++) {
           // System.out.print(myName.charAt(x) + "->");
            System.out.print(myName.substring(x,x+1) + "->");// M->y-> ->n->a->m->e-> ->i->s-> ->M->u->k->a->d->d->e->s->
        }

        }

    }

