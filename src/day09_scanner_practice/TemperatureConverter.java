package day09_scanner_practice;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("The Farenheigth/ temperature is: ");
        double farenheit=scan.nextDouble();
        double celcius= (farenheit-32)*5/9;
        System.out.println("The temperature in Farenheit is:"+farenheit+ " .Converted in celsius is"+celcius);


    }
}
