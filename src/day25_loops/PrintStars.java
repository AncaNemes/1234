package day25_loops;

public class PrintStars {

    public static void main(String[] args) {

        for(int s = 0; s<=15; s++ ){
            System.out.print("\u2605"); //unicode for * in  java

        }
        System.out.println();

        String myStars = "";
        //fill 5 stars  to my stars variable
        for( int star=1; star<=5; star++) {
            myStars += "* ";
        } // if you change the } from line 17 to 18 it gives a different answer
        System.out.println("my stars = " + myStars); //******
    }
}
