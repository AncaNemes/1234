package day28_looPS;public class BreakVsContinue {
    public static void main(String[] args) {
        //BREAK STATEMENT
        for (int n = 1; n <= 5; n++) {
            System.out.println(n);
            if (n == 3) {
                break;
            }
        }
        System.out.println();

        for( int i =1; i<=5; i++){
            if(i==2 || i==4){
                continue;//goto next iteration,skip the colde below
            }
            System.out.print(i);
        }
    }
}