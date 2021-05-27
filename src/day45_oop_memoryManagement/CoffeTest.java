package day45_oop_memoryManagement;

public class CoffeTest {
    public static void main(String[] args) {
        //incapsulation

        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = " +myCoffee.amount);
        myCoffee.refill();
        System.out.println("amount after refill " + myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("amount after drink 10 = " + myCoffee.getAmount());
        //NOT myCoffee.type = "turkish coffee"; INSTEAD using a method:
        myCoffee.setType("turkish coffee");

        System.out.println("My Coffee = " + myCoffee.getType());
        // descrivbe my coffee
        System.out.println(myCoffee.toString());

        //add another coffee OBJECT, SET VALUES, CALL METHODS
        Coffee coffee1= new Coffee();
        coffee1.setType("capuccino");
        System.out.println("coffee 1 type = " +coffee1.getType());
        //assign coffee1 object to coffee2
        //HEY JAVA, point coffee2 to same object as coffee1
        Coffee coffee2= coffee1;

        System.out.println("coffee2 type = " +coffee2.getType());
        coffee2.setType("Espresso");

        Coffee coffee3= new Coffee();
        coffee3.setType("frapuccino");

        coffee3=coffee2;
        System.out.println();

        Coffee coffee4= null;
        coffee4.setType("turkish");





        //ADD ANOTHER COFFEE OBJECT , SET VALUES, CALL METHODS

    }
}
