package day35_methods_with_param;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Counters {
    public static void main(String[] args) {
        count(5);
        count(20);
         int num2=999;
        count(num2);

        String word = "wooden spoon";
        count(word.length());
        System.out.println("new assignment");
        printAge(1983);
        printAge(1988);

    }
    public static void count(int num){
       for(int i=0; i<=num; i++){
           System.out.print(i+" ");
       }
        System.out.println();
    }

    public static void printAge(int year){
        int age = 2021 - year;
        System.out.println("Birth year " + year + ",Age "+age);
    }

}
