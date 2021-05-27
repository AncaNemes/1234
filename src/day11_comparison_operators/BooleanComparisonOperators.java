package day11_comparison_operators;

import javax.lang.model.SourceVersion;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10==10); // true 10==10
        System.out.println(1000>100); // true 1000>100
        System.out.println(184.44<9875.3);//true
        System.out.println(10<=11);// true
        System.out.println(5>=3);//true
        System.out.println(-100!=44);//true

        int a=100;
        int b=200;
        System.out.println(a==b);//false
        System.out.println(a>b);//false
        System.out.println(a<b);//true
        System.out.println(a>=b);//false
        System.out.println(a<=b);//true
        System.out.println(a !=b);//true

    boolean result= 5==5;
        System.out.println("result= "+ result);

        result= 33>43;
        System.out.println("result = " + result);

        result=88<99;
        System.out.println("result = " + result);

        result= 10>=10;
        System.out.println("result = " + result);

        result= 2!=2;
        System.out.println("result = " + result);

        String city= "Seattle";
        System.out.println(city=="Seattle");
        System.out.println(city=="Baku");
        System.out.println(city!="Fairfax");

        String name="Nadir";
        boolean checkName=name=="Nadir";
        System.out.println("checkName = " + checkName);

        checkName= name!="Kuzat";
        System.out.println("checkName = " + checkName);

        int age=2;
        boolean noMoretoddler=age > 3;
        System.out.println("noMoretoddler = " + noMoretoddler); //f


        age=66;
        boolean seniorCitizen=age >= 65;
        System.out.println("is senior citizen?"+ seniorCitizen);

    }
}
