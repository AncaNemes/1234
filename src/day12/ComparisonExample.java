package day12;

public class ComparisonExample {
    public static void main(String[] args) {
    /*declare 3 variables
  current speed- 45
  speedLimit-55
                        isSpeeding-true is speeding, false is not speeding

     */
        int speedLimit = 55;
        int currentSpeed = 45;
        System.out.println(speedLimit > currentSpeed); // false 45 NOT MORE 55
        System.out.println(speedLimit< currentSpeed); // FALSE 55 NOT LESS 45
        System.out.println( speedLimit == currentSpeed); //FALSE 55 NOT EQUAL TO 45

        boolean isSpeeding = currentSpeed>speedLimit;
        System.out.println(" Are you speeding?- " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed+"mph");
        System.out.println(" speedLimit= "+speedLimit+"mph");
        System.out.println("isSpeeding = " + isSpeeding);

        currentSpeed+=20;// increased to 65
        isSpeeding = currentSpeed>speedLimit;
        System.out.println(" Are you speeding?- " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed+"mph");
        System.out.println(" speedLimit= "+speedLimit+"mph");
        System.out.println("isSpeeding = " + isSpeeding);

        double accountBalance=250.25;
        double itemPrice=100.99;
        System.out.println("can I afford "+ (accountBalance >= itemPrice)); //true
        
        boolean canAfford = accountBalance>=itemPrice;
        System.out.println("canAfford = " + canAfford);

        //decrease balance by itemPrice using shorthand operator
        accountBalance = accountBalance - itemPrice;
        accountBalance -= itemPrice;
        System.out.println(itemPrice);
        
       boolean isBroke= accountBalance <= 0;
        System.out.println("isBroke = " + isBroke);


    }
    }

