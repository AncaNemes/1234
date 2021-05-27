package day22_string_manipulation;


import java.lang.*;
public class StringSubstring {
    public static void main(String[] args) {
        //FuncSubstring() START,END OR START
        String wordONE= "hello";
        wordONE.substring(0, 2); // he
        wordONE.substring(1, 4); //ell
        wordONE.substring(4); //0
        wordONE.substring(1); //StringIndexOutOfBoundsException (-2) gives error
        wordONE.substring(2);//10 gives error

        //word.substring(startIndex, end Index)

        String word= "java is fun";
        System.out.println(word.substring(0, 4)); // start index included -> the end index->4 NOT INCLUDED IN COUNTING
        System.out.println(word.substring(0, 7));

        System.out.println(word.substring(5, 7));
    }
}
