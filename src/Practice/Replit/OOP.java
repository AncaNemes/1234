package Practice.Replit;
import java.util.Scanner;
public class OOP {
//    You have two classes Main and Atts. Do not touch the Main class. Finish the Atts class to have attributes:
//
//    Strings: name, color
//    int: amount
//    Method: asString() (returns String in format shown below)
//    All attributes should be public

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Atts a = new Atts();
            a.name = in.next();
            a.color = in.next();
            a.amount = in.nextInt();

         //   System.out.println(a.asString());
        }
}
