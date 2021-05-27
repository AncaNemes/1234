package day35_methods_with_param;

public class woidMethods {


    public static void main(String[] args) {

        printAtoZ();
        for (int i = 0; i <= 10; i++) {
            printAtoZ();
        }
    }

    public static void printAtoZ() {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}