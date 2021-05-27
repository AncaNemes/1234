package day36_methods_with_return;
import java.util.*;

public class creditScore {
    public static void main(String[] args) {
     checkEligible(720);
     checkEligible(350);
       // System.out.println(checkEligible(722));- ERRORS WE CAN PRINT A CUSTOM METHODY

        System.out.println(getCreditScore());
        System.out.println("credit score = " +getCreditScore());
        int score = getCreditScore();
        System.out.println("score = " +score);
    }

    public static void checkEligible( int creditScore ) {

        if (creditScore >= 700) {
            System.out.println("you are egligible for a lease tesla");
        } else {
            System.out.println("sorry,you do not qualify ");
        }
    }
    public static int getCreditScore(){
        return 800;
    }
}