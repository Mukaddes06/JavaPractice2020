package day31;

public class MethodIntro {
    public static void main(String[] args) {

        // Two ways to call static methods
        // ClassName.methodNmae(external data if needed)
        // if yor are in same class
        // you can directly called them
        // methodName(external data if needed)
        // MethodIntro.sayHello(); /// Optionall if you are u=in same class

        System.out.println("Begin:");
        sayHello();
        System.out.println("-------------------------");
        sayHello();
        System.out.println("THE END");

        // 11-->12 (20-21-22) ---13-->>14-(20-21-22)---15-->
    }   // MAIN METHOD ENDS HERE!
    // DO NOT CREATE A ETHOD INSIDE MAIN METHOD

    public static void sayHello (){
        System.out.println("Hello world");
        System.out.println("My name is Mukaddes");
        System.out.println("I love java ");
    }
}
