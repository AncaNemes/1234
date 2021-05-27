package day28_looPS;

public class findCharacter {
    public static void main(String[] args) {
        /*Find unique characters in string
        String word ="java";
        1.jav. each character only 1. occurance
        2.jv only the characters that are uniwue/non duplicate in the string
       "helloworld" ->helowrd
         */

        String word="javva";
        String unique = "";

        for(int i = 0; i < word.length(); i++) {
        //if.word.charAt(i) is not contains in unique
        //add to unique
        if(!unique.contains(word.charAt(i)+""));{
            unique +=word.charAt(i);
            }
        }
        System.out.println("unique");
    }
}
