package day31_Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArrayUtilityClassSorting {
    public static void main(String[] args) {
     // sort Array method- it will sort the array from small to large, ascending

        int []  nums = {100, 5,7,1,0,-4,44,33};

        System.out.println("nums decending " +Arrays.toString(nums)+" ");

        Arrays.sort(nums);
        System.out.println("nums decending " +Arrays.toString(nums)+" ");

        System.out.println("min value:" + nums[0]);
        System.out.println(("max value:" +nums[nums.length-1]));

       // Arrays.sort(nums, Collections.reverseOrder()); if you want it reverse and need to change String with INT

        //arrays.toString(arrayname):
        //it will help us print array values using the loop
        int [] num ={5,1,7,0};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(num));



    String [] words={"java", "python","c++", "ruby"};

        System.out.println(Arrays.toString(words));
    Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));


    }
}
