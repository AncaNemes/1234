package day05_primitives_concatanation;

public class UsingVariables {
    public static void main(String[] args){
        int num1=100;
        int num2=num1;
        System.out.println(num1);
        System.out.println(num2);

        num1=200;
        System.out.println(num1);
        System.out.println(num2);
        //line 12 prints th esame as we did not ask to change num2

        int n1= 55;
        int n2=n1;
        int n3=n2;
        /* n1- 55
           n2-55
           n3-55
         */
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        n1=56;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        int inThisAreaZipCode = 22181;
        int parvinZipCode= inThisAreaZipCode;
        System.out.println(inThisAreaZipCode);
        System.out.println(parvinZipCode);

     inThisAreaZipCode = 22187;
     parvinZipCode= 33131;
        System.out.println(inThisAreaZipCode);
        System.out.println(parvinZipCode);
    }

}
