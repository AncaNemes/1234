package javaInterviewExamples;

import java.util.Arrays;

public class String_SameLetters {

    public static void main(String[] args) {
        String str1="abc";
        String str2="cba";

         System.out.println(same(str1,str2));

    }

//    String -- Same letters
//    Write a return method that check if a string is build out of the same letters as another string.
//
//    Ex:  same("abc",  "cab"); -> true
//
//    same("abc",  "abb"); -> false:

    //
//
//        }
    public static boolean same(String a, String b) {

        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();



        Arrays.sort(ch1);
        Arrays.sort(ch2);

//        String a1 = "";
//        String a2 = "";

        System.out.println(ch1);
        System.out.println(ch2);

        String [] b1={"a", "b", "c"};
        String [] b2={"a","b","c"};

        System.out.println(b1);
        System.out.println(b2);

     //   return ch1 == ch2;

        return (Arrays.toString(ch1).equals(Arrays.toString(ch2)));


        //ch1.equals(ch2));wrong

//        for( char each: ch1){
//            a1+=each;
//
//        }
//        for(char each:ch2){
//            a2+=each;
//        }
//        return a1.equals(a2);
//    }
    }
}

