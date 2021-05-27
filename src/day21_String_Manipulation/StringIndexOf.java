package day21_String_Manipulation;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringIndexOf {
    public static void main(String[] args) {
        String country = "Romania";
        System.out.println(country.indexOf("R")); //output 0
        System.out.println(country.indexOf("a")); //output 3
        System.out.println(country.indexOf("nia"));//output4
        System.out.println(country.indexOf("r")); //output -1 INCORRECT
        System.out.println(country.indexOf("git")); // it can not find output -1
    }
}
