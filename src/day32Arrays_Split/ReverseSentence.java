package day32Arrays_Split;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        // java is fun ---> fun is java   OR  WOODEN SPPON SEARCH--> SEARCH SPPON WOODEN
        String sentence = "java is fun";
        String [] words= sentence.split(" ");
        String reversed = "";
        //print words array in reverse order
        for( int i= words.length-1; i>=0;i--) {
           // System.out.print(words[i]+" ");
            reversed +=words[i]+" ";
        }
        System.out.println("sentence= "+sentence);
        System.out.println("reversed= " + reversed.trim());

        int [] nums = {5,10,4,100};
        int [] numRevers=  new int[nums.length];//  int [] numRevers = {0,0,0,0};- by default all value is 0 and

        for (int i =nums.length-1, j=0 ; i>=0; i --, j++) {

            System.out.println(nums[i] + "");
            numRevers[j]= nums[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(numRevers));
    }
}
