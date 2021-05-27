package day19_class_vs_object_strings;

public class startsEndsWithString {
    public static void main(String[] args) {
        String country = "selenium";
        System.out.println(country.startsWith("s"));// true
        System.out.println(country.startsWith("sele")); //true
        System.out.println(country.startsWith("um"));//false

        String countrY = "selenium";
        System.out.println(countrY.endsWith("m"));// true
        System.out.println(countrY.endsWith("ium")); //true
        System.out.println(countrY.endsWith("w"));//false

        String worD = "intellij idea";
        System.out.println(worD.startsWith("i"));
        System.out.println(worD.startsWith("in"));
        System.out.println(worD.startsWith("intellij"));
        System.out.println(worD.startsWith("intellij idea")); //true
        System.out.println(worD.startsWith("j"));

        System.out.println("java".startsWith("Int")); //false

        System.out.println(worD.endsWith("idea"));
        System.out.println(worD.endsWith("a"));

        String name = "Amca";
        if (name.endsWith("a")) {
            System.out.println("Maybe, it is a female name");
        }
        /*
        Mr.-Man
        Dr.-Doctor
        Ms-women
        sr-senior
         */

        String firstName = "Dr.Nadir";

        if (firstName.startsWith("Mr")) {
            System.out.println("Man");
        } else if (firstName.startsWith("Dr")) {
            System.out.println("Doctor");
        } else if (firstName.startsWith("Ms")) {
            System.out.println("Women");
        } else if (firstName.startsWith("Sr")) {
            System.out.println("Senior");
        } else {
            System.out.println("normal name");
        }

        //string url = "https://strackoverflow.com"
        //.com-"comercial website"
        //.ru-"Russian website"
        //.gov-""goverment website
        //  edu="educational website"
        //  org""organizational website

        String url = "https://strackoverflow.com";
        if (url.endsWith(".com")) {
            System.out.println("comercial website");
        } else if (url.endsWith(".ru")) {
            System.out.println("russian Website");
        } else if (url.endsWith(".gov")) {
            System.out.println("government website");
        } else if (url.endsWith(".edu")) {
            System.out.println("educational website");
        } else {
            System.out.println("try again ");
        }
    }
}