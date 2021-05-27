package day07_arithmetic_operators_casting;

public class OperatorPrecedence {
    public static void main(String[] args){
        System.out.println(10+5); //12
        System.out.println(10-5+3); //8
        System.out.println(10-(5+3));//2
        System.out.println(2*3);//6
        System.out.println(2*3/3);//2
        System.out.println(20/ (2*2)); //  20/4->5
      //  System.out.println(10/0); // -> cannot divide by 0

        System.out.println(2+ 5*3); // multiplication goes first
        System.out.println((2+5)*3);  //21

        int num=10;
      //  System.out.println(10/0);error

        System.out.println(10/3); //3 java keep the change if not even #

        System.out.println(5/2);
    }
}
