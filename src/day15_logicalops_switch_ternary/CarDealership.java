package day15_logicalops_switch_ternary;

public class CarDealership {
    public static void main(String[] args) {
        /*budget = 5000;
        model-> "toyota", "Honda", "Tesla"
        add new java class UsedCarSelector
add main method

Car dealership:

budget = 5000
model -> "Toyota" , "Honda" ,"Tesla"
carPrice = 4500
using If condition with logical operators, decide if you would like
to purchase the car.

1 - needs to be within budget
    AND
2 - needs to be "Toyota" OR "Honda" OR "Tesla" */


        double budget = 5000.00;
        String model = "Audi";
        double carPrice = 4999.0;

        if( carPrice <= budget || model.equals("Toyota")||model.equals("Honda")||model.equals("Tesla"))
        { System.out.println("CONGRATULATION ***You qualify to buy the car " + model + carPrice);
        }

        if( carPrice <= budget || model.equals("Toyota")||model.equals("Honda")||model.equals("Tesla"))
        { System.out.println("CONGRATULATION ***You qualify to buy the car " + model + carPrice);
        }


        if( carPrice <= budget && model.equals("Toyota")||model.equals("Honda")||model.equals("Tesla"))
        { System.out.println("CONGRATULATION ***You qualify to buy the car " + model + carPrice);
        } else{
            System.out.println("Buy a Lada");
        }

        carPrice = 999.9;
        if( carPrice <= budget || model.equals("Toyota")||model.equals("Honda")||model.equals("Tesla")) {
            System.out.println("CONGRATULATION ***You qualify to buy the car " + model + carPrice);
        }
    }
}
