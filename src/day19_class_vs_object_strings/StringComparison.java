package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        //string variable city and assign value

        String city = "Chicago";
        System.out.println();
       // equals();
      //f  equalsIgnoreCase();
        System.out.println(city.equals("Chicago")); // true
        System.out.println(city.equals("chicago")); // false
        System.out.println(city.equals("chicago ")); // false

        //EQUALIGNORECASE()-case insensitive comparison
        System.out.println(city.equalsIgnoreCase("Chicago"));//true
        System.out.println(city.equalsIgnoreCase("CHICAGO"));//TRUE
        System.out.println(city.equalsIgnoreCase("CHIcaGO"));//TRUE
        System.out.println(city.equalsIgnoreCase("CHIicagO"));//false
        System.out.println(city.equalsIgnoreCase("CHIi cagO"));//false


        if(city.equals("Chicago")){
            System.out.println("equals() true");
        } else{
            System.out.println("equals() false");
        }
        if (city.equalsIgnoreCase("CHICAGO")){
            System.out.println("equalsIgnoreCase() true");
        } else {
            System.out.println("equalsIgnoreCase() false");
        }
    }
}
