package day09_scanner_practice;
import java.util.Scanner;

public class AddNumbers {
    // enter 2 numbers : 5 and 4
   // Result: 9
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result= num1+num2;
        System.out.println("Result: "+result);

 // on the version HARDCODING
        // int num1=4;
        //int num2=5;
        // int result=num1+num2 when we print it will give us the result write away
// when inserting the SCANNER  IT WILL ALLOW YOU TO OUT THE NUMBeRS
    }
}
