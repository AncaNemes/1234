package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i")); //;true
        System.out.println(company.contains("ital"));//true
        System.out.println(company.contains("l o")); //true
        //if company contains space, print  "company name with multiple words company name"
        //else "single word company name

        if (company.contains(" ")) {
            System.out.println("company name with multiple words company name");
        } else {
            System.out.println("single word company");

        }

        String etsyTitle = "wooden spoon | Etsy";
        if (etsyTitle.contains("|")) {
            System.out.println("Pass -title check passed");
        } else {
        }
        System.out.println("fail- title check failed");


        String firstName = "ahmed";
        if (firstName.contains("a") && firstName.contains("e")) {
            System.out.println("first name name has a and e in your name");
        } else {
            System.out.println("it does not have a and e in the same name");
        }

        firstName = "Nadir";

        if (firstName.contains("a")|| firstName.contains("i")){
            System.out.println(" a or i is present");
        }else{
            System.out.println("nor a or i is present");
        }

        String email = "MURODIL@cybertekschool.com";

        if (email.contains("@") && email.endsWith(".com")){
            System.out.println("it is correct email");
        }else{
            System.out.println("try again");


            //CHAINING METHOD
        }
        if (email.toLowerCase().contains("d")){
            System.out.println("d is present");
        }else{
            System.out.println("d is not present ");
        }
    }
    }


