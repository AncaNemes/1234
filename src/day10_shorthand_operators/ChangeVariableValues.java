package day10_shorthand_operators;
/*new class
add method

 */
public class ChangeVariableValues {
    public static void main(String[] args) {
 int count= 3;
        System.out.println();
        System.out.println("count = " + count);
        //add/increase to more to count
  count= count+2;
        System.out.println("count = " + count);
        int apples=5;
        System.out.println("apples = " + apples);
        apples= apples+10;
        System.out.println("apples = " + apples);//12
apples= apples-3;
        System.out.println("apples = " + apples);
        
        int pizzaSlices=8;
        System.out.println("pizzaSlices = " + pizzaSlices);
        pizzaSlices=8/2;
        System.out.println("pizzaSlices = " + pizzaSlices);
        //get another small pizza just for you- 6 slices
        pizzaSlices=pizzaSlices+6;
        System.out.println("pizzaSlices = " + pizzaSlices);
        int players = 10;
        System.out.println("players = " + players);
        players=players*2;
        System.out.println("players = " + players);
        
        int cents = 50292;
        System.out.println("cents = " + cents);
      //  keep whole dollars portiona and just assign remaining sents 
        cents = cents%100;
        System.out.println("cents = " + cents);
    }
}
