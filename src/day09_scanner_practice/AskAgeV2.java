package day09_scanner_practice;

import java.util.Scanner;

public class AskAgeV2{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println(" How old are you?");
        //scan.nextInt(); you can type your own age
        int age=scan.nextInt(); // int age= 11;-. as an example
        System.out.println(age+" that's a great age");

        //to close scanner you can give the command
        //scan.close();

    }

}
