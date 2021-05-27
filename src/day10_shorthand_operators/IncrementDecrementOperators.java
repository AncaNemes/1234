package day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        /*
++ add ONE TO THE VALUE
         */
        int i= 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        i++;
        i++;
        ++i;
        ++i;
        System.out.println("i = " + i);

        int linesOfCode = 15;
        System.out.println("linedOfCode = " + linesOfCode);
        // increase linesOfCode by 1  3 diff ways that we learnet today
        linesOfCode++;                  // short way increment
        System.out.println("linesOfCode = " + linesOfCode);
        
        ++linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);
        
        linesOfCode=linesOfCode+1;      // traditional way
        System.out.println("linesOfCode = " + linesOfCode);
        
        linesOfCode+=1;                 // short hand operated
        System.out.println("linesOfCode = " + linesOfCode);
        
        //type 4 different ways of decrease vy 1
        
        int phone=27;
        System.out.println("phone = " + phone);
        
        phone=phone-1;
        System.out.println("phone = " + phone);

        phone-=1;
        System.out.println("phone = " + phone);

        --phone;
        System.out.println("phone = " + phone);
        
        char letter = 'a';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter++;
        ++letter;
        System.out.println("letter = " + letter);
        
        letter--;
        System.out.println("letter = " + letter);
        
        letter++; letter++; letter++;
        System.out.println("letter = " + letter);
        
        letter--; letter--;
        System.out.println("letter = " + letter);


       
    }
}
