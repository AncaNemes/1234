package day20_string_manipulation;

import java.lang.*;

import java.util.Scanner;

public class StringCreationMethods {
    public static void main(String[] args) {
        String word1 = "imac";
        String word2 = new String("macbook");
        String word3 = "";
        String word4 = new String(); //  it is empty
        "java".length();// it is another way to write String

        System.out.println("word");// "word".sout-> will print System.out.println("word")
        System.out.println(word2);

        Scanner scan = new Scanner(System.in);

        String car ="lexus";
        System.out.println(car.isEmpty());

        String city="";

        System.out.println(city.isEmpty());// true
        System.out.println(city.length()); //0
        System.out.println(city.equals("")); //true
        System.out.println(city.equalsIgnoreCase(""));


    }
}
