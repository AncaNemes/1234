package day38_methods;

public class MethodsCallAnother {
    public static void main(String[] args) {
        start();

    }

    public static void start(){
        System.out.println("start");
        keepcontinue();
    }
    public static void keepcontinue(){
        System.out.println("keep continue");
        end();
    }
    public static void end(){
        System.out.println("end");
    }
}
