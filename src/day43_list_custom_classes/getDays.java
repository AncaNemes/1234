package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class getDays {
    public static void main(String[] args) {


        System.out.println(getDay());
        //you can store it in a variable  get(0) gives you  your call - exp Monday
       System.out.println( getDay().get(0));
       List <String> dayNames=getDay(); // created a variable to have it

        System.out.println("assigned into a new variable=  " +dayNames);
        dayNames.add("java day");
        System.out.println("added = " +dayNames);

        dayNames.removeIf( day -> day.length() == 6);//lamba the name chose will be for the contidition doe snot need to be declared out od the () exp for day
        System.out.println("after removeIf = " +dayNames);

        System.out.println("getDay().size() = "+getDay().size());

        System.out.println("random list with ten nb"+ getRandomList(10));
        List<Integer> nums= getRandomList(100);
        System.out.println("nums size()"+ nums.size());
        System.out.println("nums= " + nums);
        nums.removeIf(n-> n < 0);//remove nums less thatn 90
        System.out.println("nums .= " + nums);



        /** no pramaeters returns
         * list string
         * return List<String> with "Monday.Tuesday, Wednesday"
         */
    }
    public static List<String> getDay(){
      // List<String> days = new ArrayList<>(Arrays.asList("Monday,Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday"));
       List<String> days= new ArrayList<>();
       days.add("Monday");days.add("Tuesday");days.add("Wednesday");days.add("Thursday");days.add("Friday");days.add("Saturday");days.add("Sunday");
        return days;
    }
    /**
     * getRandomList
     * param int size
     * return List <Integer>
     *     generate random numbers(0-100) the count of the size, and assign to List then return
     *     getRandomList(3) -> 43,12,54
     *     getRandomList(2) ->1,4
     */
    public static List<Integer> getRandomList(int size){
        Random random= new Random(); // new Random object with 0-100 limit
        List<Integer> nums= new ArrayList<>();
       for(int i=1; i<=size; i++){
           //int n = random.nextInt(101);
           // if(!nums.contains(n)){
           // nums.add(n);
           // }
            nums.add(random.nextInt(101)); // + with 0-100 limitgenerate random number and add to the list

        }
        return nums;
    }
}
