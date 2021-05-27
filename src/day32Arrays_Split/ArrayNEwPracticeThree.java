package day32Arrays_Split;

import java.util.Arrays;

public class ArrayNEwPracticeThree {
    public static void main(String[] args) {
        String word= "hello$world";

        String [] strArr= word.split("o");
       // strArr > hell $w rld""

       // String [] strArr= word.split("$");
        //strArr > hello world
       /* String word ="java program";
        strArr==>{};
        strArr==>{"j","v", " progr", "m"}
        how many "a" in the word
        strArr.length-1 will give us numbers of a letters
        The above is good when word does not start or end with a.

        String word ="java program";
        Str [] strArr= word.split("a")
        the above is good when word does not start or end with a

        String word ="java";
        String [] strArr= word.split("a");
        strArr ==>{"j","v", ""}
        */
    }
}
