package day09_scanner_practice;
//import java.util.Scanner;

public class SpeedCheckV1 {
    public static void main(String[] args) {
       /* Scanner input =  new Scanner(System.in);
        speedLimit- 55
        currentSpeed=75
        overTheLimit-currentSpeed-speedLimit;

         */
        int speedLimit=55;
        int currentSpeed=75;
        int overTheLimit= currentSpeed-speedLimit;
        System.out.println("You are driving "+overTheLimit+ "mph over the limit. Slow Down");
    }
}
