package day40_ArrayList;
import java.util.*;

public class ArrayListMethod {
    public static void main(String[] args) {
List <String> shoppingList= new ArrayList<>();
        System.out.println("shoppingList = " + shoppingList);
        System.out.println("is empty?" +shoppingList);

        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep trying");
        }else{
            System.out.println("List is not empty, go to mall");
        }

        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("book");
        shoppingList.add("cheap shoes");
        shoppingList.add("sppoon");

        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep trying");
        }else{
            System.out.println("List is not empty, go to mall"+ shoppingList);
        }

        int count= shoppingList.size();
        System.out.println("Items to buy = " +count);
        System.out.println("is shoes in my list? " + shoppingList.contains("shoes"));


        if(shoppingList.contains("shoes")){
            System.out.println(" you can buy the shoes");
        }else{
            System.out.println("keep the money and invest them");
        }
        System.out.println("buying shoes..80$");
        shoppingList.remove("shoes");

        System.out.println(shoppingList);
         shoppingList.clear();

        System.out.println(shoppingList);
    }
}
