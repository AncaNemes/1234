package day14_multi_branch_if_statement;

public class LogicalANDOperator {
    public static void main(String[] args) {
        System.out.println(true && true); // result is true
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println( false && false);
        System.out.println(10>5 && 1==1);
        System.out.println( 5>3 && 3>5);
        System.out.println( 3==4 && 4==3);

        int apples=10, oranges=5;
        boolean check=apples>5 && oranges>3;
        System.out.println("WE HAVE FRUITS");

        if(apples>6 && oranges>2){
            System.out.println("I have greta number of fruit");
        }
            else {
                System.out.println("I need to go to walmart and buy more");
            }
        }
    }
