package sample;

public class loopsPractice {
    public static void main(String[] args) {
        /*
        LOOPS
        •Write a program that can calculate the sum of all the even numbers between 1 ~ 100
        •Write a program that can calculate the sum of all the odd numbers between 1 ~ 100
        •Write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
        •Write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5
        [Dynamic alphabet]
        •Write aprogramthatwillask‘upper’ or ‘lower’
        •If it is upper:printthe alphabet in all uppercase letter from A to Z
        •If it is lower: print the alphabet in all uppercase letter from a to z
            -Challenge: Also ask if they want to show the alphabet in ascending or  order descending
            -Ascending: A –Z or a –z -Descending: Z –A or z –a
      [Max and Min from 5 numbers]
         •Write a program that can ask the user "enter a number" five times and return the maximum number
         •Write a program that can ask the user "enter a number" five times and return the minimum number
        */
        int sum = 0;
        for(int i=1; i<= 100; i++) {
            if(i % 2 == 0) {
              //  sum += i;
                System.out.print(i+" even");
            }}

        System.out.println();
        int sume= 0;
        for(int i=1; i<= 100; i++) {

            if(i% 2 == 1) {
                System.out.print(i +" odd");
                //sume += i;
            }}

        System.out.println();

        int three = 0;
        for(int i=1; i<= 100; i++) {
            if(i % 2 == 0) {
                if (i%3==0 && i%5==0){
                    System.out.println(i+"  odd # 3 and 5");
                }
            }
        }
        int two=0;
        for(int t=1;t<=100; t++){
            if(t % 2==0){
                if( t %3==0 & t%5==0){
                    System.out.println(t +" even # div by 3 and 5");
                }
            }
        }
    }
}