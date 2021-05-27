package day1;
import com.sun.tools.javac.comp.Enter;

import java.util.Scanner;

public class testingQuiz {
    /*public static void main(String[] args) {
        System.out.println("ResultsB"+(1)+(2));
        long a = 2_000L;
        double b = (float) a;
        System.out.println( b);
        n this assignment you will write a program to create a shopping list and prices.

You will use Scanner object and ask user to enter 3 items followed by its price and you will calculate total price and show as a report.

-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Create a Scanner object named scan.

Example:

Enter Item1 and its price:
Tomatoes
5.5
Enter Item2 and its price:
Cheese
3.5
Enter Item3 and its price:
Apples
6.3

Output:
Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
Total price: 15.3
     */


    Scanner scan = new Scanner(System.in);
//Enter Item1 and its price:
//Tomatoes
//5.5

    /*   String item1="Tomatoes", item2="Cheese", item3="Apples", report="Total Price:";
      double price1=5.5, price2=3.5, price3=6.3, totalPrice=price1+price2+price3;
       System.out.println("Item1: "+ item1+"Price "+price1+","+" Item2: "+ item2+"Price "+price2+","+" Item3: "+ item3+"Price "+price3+","+report+totalPrice);

Enter Item1 and its price:
2
Enter Item2 and its price:
3
Enter Item3 and its price:
4
Item1: Shoes Price: 50.0, Item2: Shirt Price: 30.0, Item3: Scarf Price: 16.3
5
Total price: 96.3
   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item and its price");
        String item = scan.next();
        double price = scan.nextDouble();
        System.out.println(" Item:" + price);
    }

}
