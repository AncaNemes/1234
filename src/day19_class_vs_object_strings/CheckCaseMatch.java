package day19_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[] args) {

        String countryCode = "usa";

        if (countryCode.equals(countryCode.toUpperCase() )) {
            System.out.println("pass code is correct " );
        } else{
            System.out.println("Fail- code is incorrect");
        }

        String word = "Java";
        String uWord = word.toUpperCase();

        System.out.println(word);
        System.out.println(uWord);

        if(word.equals(uWord)){
            System.out.println("case match");
        }else{
            System.out.println("case mismatch");
        }
    }
}