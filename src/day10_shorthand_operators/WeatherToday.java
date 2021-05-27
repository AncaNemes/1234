package day10_shorthand_operators;
import java.util.Scanner;

public class WeatherToday {
    public static void main(String[] args) {
        /* main method
        weather, sunny, raining very cold very hot
        import scanner
        create scanner object
        ask a question How is the weather today?-- cold
        concatentation-> it is a nice day  today!
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("How is the weather today?");

     //String weatherOne="sunny";
       // String weatherOne = scan.next();
        String weatherOne = scan.nextLine();
        System.out.println("weatherOne = " + weatherOne);
        System.out.println(weatherOne+ " -it is a nice day today!");

    }
}
