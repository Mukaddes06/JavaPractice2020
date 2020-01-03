package day31;

public class SeasonChecker {
    public static void main(String[] args) {

          decideSeasonAction("Spring");
          decideSeasonAction("Summer");
          decideSeasonAction("Fall");
          decideSeasonAction("Winter");

          String mySeason="AAAA";
          decideSeasonAction("AAAAA");

        System.out.println("AAAAA");
        System.out.println(mySeason);
    }
    public static void decideSeasonAction (String season){
    switch (season){
        case "Spring" :
            System.out.println("Hiking");
            break;
        case "Summer":
            System.out.println("Swimming");
            break;
         case"Fall":
            System.out.println("Pumpkin picking");
            break;
        case "Winter":
            System.out.println("Go snowboarding");
            break;
            default:
                System.out.println("INVALID SEASON");
        }
    }

}
