package day25_loops;

public class PrintEveOrOddNumbers {
    public static void main(String[] args) {
        //print all even number1-100
        //print all odd number 1-100

        System.out.println("even NUMBER");
        for (int p = 0; p <= 100; p++) {
            if (p % 2 == 0 ) {
                System.out.print(p + " ");
            }
        }
        System.out.println();
        System.out.println("ODD NOT EVEN NUMBERS");

        for (int p = 0; p <= 100; p++) {
            if (p % 2 != 0) {
                System.out.print(p + " ");
            }
        }
    }
}


