package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50,35));
        System.out.println(Integer.min(5,21));
        //System.out.println(Integer.reverse(3));
        System.out.println("min int  :" + Integer.MIN_VALUE);
        System.out.println("Max int :" + Integer.MAX_VALUE);

        System.out.println(Double.max(234.4, 23.9));
        System.out.println("Min DOUBLE :" + Double.MIN_VALUE);
        System.out.println("MAX DOUBLE: " + Double.MAX_VALUE);


        System.out.println(Double.compare(5,1));
        System.out.println(Double.compare(5,5));
        System.out.println(Double.compare(5,41));
        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('Q'));
        System.out.println(Character.isLetter('r'));
        System.out.println(Character.isUpperCase('Q'));
        System.out.println(Character.isUpperCase('9')+" is fun");

        char letter = 'A';
        if(Character.isUpperCase(letter)){
        System.out.println(letter);
        }else{
            System.out.println("not true");
        }
        String word ="JaVA iS Fun";
        for(int i = 0; i <word.length();i++ ){
            if(Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i) +"");
            }
        }
        System.out.println();
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.TRUE.equals(5>3));




    }
}
