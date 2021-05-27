package day37_Overloding;

public class MethodOverloding {
    public static void main(String[] args) {
        MethodOverloding.Sum(10,5); // wrote the class name to get the custom method
        Sum(10.4,12.5);
        Sum(10, 5.5);// will caste it into INT
        Sum(4,1,2);
        Sum("Hello ","World");

    }


    public static void  Sum(int num1, int num2){
        System.out.println("sum(int num1, int num2)");
        System.out.println("REsult = " + (num1+num2));  // (num1+num2)) we need the parenthesis toNOT CONCATENATE
    }
    public static void Sum(double num1, double num2){
        System.out.println("sum(double.double)");
        System.out.println("REsult = " + (num1+num2));
    }
    public static void Sum(int num1, int num2, int num3){
        System.out.println("sum(int num1, int num2,num3)");
        System.out.println("REsult = " + (num1+num2+num3));// if only num1 and num2 will not compile
    }
    public static void Sum(String num1, String num2){
        System.out.println("sum(string, string)");
        System.out.println("REsult = " + (num1+num2));
    }
}
