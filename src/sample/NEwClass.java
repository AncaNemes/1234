package sample;
import java.util.*;

public class NEwClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO: write your code below

        int result=0;
        for(int i:nums){
            result^=i;
        }
        System.out.println(result);
        }
    }