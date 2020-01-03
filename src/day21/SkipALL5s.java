package day21;

public class SkipALL5s {
    public static void main(String[] args) {
        for (int i = 0; i <=100 ; i++) {

            if (i % 5 != 0){
                System.out.println("SKIPPING " + i);
             continue;
            }
            System.out.println(i);
        }
        // without continue
        for (int x = 0; x <=100 ; x++) {

            if (x % 5 != 0){
                System.out.println(x);
            }else {
                System.out.println("SKIPPING " + x);
            }
        }
    }
}
