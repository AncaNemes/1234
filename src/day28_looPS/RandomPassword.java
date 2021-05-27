package day28_looPS;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcderfghyjklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
        Random random = new Random();
        //random.nextInt(21);
        String password="";


        for (int i = 1; i <= 8; i++) {
            int index=random.nextInt(68);// random num 0-66
            System.out.print(source.charAt(index));
            // source.substring(index,index+1)
            //
          //  System.out.println(random.nextInt(source.length()));
            password +=source.charAt(index);
        }
        //main(null);
        System.out.println("\n your password: " + password);
        }
    }
