package day22_string_manipulation;
import java.lang.*; // added by default automatically

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String word = "noon";  //java  anna
        System.out.print(word.charAt(3));
        System.out.print(word.charAt(2));
        System.out.print(word.charAt(1));
        System.out.println(word.charAt(0));

        System.out.println(word);

        //or you can do

        System.out.println(""+word.charAt(3)
                + word.charAt(2)
                + word.charAt(1)
                + word.charAt(0));

        String word3 = ""+ word.charAt(3)
                + word.charAt(2)
                + word.charAt(1)
                + word.charAt(0);
        System.out.println("word = " + word);
        System.out.println("word 2= "+ word3);

  if (word.equalsIgnoreCase(word3)){
            System.out.println("palindrome word");
  }else {
      System.out.println("not polidrome word");
  }

    }
}
