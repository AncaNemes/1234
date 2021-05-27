package day08_casting_scannner;

import java.sql.SQLOutput;

public class CastingExample {
    public static void main(String[] args) {
        //short, byte, int long implicit

        byte num1 = 100;
        short num2 = num1;
        int num3 = num1;
        int num4 = 1000 ;
        long num5 = num4;
        float num6 =124.4F;
        double num7 = num6;

        int num8 = 3456;
        double num9 = num8;// it is a decimal and will have3456.0 when printed
        System.out.println(num8);
        System.out.println("num9 = " + num9);

        //explicit casting
       // byte short int long
        int num10 = 22;
       byte num11 =(byte) num10;
      short num12=(short)num10;
         //to convert it we have to cast it to make it smaller to fit to int
        System.out.println("num10= "+num10);
        System.out.println("num11 = "+num11);
        System.out.println("num12 = " + num12);
        
        double num13 = 55.3;
        float num14= (float)num13;
        System.out.println("num13 = " + num13);
        System.out.println("num14 = " + num14);

        double num15= 1234.5;
        int num16= (int)num15;
        System.out.println("num15 = " + num15);//1234.5
        System.out.println("num16 = " + num16);// 1234 no change

        int num17=300;
        byte num18= (byte)num17;
        System.out.println("num17 = " + num17);
        System.out.println("num18 = " + num18);

        //casting char to int
        char letter='A';
        int numletter = letter;
        System.out.println("letter = " + letter);
        System.out.println("numletter = " + numletter);

        char ch ='J';
        int cHnum=ch;
        System.out.println(cHnum);
        double d=10.5;
        short sh=(short)d;
        System.out.println( sh);//10

        int num= (int) 123.4;
        System.out.println(num); //123

        double dD= 123;
        System.out.println(dD);









    }
}
