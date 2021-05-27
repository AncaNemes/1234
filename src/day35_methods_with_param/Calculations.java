package day35_methods_with_param;

import day36_methods_with_return.Calculator;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("add 10 + 45 = " + Calculator.add(10,45));
        System.out.println("minus 45-12= " + Calculator.minus(45,12));
        System.out.println("divide 20\2 = " + Calculator.divide(20,2));
        System.out.println("multiply 5*20 = " + Calculator.multiply(5,20));
  double d1=234.2;
  double d2= 321.5;
  double result = Calculator.minus(d1,d2);
        System.out.println("result = " +result);


    }



}
