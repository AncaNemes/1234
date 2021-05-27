package day32Arrays_Split;
import java.lang.*;

public class PracticeArray {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};


        System.out.println("-----FIND THE INDEXOF 'GLOVES' IN THE ITEMS ARRAY--------");
        //USE THE LOOP WITH CONDITION

       for(int i=0; i < items.length; i++) {
           if(items[i].equals("Gloves")) {
               System.out.println("Gloves found at index " + i);
               break;
           }
       }
          // System.out.println(i + " - " + items[i]);

        System.out.println("---set boolean to true if first 'iPad'is found------");
       /*for (int n=0; n<items.length;n++){
           if(items[n].equals("iPad")){
               iPadExists = true;
               break;
           }
       }
        System.out.println("ipPad exists = " +  iPadExists);*/

        boolean iPadExists = false;
       for(String item:items){
           iPadExists = true;
        break;
        }
        System.out.println("iPadExists= " + iPadExists);

       for(int k=0 ; k < items.length ; k++){
           System.out.println(items[k]+" -$ " + prices[k] + " ID# " + itemIDs[k]);

       }
        System.out.println();
        System.out.println("-- Look for new jacket -----");
        for(int p=0; p<items.length; p++){
            if(items[p].equals("Jacket") ){
                System.out.println(items[p]+" $ "+prices[p] + " id " + itemIDs[p]);



            }
        }
    }
       }

/*
String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
 */