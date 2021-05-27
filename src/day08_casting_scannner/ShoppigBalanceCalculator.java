package day08_casting_scannner;

public class ShoppigBalanceCalculator {
    public static void main(String[] args) {
       double balance = 345.55;
          double price1 = 20.88;
          double price2 = 89.99;
          double price3 = 15.00;
         //double  remainingBalance = balance-(price1+price2+price3);
        double  remainingBalance = balance-price1-price2-price3;
        int balanceWithNoCents = (int)remainingBalance;
System.out.println("Initial balance: "+balance);
System.out.println("Remaining balance:"+ remainingBalance);
System.out.println("Remaining balance no change:$ "+balanceWithNoCents);

// CASTING CONTINUED:
// convert one primitive into another
        //WHEN WE assigned one primitive data into different one,
        // we need to CONVERT/CAST IT
        //2 TYPES
        //implicit- happends automatically when we assign small data type into larger one
        //explicit- we need to use parenthesis and specify what primitive type we want to cast/convert
        //Implicit casting
        // byte, short, int, long

        byte num1=10;
       short num2=num1;
    }
    }
