package day20_string_manipulation;

public class ReplaceMethod {
    public static void main(String[] args) {
        //it searches in the string and replaces with another string
        String word= "java";
        word.replace("a","u");
        System.out.println(word.replace("a","u"));

        String sentence = "java strings are fun";
        System.out.println(sentence);
        System.out.println(sentence.replace("a","u"));
        System.out.println(sentence.replace("string","condition"));// replaces the word string with conditions
        System.out.println(sentence.replace("java ", ""));// take java out
    }
}
