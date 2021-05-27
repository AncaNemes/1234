package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;
       //while isHungry && bananas!=countToFull

        //it takes 3 bananas for isHungry to be set to false

        while (isHungry ){
        bananas++;
            System.out.println("eat bananas" +bananas);
         if (bananas == countToFull){
        isHungry=false;
        // bananas +=1;
         }
        }
        System.out.println("had enough bananas lets get back to study");
    }
}
