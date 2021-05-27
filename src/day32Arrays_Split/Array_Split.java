package day32Arrays_Split;

import java.util.Arrays;

public class Array_Split {
    public static void main(String[] args) {
     //   String word =" java; python; ruby";
        // we can use split method and specifu ";" as delimiter to split into array
       // word.split(";") --> result will be String [] with 3 values { "java", "python", "ruby"}

        // String words2 = " java is fun";
        // word2.split(""); -->String [] {"java", "is", "fun"}
        //String word3="bengal cat tabby cat persina cat not cat here";
        //word3.split("cat"); --> String []{}
                      // 0     1       2      3
        String words = "java:python:selenium:html";

       String [] wordsArray =  words.split(":");
        System.out.println(Arrays.toString(wordsArray));

        System.out.println("length of array = " + wordsArray.length);
        for(String each: wordsArray){
            System.out.println(each);
        }
        System.out.println("^^^^^^^^new practice^^^^^^^^^^");

        String sentence = "today I am coding java arrays";
       String [] sentenceArray = sentence.split(" ");

        System.out.println("first word " + sentenceArray[0]);
        System.out.println("first word "+sentence.split(" ")[0]);
        System.out.println("number of words in sentence="+ sentenceArray.length);
        System.out.println( Arrays.toString(sentenceArray));
        System.out.println("length of array =" + sentenceArray.length);

        for(String each: sentenceArray){
            System.out.println(each);
        }
    }
}
