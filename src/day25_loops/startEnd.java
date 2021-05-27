package day25_loops;
import java.util.Scanner;

public class startEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("print numbers from start till end separated by space");
        int start, end;

        start=  scan.nextInt();
        end= scan.nextInt();
        for(int time= start;time<=end; time++){
            System.out.println(time);
        } if(start>end){
            System.out.println("\"reverse numbering is not supported\"");}
    }
}
