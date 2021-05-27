package day10_shorthand_operators;

import java.util.Scanner;

public class NextLineBug {
    /* add main method
    import create scanner
            rent month
                    print values/*

     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" Monthly rent:");
        int rent=scan.nextInt();
        //String month=scan.next();
        scan.nextLine(); // FIXES THE BUG-WORKAROUND
        String month=scan.nextLine(); // it will have a GLICH/BUG and  will not take it
        System.out.println("rent = "+rent);
        System.out.println("month = " + month);
    }
}
