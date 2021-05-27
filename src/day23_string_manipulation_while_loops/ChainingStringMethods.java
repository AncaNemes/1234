package day23_string_manipulation_while_loops;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ChainingStringMethods {
    public static void main(String[] args) {


        //  Chaning method
        String word = "woo den spo on";
        System.out.println(word);
        System.out.println(word.toUpperCase().toLowerCase().length());

     //   remove space and then print everything uppercase

        System.out.println(word.replace(" ","").toUpperCase());

        String city = "ISTAMBUL";
                           //read 1st letter make upper case + read 2nd letter .make lower case
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase());
         String capitalized = city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase();
        System.out.println("capitalized = "+ capitalized);

    }
}