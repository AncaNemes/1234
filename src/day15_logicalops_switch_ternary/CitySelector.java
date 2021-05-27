package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {


        String city = "Seoul";

        if (city.equals("Seoul") || city.equals("Chicago")) { //change with && and would not be true
            System.out.println(city + " I will be packing up in 24 h  ");
        } else {
            System.out.println("not considering " + city);

        }

        String teacher = "Nadir";
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println(" you have Java class with " + teacher);
        } else {
            System.out.println(" You have soft skills with " + teacher);
        }
        //branch
        // 1- teacher SAim or Murodil- it is java class
        // else if teacher nadir=soft skills with NAdir
        // else any other class -come class with gurhan


        teacher="Saim";

        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println(" you have Java class with " + teacher);
        } else if( teacher.equals("Nadir")) {
            System.out.println(" You have soft skills with " + teacher);
        } else {
            System.out.println("Go to the class"+teacher);
        }

        /*company "google" || salary=100k

         */
        String company="Google";
        int salary=95_000;

        if ( company==("Google") || salary >= 100_000){
            System.out.println("I will accept the offer "+ company);
        } else {
            System.out.println("REjecting the offer"+company);
        }

        if ( company==("Google") && salary >= 100_000){
            System.out.println("I will accept the offer "+ company);
        } else {
            System.out.println("REjecting the offer" + company);
        }
    }
}