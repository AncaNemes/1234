package day17_ternary_nested_conditions;

public class nestingIFAmazonPrimeShopping {
    public static void main(String[] args) {
        int itemPrice = 30;
        itemPrice=20;
        boolean isPrimeMember = true;

        if (isPrimeMember) {   // also can write (isPrimeMember == true)
            System.out.println("Eligible for free 2 day shipping");
        } else {
            if (itemPrice >= 25) {
                System.out.println("Eligible for free regular shipping");
            } else {
                System.out.println("Not eligible for free shipping, fee is $10");
            }
        }
    }
}
//pseudocode=code written in human language, then it will be translated to java or other programming