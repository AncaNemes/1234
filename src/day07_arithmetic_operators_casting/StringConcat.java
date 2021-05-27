package day07_arithmetic_operators_casting;

public class StringConcat {
    public static void main(String[] args){
       /* java 8
            java53
            
        */
        System.out.println("java" +5+3);// it goes left to rigth and has a String("java") and the number will be 53
        System.out.println("java"+(5+3)); // when in parenthesis ()
        // they will calculate first output java8

        System.out.println(5+3+2);// it is arithmetic will add them,->output 10
        System.out.println(5+3+"java");// L to R result 8java

        System.out.println("hello"+1+2+3);
        System.out.println(1+2+3+"hello");
        System.out.println("hello"+(1+2+3));

        System.out.println("hello"+(1+2+3));

        String str1="hello";
        String str2="friends";


        System.out.println(str1+str2);
        System.out.println(str1+" "+str2);
        //for space you can out ""

        int num1=7;
        int num2=8;
        System.out.println(num1+""+num2);
        //write 78
        System.out.println(num1+""+num2);
        // EMPTY STRING "" but still a String object


         char char1='a';
         char char2='b';
         System.out.println(char1+char2);
         // understand it you have a concatenation or arithmetic
        // when we plus between chars, it will add numbers from ASCII table exp
        // 'a'-97
        // 'b'-98
        System.out.println(char1+""+char2);
        // when adding the empty string "" it becomes a string

    }
}
