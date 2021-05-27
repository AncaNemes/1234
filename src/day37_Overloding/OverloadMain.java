package day37_Overloding;

import java.util.Arrays;

public class OverloadMain {
    public static void main(String[] args) {  //// args can be changed with any variable name
        System.out.println("Hello from real main method");
        main(10);
        Main(7);
        System.out.println(Arrays.toString(args));
    }

    public static int main(int num){
        System.out.println("num=" +num );
        return num;
    }
public static void Main(int num){
    System.out.println("number with void no return  "+num);
}
}
