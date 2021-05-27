package day14_multi_branch_if_statement;

public class MultiBranchIfStatement {
    public static void main(String[] args) {


        /*add new class MultiBranchIfStatement
add main method

day -> 1
if day -> 1 : Monday
if day -> 2 : Tuesday
if day -> 3 : Wednesday*/
        int day= 3;
        if (day==1) {
            System.out.println("Monday");
        } else {
            System.out.println("Not Monday");
        }
        if (day==2) {
            System.out.println("Tuesday");
        }
        if (day==3) {
            System.out.println("Wednesday");
        }
        // MULTI BRANCH CONDITION- CHECK each condition from top to bottom once if finds the condition it wil run the code for that if and exits, it does not check the other conditions
  int daY=20;
        if (daY==20){
            System.out.println(" Monday");
        } else if ( daY==9) {
            System.out.println(" Tuesday");
        } else if (daY==3) {
            System.out.println("Wednesday");
        } else{
            System.out.println("java day");
        }
    }
}
