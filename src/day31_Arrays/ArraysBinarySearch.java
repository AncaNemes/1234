package day31_Arrays;

import java.util.Arrays;

public class ArraysBinarySearch {
    public static void main(String[] args) {
       // Arrays.binarySearch(item, ArrayName);

        int [] nums = {33,55,123,400, 658, 1432};

        System.out.println(Arrays.binarySearch(nums,33));
        System.out.println(Arrays.binarySearch(nums,400));
        System.out.println(Arrays.binarySearch(nums,122));

        if(Arrays.binarySearch(nums, 12345) >= 0) {
            System.out.println("12345 found");
        }else{
            System.out.println("12345 not found");
        }

        // the umber is not a part of the int and gives NEGATIVE NUMBER
     /*  Arryas.binarySearh(55,nums); ==>1- indexOf

     *
     */
    }
}
