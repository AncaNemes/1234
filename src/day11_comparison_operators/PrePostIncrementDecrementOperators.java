package day11_comparison_operators;

import javax.lang.model.SourceVersion;

public class PrePostIncrementDecrementOperators {
    //==,--
    public static void main(String[] args) {


        int num1 = 1;
        num1++;
        System.out.println(num1);//=>3

        int num2=5;
        num2--;
        --num2;
        System.out.println(num2);

        int num11=4;
        int num22=num11++; // POSTINCREMENT when ++ at the end num22 takes value 4
        System.out.println(num11);
        System.out.println(num22);

        int num111=10;
        int num222=++num111; // PREINCREMENT when ++ in FRONT  num22 takes value 4
        System.out.println(num111);
        System.out.println(num222);

        //POST INCREMENT
      int num3=8;
       // int num4=num3;
       // num3++; // add1
        int num4= num3++;// will take 8 from num3 and will increase num3 by 1 will become 9
        System.out.println("num 3 = " + num3); //9
        System.out.println("num4 = " + num4); //8
        
        int apples=5;
        int basket=++apples;
        System.out.println("apples = "+ apples);
        System.out.println("basket = " + basket);
        
        int kiwi=15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " +kiwi );
        System.out.println("kiwiBasket = " + kiwiBasket);

        int cars=5;
        System.out.println( ++ cars);// 6 PRE INCREMENT before you Print add more ONE CAR

        int sedans=10;
        System.out.println( sedans++);//  10 POST INCREMENT PRINT SEDANS
        System.out.println("sedans = " + sedans);//11

         int mynnumber=33;// print first then add/increment by one
        System.out.println(mynnumber++);//33
        System.out.println(mynnumber);//34

        int myNumber=15;
        int yourNumber= ++myNumber;
        System.out.println(myNumber);
        System.out.println(yourNumber);

        int myNNumber=99;
        int yourNNumber=myNNumber++;// 99
               // 100

        System.out.println(myNNumber); //100
        System.out.println(yourNNumber);//99

        int a = 50;
        int b = 22;
        int c = a++ + ++b;  // 50+23

        System.out.println("a"+a);
        System.out.println("b"+b);
        System.out.println("c"+c);
    }
}
