package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
       /* grade = A,B,C,D,E
       if the grade A or B or C
       else if when grade is D qualify for retake
       else grade E not passed
       anything else invalid grade
        */
        char grade = 'A';
        // grade = 'D';
        // grade = 'E';
        // grade = 'F';

        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println(grade + " you passed the grade");
        } else if (grade == 'D') {
            System.out.println(grade + " You can retake the test");
        } else if (grade == 'E') {
            System.out.println(grade + " You did not pass the test");
        } else {
            System.out.println(" Anything else is invalid");
        }

        if (grade == 'A' || grade =='a'|| grade == 'B' || grade == 'b' || grade == 'C'|| grade == 'c') {
            System.out.println(grade + " you passed the grade");
        } else if (grade == 'D'|| grade=='d') {
            System.out.println(grade + " You can retake the test");
        } else if (grade == 'E') {
            System.out.println(grade + " You did not pass the test");
        } else {
            System.out.println(" Anything else is invalid");
        }
    }
}