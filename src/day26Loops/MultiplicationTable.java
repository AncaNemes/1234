package day26Loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        int num = 2;

        if(num <1 ||num >10){
            System.out.println("error:invalid imput");
            return;
        }
     /*   System.out.println(num  + " x "+ 1 + "="+(num*1));
        System.out.println(num  + " x "+ 2 + "="+(num*2));
        System.out.println(num  + " x "+ 3 + "="+(num*3));
        System.out.println(num  + " x "+ 4 + "="+(num*4));
        System.out.println(num  + " x "+ 5 + "="+(num*5));
        System.out.println(num  + " x "+ 6 + "="+(num*6));*/

        for(int i = 0; i <= 10; i++){
            System.out.println(i + " * " + num +" = " +(i * num));
        }

    }
}
