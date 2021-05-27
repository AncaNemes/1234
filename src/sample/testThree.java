package sample;
import java.util.*;
import java.util.*;
public class testThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        // DO NOT TOUCH ABOVE
        //TODO: Write your code below.

        for(int max=0; max<nums.length; max++){

            System.out.println(max);
        }
       /*//write your code below
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();

        String result = "";
        for(int i=1; i<=count-1; i++){
            result +=word+separator;}
        result +=word;
        System.out.println(result );*/
    }

}
              /*  Scanner scan = new Scanner(System.in);
                String word = scan.next();
                //YOUR CODE HERE

                if(word.length()%2==1 && word.length()>=3) {
                    int middleOdd= word.length()/2;
                    System.out.println(word.charAt(middleOdd));
                } else if ( word.length()%2== 1 && word.length()==1){
                    System.out.println(""+word.charAt(0)+word.charAt(0)+word.charAt(0));
                }
                if (word.length() % 2 == 0 && word.length() >= 4) {
                    int middleEven=word.length()/2;
                    System.out.println("" + word.charAt(middleEven-1) + word.charAt(middleEven));
                } else if(word.length()%2 == 0 && word.length()==2){
                    System.out.println("" + word.charAt(0) + word.charAt(1) + word.charAt(0)+word.charAt(1));
                }*/

            /*Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if ((str.charAt(i) == 'h') && (str.charAt(i + 1) == 'i'))
                    count += 1;


            }*/




            /*Scanner scan= new Scanner(System.in);

            String item = scan.nextLine();
            int cost = scan.nextInt();
            int balance = 100;

            if (item.equals("Blanket"))
            { System.out.println("Thank you for your purchase");
                balance -=60;
                System.out.println("Your current balance is:"+ balance+" $");
            }
            else if (item.equals("Charger")){
                System.out.println("Thank you for your purchase");
                balance -=15;
                System.out.println("Your current balance is:"+ balance+" $");
            }
            else if (item.equals("Hat"))
            { System.out.println("Thank you for your purchase");
                balance -=25;
                System.out.println("Your current balance is:"+ balance+" $");
            }
            else if (item.equals("Headphones"))
            {  System.out.println("Thank you for your purchase");
                balance -=30;
                System.out.println("Your current balance is:"+ balance+" $");
            }
            else if (item.equals("Laptop"))
            { System.out.println("Sorry not enough funds on your gift card");
            }
            else if (item.equals("Pants")){
                System.out.println("Thank you for your purchase");
                balance -=50;
                System.out.println("Your current balance is:"+ balance+" $");
            }
            else if (item.equals("Pillow"))
            { System.out.println("Thank you for your purchase ");
                balance -=15;
                System.out.println("Your current balance is:"+ balance+" $");
            }
            else if (item.equals("Smartphone"))
            { System.out.println("Sorry not enough funds on your gift card ");
            }
            else if (item.equals("Socks"))
            { System.out.println("Thank you for your purchase");
                balance -=5;
                System.out.println("Your current balance is:"+ balance+" $");
            }
            else if (item.equals("USB cable"))
            { System.out.println("Thank you for your purchase");
                balance -=10;
                System.out.println("Your current balance is:"+ balance+" $");
            } else{System.out.println("Invalid item!");*/
