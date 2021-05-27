package day36_methods_with_return;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {

        System.out.println(add(2.5, 2.5));
        double result = add(1, 3);
        System.out.println("Add result = " + result);
        System.out.println("100.0 + 200.0 = " + add(100,200));
        System.out.println("_________minus menthod___________");
        System.out.println(minus(5.1, 3.2));
        System.out.println("_______multiply method_________");
        System.out.println(multiply(5.1, 3.2));

        System.out.println("________dividing method __________");
        System.out.println(divide(5.1, 3.2));

    }


    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum; // return num1+num2;


    }

    public static double minus(double num1, double num2) {
        double sum = num1 - num2;
        return sum;
    }

    public static double multiply(double num1, double num2) {
        double sum = num1 * num2;
        return sum;
    }

    public static double divide(double num1, double num2) {
        double sum = num1 / num2;
        return sum;
    }
}