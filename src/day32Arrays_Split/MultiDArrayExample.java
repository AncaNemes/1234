package day32Arrays_Split;
import java.util.*;
public class MultiDArrayExample {
    public static void main(String[] args) {
        String [][]users = new String [3][2]; //  0--TeodoraTsvetanov TeodoraPWD12
                                             //   1--Anna Ziyayeva AnnaAlmaty123
                                             //   2--Parvin Altae ParvinVienna123//
        users[0][0] = "TeodoraTsvetanov ";
        users[0][1] = "TeodoraPWD12";
        users[1][0] = "Anna Ziyayeva ";
        users[1][1] = "AnnaAlmaty123";
        users[2][0] = "Parvin Altae ";
        users[2][1] = "ParvinVienna123";// long way

                                   //0                 //1
        String [][] userdata={{"TeodoraTsvetanov ","\"TeodoraPWD12\""},//0
                               {"Anna Ziyayeva ","AnnaAlmaty123"},     //1
                               {"-Parvin Altae", "ParvinVienna123"}};  //2

        System.out.println("__print names___");
        System.out.println(  users[0][0]);//.split("")[0]-to split by first name only
        System.out.println( users[1][0]);
        System.out.println( users[2][0]);


        System.out.println("__ print passwords___");
        System.out.println(users[0][1]);
        System.out.println(  users[1][1] );
        System.out.println( users[2][1]);

        System.out.println(Arrays.deepToString(userdata));
    }
}
