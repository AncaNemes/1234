package sample;
import java.util.Scanner;
public class Controller {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info) {

        String [] sArray = info.split(",");

            System.out.println( "person name: " +sArray[0] +"\n"+ "last name: " +sArray[1] +"\n"+ "age: "+sArray[2]);

        }

    }