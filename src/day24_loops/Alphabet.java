package day24_loops;

public class Alphabet {
    public static void main(String[] args) {
        //print from a to z using the while loop
        char letter= 'a';
       /* System.out.println("letter ="+letter);
        letter++;
        System.out.println("letter ="+letter);*/

        while(letter <= 'z') {
            System.out.println("letter=" +letter);
            letter++;
        }

    }
}
