package day16_switch;

public class ELevator {
    public static void main(String[] args) {
        /*
        add new package day16_switch_ternary
        add new class Elevator

declare variable floorNum = 1
        Multi branch if:
        when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"

        when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"

        when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"

        anything else: print "Invalid floor - 6"*/

        int floorNum = 1;
        floorNum = 7;
        if (floorNum==1){
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
        } else if (floorNum==2){
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        }else if (floorNum==3){
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
        } else {
            System.out.println("Invalid floor "+floorNum);
        }
        /* SWITCH STATEMENT
        switch (VARIABLE _ NAME){
        case 1:    === if(floornuM==1)
        //code to run--System.out.print
        break;

         */

        System.out.println("#######SWITCH STATEMENT############# ");
        floorNum=1;
        floorNum=3;
        floorNum=10;
        switch( floorNum) {
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break;
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                break;
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
                break;
            default:
                System.out.println("Invalid floor "+floorNum);
                break;
        }

        String browser= "chrome";
        switch(browser) {
            case "chrome":
                System.out.println("Open chrome browser");
                break;
            case "firefox":
                System.out.println("Open chrome browser");
                break;
            case "safari":
                System.out.println("Open chrome browser");
                break;
            case "ie":
                System.out.println("Open chrome browser");
                break;
            case "edge":
                System.out.println("Open chrome browser");
                break;
        }
    }
}
