package day26Loops;

public class weekdays {
    public static void main(String[] args) {
     //  loop n= 1-10;
       //insideloop: using switch statement

       for( int n=1; n <= 10; n++){
           switch (n ){
               case 1:
                   System.out.println(n +" monday");
                   break;
               case 2:
                   System.out.println(n +" tuesday");
                   break;
               case 3:
                   System.out.println(n +" wednesday");
                   break;
               case 4:
                   System.out.println(n +" thursday");
                   break;
               case 5:
                   System.out.println(n +" friday");
                   break;
               case 6:
                   System.out.println(n +" saturday");
                   break;
               case 7:
                   System.out.println(n +" sunday");
                   break;
               default:
                   System.out.println(n + " their is not such day it is java day");
                   break;
           }
       }

    }
}

          /* switch(n){
               case 1 : day="Monday";
                   System.out.println(n+day);
                   break;
               case 2 : day="tuesday";
                   System.out.println(n+day);
                   break;
               case 3 : day="Wednesday";
                   System.out.println(n+day);
                   break;
               case 4 : day="Thursday";
                   System.out.println(n+day);
                   break;
           }
       }*/
