package day12;

public class CompareChars {
    public static void main(String[] args) {
    char    letter1= 'A';
    char    letter2= 'B';
        System.out.println(letter1 >  letter2); //65>74
        System.out.println(letter1 ==  letter2); //65=74
        System.out.println(letter2>letter1); //74>65

        char grade = 'E';
      boolean  pass= grade <='D';
        System.out.println( "Did you pass the exam? -"+pass);

    }
}
