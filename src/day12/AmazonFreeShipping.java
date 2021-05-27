package day12;
import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        /* create scanner object
        ask"Enter totalPrice" assign value to totalPrice from scan.nextDouble.
        if totalPrice is more than or equal 25
        print"FREE SHIPPING ELIGIBLE.tour order total:55$"
        ELSE
        print""NOT ELIGIBLE FOR FREE SHIPPING.Your order total is10$.less than minimum of $25"
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your order total price:");
        double totalPrice=scan.nextDouble();

        if (totalPrice >=25.0){
            System.out.println("FREE SHIPPING ELIGIBLE.tour order total:55$ "+totalPrice);
        } else {
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING.Your order total: $" + totalPrice);
        }
        System.out.println("THANKS FOR SHOPPING WITH AMAZON");
    }
}
