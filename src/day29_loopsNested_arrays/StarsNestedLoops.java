package day29_loopsNested_arrays;

public class StarsNestedLoops {
    public static void main(String[] args) {

        for (int outeer = 1; outeer <= 5; outeer++) {
            //  System.out.println(" * ");{
            for (int inner = 1; inner <= 10; inner++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // outer :1-10
        // inner 1to outer

        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 1; inner <= outer; inner++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 10; inner >= outer; inner--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
