package sample;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
            System.out.println(list.get(i));
            System.out.println(list.size());

        }

        // Write your code below

}
}


