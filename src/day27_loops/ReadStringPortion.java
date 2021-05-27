package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {
        String list= "cat,car,red car,selenium";
        //using substring print first 3 letters
      //  System.out.println(list.substring(0,3));

        for (int i = 0; i<list.length()-2;i++){
           System.out.println(list.substring(i, i+3));
            if(list.substring(i, i+3).equals("cat") ||list.substring(i,i+3).equals("car"));{}
            System.out.println("cat/car found");
        }
        /*for (int i = 0; i<list.length()-2;i++){
        String part= list.susbtring(i, i+3);
        System.out.println("part="+part);
        if(part.equals("cat)|| part.equals()"car)){
        System.out.println("cat or cat found")}
         */
    }
}
