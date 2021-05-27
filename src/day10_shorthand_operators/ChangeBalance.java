package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        //declare balance=1200.44
         double balance=1200.44;
        System.out.println("balance = " + balance);
        //balance = balance -50 ;
        //System.out.println("balance = " + balance);

        double baklava =22.50;
        System.out.println("baklava = " + baklava);
        //decrease balance by baklava price

        balance=balance-baklava;
        System.out.println(" balance after baklava="+balance);
        
        double kenafa =22.50;
        System.out.println("kenafa = " + kenafa);
        balance=balance-kenafa;
        System.out.println("balance after kenafa = " + balance);
        // second kenafa is 50% off lets buy it
        
        kenafa=kenafa/2;
        System.out.println("kenafa = " + kenafa);

        // buy it and decrease balance with kenafa price
        balance= balance-kenafa;
        System.out.println("Balanace after kenafa 1/2 off = " + balance);
        
        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance= balance-plov;
        System.out.println("Balanace after plov = " + balance
        );

        double icedTea = 3.0;
        System.out.println("icedTea = " + icedTea);
        //icedTea= icedTea*3;
        //System.out.println("icedTea = " + icedTea);
        //balance= balance-icedTea; or you can do
         balance=balance-icedTea*3;
        System.out.println("Balance after 3 icedTea = " + balance);

        // return baklava
        balance= balance+baklava;
        System.out.println("Reurned baklava= " + balance);
    }

}
