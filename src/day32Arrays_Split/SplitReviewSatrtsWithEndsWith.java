package day32Arrays_Split;

import java.util.Arrays;
import java.util.zip.ZipEntry;

public class SplitReviewSatrtsWithEndsWith {
    public static void main(String[] args) {

        String word ="ajavajav";
        String [] array= word.split("a");
         int countOfA=array.length-1;
         if(word.endsWith("a")){ //if ends with"a", add one more
             countOfA++;
         }
        System.out.println("countOfA: " + countOfA);

      //  strArr ==>{"j","v", ""}
        System.out.println("_________split with EMPTY NEW PRACTICE ________");

        String worrd="java";
        String [] strAr=worrd.split("");
        System.out.println(strAr[0]);
        System.out.println(strAr[1]);
        System.out.println(strAr[2]);
        System.out.println(strAr[3]);
           // \d- any number
            // [A-Z]- any character from A to Z;
String word2="java1sql2html";
String[] strArr2=word2.split("\\d");
System.out.println(Arrays.toString(strArr2));

word2=word2.replaceAll("\\d","_");
        System.out.println("word2= "+word2);

        System.out.println("_________________new practice_____________");
        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }

    }
}
