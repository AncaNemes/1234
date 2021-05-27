package day23_string_manipulation_while_loops;

public class WhileLoopReverse {
    public static void main(String[] args){
        int count = 5;

        while (count >= 0) {
        System.out.println("great counting" + count);
        count--;
        }
        System.out.println("no more count");

        int unreadSMS = 10;

        while (unreadSMS >0  ) {
            System.out.println("Reading \uD83D\uDCE5 " + unreadSMS);
            unreadSMS--;
        }
        System.out.println("  finished to read emails");
    }
}
