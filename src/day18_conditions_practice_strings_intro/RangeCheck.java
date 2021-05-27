package day18_conditions_practice_strings_intro;

public class RangeCheck {
    public static void main(String[] args) {
        // numbers/chars
        //age 1-3 toddlers
        //3-7 toddler
        //7-...
        //  ..score 1-40D
        // 41-60 C 60-90B 90-100A
        int age = 15;
        char score = 'D';
        if (age >= 1 && age <= 3 || score >= 1 && score <= 40) {
            System.out.println("You are " + age + score);
        } else if (age >= 3 && age <= 7 || score >= 41 && score <= 60) {
            System.out.println("You are" + age + score);
        } else if (age >= 7 && age <= 10 || score >= 60 && score <= 100) {
            System.out.println("You are a teenager " + age + score);
        } else {
            System.out.println("You will leave for eternity :");
        }

        int scorE = -5;  // exp scorE=89
        if (scorE >= 1 && scorE <= 40) {
            System.out.println("Grade D");
        } else if (scorE >= 41 && scorE <= 60) {
            System.out.println("Grade C");
        } else if (scorE >= 60 && scorE <= 89) {
            System.out.println("Grade B");
        } else  if (scorE >= 90 && scorE <= 100) {
            System.out.println("Grade A+");
        } else{
            System.out.println("invalid grade" + scorE);
        }
            }
        }
//else if (scorE <=0 || scorE > 100) {
//System.out.println("Invalid grade "+scorE);
//                }