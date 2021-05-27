package day09_scanner_practice;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER cents: ");

        int cents=scan.nextInt();// int cents=255
        int dollars=cents/100;
        int remaining= cents % 100;
        System.out.println( "In "+cents+ " cents: is "+ dollars+"$ "+ remaining+" cents");

    }
}
