package day25_loops;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int n = 1; n <= 100; n++) {
            if (n % 3 == 0 && n % 5 == 0)
            {
                System.out.println("FizzBuz");
            } else if (n % 3 == 0) {
                System.out.println("fizz");
            }else if (n % 5 ==0){
                System.out.println("buzz");
            }else {
                System.out.println(n);
            }
        }
    }
}
/*add new class FizzBuzz
main method

loop from 1 to 100
    when num divisable by 3 and 5
        -> "FizzBuzz"
    when num divisable by 3
        -> "Fizz"
    when num divisable by 5
        -> "Buzz"
    else
        -> print num
------------------------------------*/