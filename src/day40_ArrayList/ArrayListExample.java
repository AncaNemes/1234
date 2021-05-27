package day40_ArrayList;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        
        nums.add(5);
        nums.add(7);
        nums.add(11);
        System.out.println("nums.size() = " + nums.size());

        //reading from arraylist
        System.out.println("index of  0 " + nums.get(0));
        System.out.println("index of 1  " + nums.get(1));
        System.out.println(" index of 2  " + nums.get(2));
       // System.out.println(" index of 3" + nums.get(3)); INDEX OUT OF BOUNDS EXCEPTION
// print all the values in one line
        System.out.println(nums);

        nums.remove(1);//remove element at index 1
        System.out.println(nums);
    }
}
