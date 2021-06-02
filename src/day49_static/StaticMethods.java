package day49_static;

public class StaticMethods {

   int num=10;
   static int count= 5;

    public static void displayMessage(String message){


        System.out.println("message" +message);

      //  System.out.println("num " +num); num is not static
        System.out.println("count = " +  count);// one static can use another static variable





    }

    public static void anotherStaticMethod(){
        System.out.println("another static method" );
        displayMessage("wooden spoon");

    }
    //StaticMethod.instanceMethod(); > no
    //StaticMethod stm =new StaticMethod();
    //stm.instanceMethod();

    public void instanceMethod(){
        System.out.println("instanceMethod");
        System.out.println("num= " +num);
        System.out.println("count= " +count);
        System.out.println();
        displayMessage("woodenspoon");
        System.out.println("new");
    }
}

