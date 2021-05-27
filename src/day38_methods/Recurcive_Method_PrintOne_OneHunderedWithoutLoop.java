package day38_methods;

public class Recurcive_Method_PrintOne_OneHunderedWithoutLoop {
    public static void main(String[] args) {
        //print 1-100 without the loop
      printOneTohundre(1);
    }

    public static void printOneTohundre(int num){
        System.out.print(num+ " ");
        num++;
      if(num<=100) {
          printOneTohundre(num);
      }
    }
}
