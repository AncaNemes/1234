package day18_conditions_practice_strings_intro;

public class multiBranchIf {
    public static void main(String[] args) {
        /*
        day18_conditions_practice_strings_intro
Add new class MultiBranchIf

number => 5

number is more than 0
    print 5 is positive
number is less than 0
    print number is negative
number equal 0:
    print number is zero
=============================
         */
        int number = 5;
        if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else {  // else if (number==8))
                System.out.println(number + " is zero");
            }
            }
        }