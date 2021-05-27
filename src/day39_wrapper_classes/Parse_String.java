package day39_wrapper_classes;
import java.lang.*;

public class Parse_String {
    public static void main(String[] args) {
        String total ="345";
        int count=Integer.parseInt(total);
        int num = Integer.parseInt("55");


        System.out.println(total);

        String strPrice ="123.99";
        double price= Double.parseDouble(strPrice);

        String strPric = "123.5";
        double pricee =Double.parseDouble(strPric);
        if(price>100){
            System.out.println("expensive");
        }

        String sentence = "I wrote 100 lines of code";
        String [] wor= sentence.split(" ");
        int linesOfCode = Integer.parseInt(wor[2]);
        System.out.println("linesOfCode = " +linesOfCode);
    }
}
