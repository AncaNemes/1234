package day22_string_manipulation;

import com.sun.org.apache.xpath.internal.functions.FuncSubstring;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium,testng, maven, cucumber";
        System.out.println(technologies.indexOf(","));//4 first comma
        System.out.println(technologies.lastIndexOf(",")); //39

        int indexOfJava= technologies.indexOf("java");
        System.out.println("java is at index "+ indexOfJava);

        int idxOfCss=technologies.indexOf("css" );
        System.out.println("css is at index = " + idxOfCss);

        int idxOfCucumber=technologies.indexOf("cucumber");
        System.out.println("Cucumber is at index = " + idxOfCucumber);

        int idxOfSQL=technologies.indexOf("sql");
        System.out.println("SQL is at index = " + idxOfSQL);

        //technologies contains maven?
        if (technologies.contains("maven")){
            System.out.println("maven is present");
        }else  {
            System.out.println("maven is not present");
        }

        if(technologies.indexOf("maven") >-1){
            System.out.println("maven is present ");
        }else {
            System.out.println("maven is not present");
        }


    }
}
