package day40_ArrayList;


import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();//polimorfic way
        System.out.println(nums);

nums.add(34);nums.add(54);nums.add(0);nums.add(74);nums.add(340);nums.add(134);nums.add(88);nums.add(3476);
        nums.add(1134);nums.add(34543);
        System.out.println("nums = " + nums);

        nums.remove(0);// remove the index of 0 which was 34
        System.out.println("nums = " + nums);

    //nums.remove(88);// does not work, we can not just take the number out  index out of bound exception you have to use wrapper glass we NEED TO BOX IT
        nums.remove(new Integer(88));
        System.out.println("nums = " + nums);


        // for loop to itrate through all values and print
        for( int i=0; i< nums.size(); i++){
            System.out.println(nums.get(i));
        }

        //for EACH LOOP

        for(int  each : nums){
        System.out.print (each + " ");
        }
    }
}
