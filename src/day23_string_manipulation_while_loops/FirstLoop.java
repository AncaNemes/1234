package day23_string_manipulation_while_loops;

public class FirstLoop {
    public static void main(String[] args) {
// replaced  if with while it keeps running // its repeating the command
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        int apples = 3;
        while  (apples <= 5){  //if
            System.out.println("apples-> "+apples);
            apples++;
        }
        System.out.println("apples = " + apples);
        System.out.println("apples = " + apples);
        while(true){
            System.out.println();
        }
    }
}
