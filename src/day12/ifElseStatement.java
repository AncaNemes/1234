package day12;

public class ifElseStatement {
    public static void main(String[] args) {
        if (10 >5){
            System.out.println("Condition is true");
        } else{
            System.out.println("Condition is False");
        }

        int count= 25;
        // check if count is more than 30, if yes ""count is more than 30 other wise print"'count is less than 30

        if (count > 30) { //false
            System.out.println("count is more than 30");
        } else {
            System.out.println("count is less than 30");
        }

        byte age = 25;
        if (age>=18){
            System.out.println("Eligible to vote");
            System.out.println("Age is greater or equal to 18");
        } else{
            System.out.println("Not eligible to vote");
            System.out.println("Age is less then 18");
        }
    }
}
