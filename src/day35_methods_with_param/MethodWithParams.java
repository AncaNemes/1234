package day35_methods_with_param;

import com.sun.tools.javac.code.Attribute;

public class MethodWithParams {
    public static void main(String[] args) {
        displayValue(5);
        displayValue(1234);
        displayValue(32198);
        int counting=1;
        displayValue(counting);
        System.out.println("print string");
        greatByName("Anca");
        String name= "Suleyman";
        greatByName(name);

    }
    public static void displayValue(int num){
        System.out.println("value is "+ num);
    }
    public static void greatByName(String name){
        System.out.println("Hello "+ name +" how are you today?");
    }
}
