package day37_Overloding;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(1));
        System.out.println(getDayName(5));
        System.out.println(getDayName(9));
    for (int a=1; a<= 8; a++){
    System.out.print(" day = "+ getDayName(a));
        System.out.println();
    String today =getDayName(7);
        System.out.println("today is "+today);
        String someDay=getDayName(0);
        if(someDay == null){ ///someDay.equals(null)
            System.out.println("someDay is null for invalid day");
        }


    //store getDayName into variable, and print variable;




}
    }
    public static String getDayName(int day) {

        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "sunday";
            default:
                System.out.println("ERROR Invalid day" + day);
                return null;
        }

        }
    public static String getDayNameV1(int day){
        String dayName;

        switch(day){

            case 1: dayName="Monday";
                break;
            case 2: dayName="Tuesday";
                break;
            case 3: dayName="Wednesday";
                break;
            case 4: dayName="thursday";
                break;
            case 5: dayName="Friday";
                break;
            case 6: dayName="Saturday";
                break;
            case 7: dayName="sunday";
                break;
            default:
                System.out.println("Invalid day"+ day);
                dayName=null;
        }
        return dayName;
    }
    }
