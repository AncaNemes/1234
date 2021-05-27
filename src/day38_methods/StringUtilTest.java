package day38_methods;
import static day38_methods.StringUtils.*; //imported

public class StringUtilTest {
    public static void main(String[] args) {
        String userName="";
        if(StringUtils.isNullOrEmpty(userName)){
            System.out.println("Username cannot be null or empty");
        }
        System.out.println("is Polindrom(civic ) = " + StringUtils.isPalindrome("civic"));
        System.out.println("is Polindrome (kayak )= "+ StringUtils.isPalindrome("kayak") );
        System.out.println("is Polindrome (cybertek) =" +StringUtils.isPalindrome("cybertek"));

        String worde= "java";
        String reWord= StringUtils.reverse(worde);
        System.out.println("word= " +worde);
         System.out.println("reWord = " + reWord);
    }
}
