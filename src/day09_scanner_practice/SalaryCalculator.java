package day09_scanner_practice;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        /* enter hourly
        Assume 40 hours of work in a week
        we need to calculate: weeklyPay, monthlyPay, annualPay
        print all three in 3 lines
         */

        Scanner input= new Scanner(System.in);
        System.out.println("Enter hourly rate: ");
        int hourlyRate=input.nextInt();
        int weeklyPay=hourlyRate*40;
        int monthlyPay = weeklyPay*4;
        int annualPay=(monthlyPay*12);
        System.out.println("Weekly pay:" +weeklyPay);
        System.out.println("Monthly pay:"+monthlyPay);
        System.out.println("Annual pay:"+ annualPay);



    }
}
