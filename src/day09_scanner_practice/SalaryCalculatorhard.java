package day09_scanner_practice;

public class SalaryCalculatorhard {
    public static void main(String[] args) {
    double hourlyRate=55.0;
    double weeklyPay=hourlyRate*40;
    double monthlyPay = weeklyPay*52;
    double annualPay=(monthlyPay*12);
        System.out.println("Weekly pay:" +weeklyPay);
        System.out.println("Monthly pay:"+monthlyPay);
        System.out.println("Annual pay:"+ annualPay);
}
}