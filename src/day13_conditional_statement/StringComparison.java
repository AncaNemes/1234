package day13_conditional_statement;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Los Angeles";
        if (city.equals ("Los Angeles")) { // or you could use == instead of .equals
            System.out.println("It is LA");}
        else{
            System.out.println("It is not LA");

        }

        String weather = "sunny";
        if( weather.equals ("sunny")) {  // or you could == but not recommanded
            System.out.println("Go outside and code JAVA");} else{
            System.out.println("stay inside and do JAVA");
        }

    }
}
