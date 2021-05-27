package day29_loopsNested_arrays;

public class Nested_For_LoopCLockSecondsMinute {
    public static void main(String[] args) {


        /* NestedLOOP is java, we can write nested loops in java, using while, do while for loops
        * basic syntax with the loop
        * for(int i=1l i<=5; i++)      <-- OUTEER LOOP
        *    for(int j=1; j<=5; j++)   <-- NESTED LOPS
        * // CODE
         HOW DOES IT WORK:
         * for each single iteration of OUTER LOOP, INNER LOOP completes full cycles each time
         * OUTEER LOOP equals 1, before outer loop goe s ++ increase, the inner loop needs to complete FULL CYCLE (1 TO 5)*/

        for (int minutes = 1; minutes <= 5; minutes++)
        {
        System.out.println("minutes= " + minutes );
           for (int seconds=1;seconds<=60; seconds++){
        System.out.print(seconds +" ");
           }
        }

        for (int minutes = 0; minutes <=4; minutes++){
            for (int seconds = 0; seconds<= 59; seconds++)
                System.out.println( minutes+":"+seconds);
          //  for (int seconds = 0; seconds<= 59; seconds++){
             //   System.out.println(seconds);
            }

        }
    }

