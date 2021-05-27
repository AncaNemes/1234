package day37_Overloding;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("hi",3, '|'));
        System.out.println(repeatString("I can do it!",10, '-'));
    }

    public static String repeatString(String word, int times, char delimiter) {


        String returnValue = "";
        for (int i = 1; i <= 3; i++) {
            returnValue += word + delimiter;
        }
        return returnValue;
        }
    }
