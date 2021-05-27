package day14_multi_branch_if_statement;

public class CalculatorV1 {
    public static void main(String[] args) {
        /*num1,  num2
       char  operator - + * / % /*

        operator -> + : add num1 + num2
        operator -> - : minus num1 - num2
        operator -> * :  multiply num1 * num2
        operator -> / : divide num1 / num2

         */
        double num1 = 4.5;
        double num2 = 5.7;
        char operator = '-';

        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        }else if (operator=='/'){
            System.out.println(num1 / num2);
        } else System.out.println("Invalid operator"+operator);
    }
}