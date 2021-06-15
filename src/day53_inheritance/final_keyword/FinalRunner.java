package day53_inheritance.final_keyword;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);
        //TestData.ADMIN_USERNAME="change; ERROR CANNOT CHANGE VALUE of variable values
         final int SSN=432123433;
       //  SSN=123243534; cant reassing gives us and ERROR VARIABLE IS FINAL
    }
}
