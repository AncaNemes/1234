package day29_loopsNested_arrays;

public class OuterInnerPrint {
    public static void main(String[] args) {
        for (int outer = 1; outer <= 10; outer++) {
            for (int inter = 1; inter <= 10; inter++) {
                System.out.print(outer * inter+ "\t");
             //  int sum = outer * inter;
               // System.out.print(outer + "*" + inter +"="+ sum+"; ");
            }
            System.out.println();
        }

        String word = "java";
        for(int i=0; i<word.length(); i++){
            for(int j = 0; j <= i; j++)
                System.out.print(word.charAt(j));
        }
        System.out.println();

    }
}