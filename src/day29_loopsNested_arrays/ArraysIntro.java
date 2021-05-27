package day29_loopsNested_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int [] nums= new int[3];
        nums [0] = 5;
        nums [1] = 10;
        nums [2] = 7;
    //    nums [3] = 100; - JAVA arrays are FIXED SIZE- means one you declare an array with certain zice, we can not change the size or length
       // If you need resizable array JAVA provides array list as an option/which size can be modified
        System.out.println("value at Index O = " + nums[0]);
        System.out.println("value at Index 1 =" + nums[1]);
        System.out.println("value at Index 2 =" + nums[2]);
       // System.out.println("value at Index 3 " + nums[3]);

        int i=0;
        System.out.println(nums[i]);//5
        i++;
        System.out.println(nums[i]); // if you add i++ print out 10

        //how to find out the size of an array
        System.out.println("number of elements "+ nums.length);// prints out 3 elements ? not sure from where?

        int len = nums.length;
        System.out.println("len= " + len);
        nums[0] = 100;
        nums[1] = 300;
        nums[2] = nums[1];
        System.out.println("nums 0 "+ nums[0]);
        System.out.println("nums1 "+ nums[1]);
        System.out.println("nums 2 " + nums[2]);

    }
}
