package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUtil {
    public static void main(String[] args) {

        List<Character> letters = new ArrayList<>();
                letters.addAll(Arrays.asList('j','a','v','a','i','s','f','u','n'));
                 System.out.println("size = " + letters.size());
                 System.out.println(letters);

                 Collections.reverse(letters);

                 System.out.println("reversed = " +letters);


                System.out.println("frequency/how many times = "+Collections.frequency(letters,'a'));
                int vCount=Collections.frequency(letters, 'v');
        System.out.println("cvount= " + vCount);

        System.out.println("Max Char = " + Collections.max(letters));
        System.out.println("Max Char = " + Collections.min(letters));
       Collections.replaceAll(letters,'a','u');
        Collections.replaceAll(letters,'i','j');
        System.out.println("after replaceAll"+ letters);
        Collections.reverse(letters);
        System.out.println(letters);

        Collections.sort(letters);
        System.out.println("after sort = "+letters);
        
        List<Integer> nums = Arrays.asList(23,1,43,234,7,-9,10,5,5,5,5,5);
        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("nums = " + nums);

        int max= Collections.max(nums) ;
        int min = Collections.min(nums);
        System.out.println("max = " +max);
        System.out.println("min = " + min);

      int countOffFive =  Collections.frequency(nums,5);
        System.out.println("countOffFive = " + countOffFive);

        int countOfOne = Collections.frequency(nums,1);
        System.out.println("countOfOne = " + countOfOne);

        Collections.replaceAll(nums,5, 50);
        System.out.println("countOfFiveReplace = " + nums);

        Collections.sort(nums,Collections.reverseOrder());
        System.out.println(" after reverse sort = " + nums);
        Collections.shuffle(nums);
        System.out.println("after shuffle" + nums);







    }
}
