package day07_arithmetic_operators_casting;

public class DivisionProblem {
    public static void main(String[] args){
        System.out.println(10/3); //3
        System.out.println(5/2); //2

        int num1=40;
                int num2=15;
System.out.println(num1/num2);
System.out.println(5.0/2.0);
System.out.println(5.0/2);
double d1= 12.0;
double d2= 5.0;
System.out.println(d1/d2);// 2.4 result when having decimals in the #
        int count=100;
        double dCount=30.0;
        System.out.println(count/dCount);

      //  int n3 = 4;
      //  byte b1 = n3;


        //PRIMITIVE CASTING/CONVERTING
        int n3=4;
        byte b1=(byte)n3;//   (byte)n1 will cast, convert n1 to BYTE, then assign the value

        byte b2=55;
        int n2=b2; // the statement will work fine, since BYTE IS SMALLER  data type then int

    }
}
