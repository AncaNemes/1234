package day21_String_Manipulation;

public class String_charAt {
    public static void main(String[] args) {
        String word="java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
     //   System.out.println(word.charAt(4));//error
        System.out.println("word"+ word.length());//4

        String company = "Cybertek";
        System.out.println("first letter:" +company.charAt(0));// if you change with nb 1 it will print "y which is 2nd letter"

        char first = company.charAt(0);
        char second = company.charAt(1);
        char third = company.charAt(2);
        char forth= company.charAt(3);
        char  fifth= company.charAt(4);
        char sixth = company.charAt(5);
        char seventh = company.charAt(6);
        char eigth = company.charAt(7);
        System.out.println(first +" "+
                second +" " +
                third + " " +
                forth + " " +
                fifth + " " +
                sixth + " " +
                seventh + " " +
                eigth);

        String withSpace = first +" "+
                second +" " +
                third + " " +
                forth + " " +
                fifth + " " +
                sixth + " " +
                seventh + " " +
                eigth;
        System.out.println("withSpace = " + withSpace);
       // System.out.println(first);
        //C y b e r t e k


    }
    }

