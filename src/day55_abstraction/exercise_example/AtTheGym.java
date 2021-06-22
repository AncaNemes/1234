package day55_abstraction.exercise_example;

public class AtTheGym {
    public static void main(String[] args) {
        Exercise exercise = new Running(); //   =  new Exercise -->it is RED cannot create object/instantiate abstract class, this will not work  anonymous class java
        //                = new FreeWeight() it works it is called polymorphism

         Running running= new Running();
         Swimming swimming= new Swimming();
         FreeWeight freeWeight= new FreeWeight();
        System.out.println("***************************");
         exercise.start();
         exercise.perform();
        System.out.println("Exercise 30 min-calories=  "+exercise.getCaloriesCount(30));
        System.out.println("*****************************");
        swimming.start();
        swimming.perform();
        System.out.println("swimming 30 min-calories=  "+ swimming.getCaloriesCount(30));

       running.start();
       running.perform();
        System.out.println("Running 30 min-calories=  "+ running.getCaloriesCount(30));

        freeWeight.start();
        freeWeight.perform();
        System.out.println("FreeWeight 30 min-calories=  "+freeWeight.getCaloriesCount(30));

    }
}
