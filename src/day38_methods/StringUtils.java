package day38_methods;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println("isnullor empty (\"hello\")=" + isNullOrEmpty("hello"));
        String word = null;
        System.out.println(word.toUpperCase());
        System.out.println("isnullOrEmpty(word) =" + isNullOrEmpty(word));
        word = "";
        System.out.println("isNulOrEmpty(word  =)" + isNullOrEmpty(word));
        
        String worde= "java";
       // String reWord= StringUtils.reverse(worde);
        System.out.println("word= " +worde);
      //  System.out.println("reWord = " + reWord);
        
    }

    public static boolean isNullOrEmpty(String str) {
        // str="";
        // return (str== null || str.isEmpty(){
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }
        /*  Parameter: String str
    returns boolean
    true:
        str is null or empty ""
    otherwise false*/


    public static boolean isPalindrome(String str) {
//return true if palindrom or false if not
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static String reverse(String str) {
        String reversed = "";
        for(int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

}