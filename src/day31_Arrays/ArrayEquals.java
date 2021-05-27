package day31_Arrays;

import java.util.Arrays;

public class ArrayEquals {
    public static void main(String[] args) {
        //accepts two arrayse of same type and returns true if elements same size
        //if elements are same size/length and same data in sameorder

        int[] numse1 = {4,12,53};
        int [] numse2= {4,12,53};
        Arrays.equals(numse1,numse2);
        System.out.println(Arrays.equals(numse1,numse2)); // it is true


        //exp two
        int[] num1 = {4,12,53};
        int [] num2= {4,12,53,2};
        Arrays.equals(num1,num2);
        System.out.println(Arrays.equals(num1,num2)); // it is FALSE

        int[] nums1 = {4, 5, 2, 10};
        int[] nums2 = {4, 5, 2, 10};
        int[] nums3 = {10, 4, 5, 2};
        int[] nums4 = {4, 5, 2, 10, 90};
        int[] nums5 = {54, 23, 54, 123, 54};
        String[] cars1 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars2 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars3 = {"toyota","honda", "tesla","bmw", "dodge"};
        String[] cars4 = {"Toyota","Honda", "Tesla"};

        System.out.println("nums1 == nums2 "+Arrays.equals(nums1,nums2));
        System.out.println(nums1==nums2);// does not check if the numbers are equal


    if(Arrays.equals(nums1,nums2)){
        System.out.println("num1 and 2match");
    }else{
        System.out.println("num1 and 2 missmatch");}


        if(Arrays.equals(nums2,nums3)){
            System.out.println("num2 and 3 match");
        }else{
            System.out.println("num2 and 3 missmatch");}


    }
    }