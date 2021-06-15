package day53_inheritance.hiding;

public class Phone {
    String type="Alcatel";

    public static void use(){
        System.out.println("Using the Phone");

    }

    public void call(){
        use();
        System.out.println(" and Making a phone call");
    }
}
