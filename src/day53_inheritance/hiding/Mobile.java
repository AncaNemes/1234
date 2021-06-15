package day53_inheritance.hiding;

public class Mobile extends Phone{
    String type = "Mobile phone";

  /*
  Method hidding use()static method
   */
    public static void use(){
        System.out.println("using mobile phone");
    }

    public void text(){
        use();
        System.out.println("Sending a text message");
    }
}
