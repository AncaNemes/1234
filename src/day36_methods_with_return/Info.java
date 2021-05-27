package day36_methods_with_return;
import java.util.*;

public class Info {
    public static void main(String[] args) {

        System.out.println( "full name =" + fullName());
        System.out.println("is Marrid = " + isMarried());
        System.out.println(  "Age = " + getAge());
        System.out.println("Random = "+ getRandomYear());


        String name= fullName();
        Boolean married= isMarried();
        int age= getAge();
        int year = getRandomYear();
        System.out.println("name = " +name);
        System.out.println("married = "+ married);
        System.out.println("age = " + age);
        System.out.println("year = "+ year );
        if(isMarried()){

        }else{}

    }
    public static String fullName(){
      return ("Mike Smith");
    }
    public static Boolean isMarried(){
        return (true);
    }
    public static int getAge(){
      // int age=38;
        //return age;
        return (38);
    }
    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;

    }
}
