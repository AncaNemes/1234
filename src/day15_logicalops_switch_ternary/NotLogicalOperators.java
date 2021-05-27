package day15_logicalops_switch_ternary;

public class NotLogicalOperators {
    public static void main(String[] args) {
        System.out.println("! true = " + (!true));
        System.out.println("! false = " + (!false));

        int age =2;
        age = 12;

        if (!(age > 7)) {
            System.out.println("Need to sit child in car seat " + age);
        } else{
            System.out.println("Can sit with sit belt only at age : " + age);
        }
         boolean isSmokingAllowed = false;
        // if snokinf is not allwed print nessage" Smoking is not allwed here.Exit"

        if( !isSmokingAllowed){
            System.out.println("Smoking is not allowed here.Exit");
        } else{
            System.out.println("This area is for smoking");
        }


        boolean isAffordable = true;
        isAffordable=false;

        if(!isAffordable) {
            System.out.println(isAffordable + " Item not affordable");
        }

        String carModel ="Tesla";
                if(!carModel.equals("Tesla")){
                    System.out.println("Not interested, thank you");
                }

                String  secretPassword = "abc123";
                String inputPassword = "abc321";

                if(!secretPassword.equals("abc123")){
                    System.out.println("Incorrect password");
                }

        if (!inputPassword.equals(secretPassword)) {
            System.out.println("Incorrect password");}

        if(inputPassword!=secretPassword){
            System.out.println("incorect password");
        }

        
        }
    }

