package day32Arrays_Split;
import java.util.Arrays;

public class ArrayMaxMin {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
        // find and print details the most expensive- ipad
        //find and print details if the least expensive- gloves

        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));

        System.out.println("---- find the most expensive item and price -----");
       double maxPrice= prices[0];
       int indexOfMaxPrice = 0;

        for(int i= 0; i < prices.length; i++){
            if( prices[i] >maxPrice){
                maxPrice = prices[i];
                indexOfMaxPrice = i;
            }
        }

        System.out.println("maxPrice " + maxPrice);
        System.out.println("indexOfMaxPrice " +indexOfMaxPrice);
        System.out.println(items[indexOfMaxPrice]+ " $ "+ prices[indexOfMaxPrice]+ "- #" + itemIDs[indexOfMaxPrice]);


        System.out.println("--- find the loweste price, item ------");

        double minPrice= prices[0];
        int indexOfMinPrice = 0;

        for(int i= 0; i < prices.length; i++){
            if( prices[i] < minPrice){
                minPrice = prices[i];
                indexOfMinPrice = i;
            }
        }

        System.out.println("minPrice " + minPrice);
        System.out.println("indexOfMinPrice " +indexOfMinPrice);
        System.out.println(items[indexOfMinPrice]+ " $ "+ prices[indexOfMinPrice]+ "- #" + itemIDs[indexOfMinPrice]);
        /*double max = 0;
        for (int i = 0; i < items.length; i++){
            if (prices[i]>max){
                max = prices[i];
            }
        }
        System.out.println(max);

        OR YOU CAN

        PSEUDOCODE:
    Declare:
        double maxPrice = price of first item
        int indexOfMaxPrice = index of first item - 0

    LOOP STARTS FOR prices Array:
        read price[i] from array
            if price[i] is more than maxPrice
                change maxPrice to price[i]
                set indexOfMaxPrice to i

    END FOR LOOP

    PRINT items[indexOfMaxPrice] + prices[indexOfMaxPrice] + itemIDs[indexOfMaxPrice]

        */
    }
}
