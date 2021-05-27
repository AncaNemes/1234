package day26Loops;

public class PrintChars {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.length());
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        //System.out.println(word.charAt(4));

     /*   String word1 = "today is java class and we are codubg for loops";
        for (int i = 0; i < word1.length(); i++) {
            System.out.print(i + "-" + word1.length());
            System.out.print(word1.charAt(i));*/
      //  }
        /*for (int i= word1.length()-1; i>0;i--){
            System.out.print(i + "-"word1.length());
            System.out.print(word1.charAt(i));*/


        String word2 = "raja";

        for (int i = word2.length()-1; i >= 0; i--) ;
        {
            System.out.print(word2.charAt(2));
        }}}