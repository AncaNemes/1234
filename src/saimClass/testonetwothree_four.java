package saimClass;
import java.util.Scanner;
public class testonetwothree_four {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();

        next3(num);
    }

    // Do not touch above
    public static void next3(int num) {
        System.out.println("next 3 are:");
        for (int i = num; i <= num+3; i++) {
          //  argument = i +3;
            System.out.print( i+ " ");
        }
    }
}