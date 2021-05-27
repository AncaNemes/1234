package day43_list_custom_classes;
import java.util.*;

public class MethodsWithListReturn {
    public static void main(String[] args) {
//1 second= 1_000_000_000 nanoseconds
        long start= System.nanoTime();
        //System.out.println(System.nanoTime());
        List<Integer> nimNums = getlistA();// returns ready ArrayList object, no need for new Array
        long end = System.nanoTime();
        double listSeconds= (end-start);
        System.out.println("ArrayList time =" + (end-start));
        System.out.println("ArrayList seconds = " + listSeconds);
        getlistA();

        long st= System.nanoTime();
        int [] arr= getIntegerarray();
        long en=System.nanoTime();
        double seconds=(en-st);
        System.out.println("Array time= "+ (en-st));
        System.out.println("Array time seconds = " +seconds);

      // int [] arr = getIntegerarray();

       // System.out.println("nimNums = " + nimNums);



        /**getIntegerList
         * return List <Integer>
         *     Loop from 0 to 1 000 000
         *     and add to arraylist
         *
         */
    }

    public static List<Integer> getlistA(){
    List<Integer> nums = new ArrayList<>();
              for(int i=0; i<=1000_000; i++){
             nums.add(i);
              }
              return nums;
}

/**
 * getInteget List
 * Loop from 0- 1000000
 * and add to int [] then return it
 */
public static int [] getIntegerarray(){
    //declare empty array with
    int [] nums = new int [10000001];
    for(int i = 0; i<= 1000000; i++){
        nums[i]=i;
    }
    return nums;
}
}