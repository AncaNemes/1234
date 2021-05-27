package day18_conditions_practice_strings_intro;

public class ifWithoutCurlyBreaces {
    public static void main(String[] args) {
        String todayClass = "python"; // initial "java" changes with "python"

        if(todayClass.equals("java")) {
            // without the curly braces still sprint
            System.out.println("Java is fun");
        System.out.println("Code all day");}
       // System.out.println("second statement");
        else
            System.out.println("it is not java it is "+ todayClass);
        int score = 1;
        if (score == 1){
            System.out.println("lowest score1");
        } else if (score==2){
            System.out.println("score is 2");
        }else if (score== 3){
            System.out.println("score is 3");
        } else{
            System.out.println("invalid score");}

        int scorE=1;
        if (scorE >0){
            System.out.println("pass");
            System.out.println("your score is"+scorE);
        }else{
            System.out.println("fail");
            System.out.println("your score is"+scorE);
        }
        // use the curly brace when using the IF statement when used without the curly {} only the first statement will print if it is the same  with the if statement
    }
}
