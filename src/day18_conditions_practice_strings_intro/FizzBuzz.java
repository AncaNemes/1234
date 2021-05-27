package day18_conditions_practice_strings_intro;

public class FizzBuzz {
    public static void main(String[] args) {
        /*
        "FizzBuzz" when number is divisible by 3 and 5
        "Fizz " number is divisible by 3
         "Buzz " the number divisible by 5*/
        int num = 7; //replace number to have different true print  num= 9 or 10 or 15
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        }else{
            System.out.println(num);
                }
            }
        }
