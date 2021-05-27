package day24_loops;
import javax.lang.model.SourceVersion;
import java.util.Scanner;
//import java.util.Scanner;

public class GiveMe5$ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dollar = scan.nextInt();


        while (dollar !=5)
        {
            System.out.println("Give me 5 $");
            dollar = scan.nextInt();
          //  dollar++;
        }
        System.out.println("Thank you for 5$");
    }
}
