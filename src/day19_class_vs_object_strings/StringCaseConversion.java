package day19_class_vs_object_strings;

import java.sql.SQLOutput;
import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {

        String word= "CyberTek";
        String wordSentence =" Java IS Fun!";

        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
     // another example on how can be put   System.out.println("JAVA".toLowerCase());
        System.out.println(wordSentence.toLowerCase());

        word.toLowerCase();
        System.out.println(word);
        System.out.println(word.toLowerCase());

        String wardInLcase = word.toLowerCase();
        System.out.println( "wordInLCase = " + wardInLcase);


        word = word.toLowerCase();
        System.out.println("word = " + word);

        String company = "Kona";
        System.out.println(company.toUpperCase());
        System.out.println("company in upper case " + company.toUpperCase() );
        System.out.println("java".toUpperCase());
        System.out.println("company = " + company);
        company =  company.toUpperCase();
        System.out.println("company = " + company);
    }
}
