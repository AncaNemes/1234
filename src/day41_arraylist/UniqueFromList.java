package day41_arraylist;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFromList {
    public static void main(String[] args) {
        //declare Integer arraylist with followint numbers
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,4,4,1,5,6,0,5));
        System.out.println(nums);
        List<Integer> uniqueList = getUniqueIntegers(nums);
        System.out.println("\n uniqueList" +uniqueList);
    }


    public static List<Integer> getUniqueIntegers(List<Integer> nums) {
        //new array list to store only unique numbers
        List<Integer> uniqueList= new ArrayList<>();
        for(int num: nums){
            if(Collections.frequency(nums, num)==1){
        System.out.print(num + " ");
        uniqueList.add(num);
            }
    }
        return uniqueList;
    }
}
