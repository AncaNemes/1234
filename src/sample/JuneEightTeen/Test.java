package sample.JuneEightTeen;

public class Test {

    public static void main(String[] args) {
        new B();
        B a = new B();
        B a2 = new B("word");
        B a3 = new B(5);
        System.out.println(B.count);
    }
}