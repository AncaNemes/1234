package day21_String_Manipulation;

public class First_And_Last {
    public static void main(String[] args) {


    String word = "MOM";

    char first = word.charAt(0);

    char last = word.charAt(2);

    if(word.charAt(0)==word.charAt(2)){
        System.out.println("first and last letters match");
    } else {
        System.out.println("first and last letters mismatch");
    }



        String friend = "aziza";
        char firstLetter = friend.charAt(0);
        int count= friend.length();
        char lastLetter=friend.charAt(count=1);

        //char lastLetter = friend.charAt( friend.length()-1 ); //count how many letter are in/length;
    if ( firstLetter == lastLetter) {
        System.out.println( friend + " - first and last match");
    }else {
        System.out.println( friend+ "- first and last match");
    }
    String wordD = "java";
        System.out.println(wordD.indexOf("j")); //OUTPUT:0- INDEX IT WILL return ONLY THE FIRST OCCURANCE IF THERE ARE MULTIPLE
        //IF NOT FOUDN IT WILL RETURN -1

}
}