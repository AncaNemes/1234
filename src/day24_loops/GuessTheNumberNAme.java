package day24_loops;
import java.util.*;

public class GuessTheNumberNAme {
    public static void main(String[] args) {

     /* while(true){
       Random randomNum =new Random();
        System.out.println(randomNum.nextInt(101));
      }*/
        Random randomNum =new Random();
       Scanner scan = new Scanner(System.in);
       int secretNumber=randomNum.nextInt(101);
       int guessingNumber= 0;

        do {
            System.out.println("Guess the secret number");
            guessingNumber = scan.nextInt();
            if(guessingNumber > secretNumber) {
                System.out.println("wrong, your number is too large");
            }else if(guessingNumber < secretNumber){
                System.out.println("wrong, your number is too small");
            }
        }while(secretNumber != guessingNumber);

        System.out.println("Congratulations, you won! secret number:"+secretNumber);

       /*do{
           System.out.println("guess the secret number");
           guessingNumber=scan.nextInt();
       }while(secretNumber != guessingNumber);//if
        System.out.println("congratulations, you found the number"+secretNumber);*/
    }
}
