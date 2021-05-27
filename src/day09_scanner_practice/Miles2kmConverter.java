package day09_scanner_practice;

import java.util.Scanner;

public class Miles2kmConverter {
    /*main method import scanner
    create scanner object
    miles, km
    Enter miles:
    10
    10 miles in km:16.0934
    formula:
    km-. miles*16.0934
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("########## MILES TO KM CONVERTER###########");
        System.out.println("Enter miles: ");
        double miles=scan.nextDouble();
        double km= miles*1.609;
        System.out.println(miles+" miles is:"+km+" is km");
    }
}
