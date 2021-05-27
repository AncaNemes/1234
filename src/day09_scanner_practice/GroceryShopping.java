package day09_scanner_practice;
import java.util.Scanner;
public class GroceryShopping {
    /*
    Target
    milk, bred,cucumber
    flow:enter price for milk:
    3.00
    Enter price for bread:
    2.55
    Enter price for cucumbers:4.10
    Total is$ 10.33
    price1
    price2
    price
    total
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter price for milk");
        double price1=scan.nextDouble();
        System.out.println("Enter price for bread");
        double price2=scan.nextDouble();
        System.out.println("Enter price for cucumbers");
        double price3=scan.nextDouble();
       double  totalPrice=price1+price2+price3;
        System.out.println("Total: "+totalPrice);
    }
}
