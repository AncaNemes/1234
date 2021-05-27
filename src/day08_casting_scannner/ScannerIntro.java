package day08_casting_scannner;

import java.util.Scanner; // 1.import java.until
public class ScannerIntro {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);// 2. scanner

        System.out.println("Please enter your name: ");//

        String firstName = scan.next();
        System.out.println("nice to meet you, "+firstName);
    }
}
