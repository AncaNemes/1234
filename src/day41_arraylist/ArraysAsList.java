package day41_arraylist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
List<Integer> nums = Arrays.asList(23,1,32,54,654);
        System.out.println("nums = " + nums);

        /**
         List String drinksWithCaffeine -> coffee, tea, monster, red bull, coke, pepsi, mdew, kambucha
         */


        List<String> drinksWithCaffeine= new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "coke", "pepsi", "mdew", "kambucha", "celcius"));
        System.out.println(drinksWithCaffeine);
        int caffeineAmount=0;

        for(String drink: drinksWithCaffeine){
            if(drink.equals("monster")||drink.equals("red bull") ||drink.equals("celsius")){
                caffeineAmount=150;
                System.out.println(drink +"-->" + caffeineAmount);
            }else if (drink.equals("coffee")||drink.equals("kombucha")) {
                caffeineAmount=112;
                System.out.println(drink +"-->" + caffeineAmount);
            }else if (drink.equals("coke")||drink.equals("pepsi")||drink.equals("mdew")) {
                caffeineAmount = 35;
                System.out.println(drink + "-->" + caffeineAmount);
            }

        }

for(String drink:drinksWithCaffeine){
    switch(drink){
        case "monster": case "red bull": case"celsius":
            caffeineAmount=150;
            System.out.println(drink + caffeineAmount);
            break;
        case "coffee": case "kombucha":
            caffeineAmount=112;
            System.out.println(drink + caffeineAmount);
            break;
        case "coke": case "pepsi": case"dhew":
            caffeineAmount=35;
            System.out.println(drink + caffeineAmount);
            break;
    }
}
    }
}
