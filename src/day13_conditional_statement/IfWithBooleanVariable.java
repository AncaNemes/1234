package day13_conditional_statement;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry= true;

        if (isHungry== true){
            System.out.println("I am hungry I will go get something to eat.");
            System.out.println("Then code Java "); } else {System.out.println("I am not hungry lets keep coding java");}



        double price = 130.44;
        boolean isAffordable = 200 >=price;

        if (isAffordable){ System.out.println("You can buy it");}else
        {
            System.out.println("You can not afford it");
        }

        boolean isRemoteJob = true;
        //requirment if it is not remote job print"Sorry I am not interested"

        if (isRemoteJob != true){
            System.out.println("Sorry I am not interested");}
        else {System.out.println("Sure I am interested, what is the interview process");

        }
    }
}
