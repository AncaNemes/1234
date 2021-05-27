package day20_string_manipulation;
import java.lang.*;

public class StringIsEmpty {
    public static void main(String[] args) {

        String car ="lexus";
        System.out.println(car.isEmpty());

        String city="";

        System.out.println(city.isEmpty());// true
        System.out.println(city.length()); //0
        System.out.println(city.equals("")); //true
        System.out.println(city.equalsIgnoreCase(""));

String jobTitle="";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length()==0);
        System.out.println(jobTitle.equals(""));
        if (jobTitle.isEmpty()){
            System.out.println("JobTitle is missing, please resend");
        }else{
            System.out.println("Job title looks good");
        }

        if (jobTitle.length()== 0){
            System.out.println("jobTitlen is empty");
        }else{
            System.out.println("jobtitle is not empty");
        }
        System.out.println(jobTitle.equals(""));

        if("".equals(jobTitle)) {
        } else{
                System.out.println("job title is not emptyy");
            }

        String word = " ";// has an empty space in -RESPECT THE SPACE
        System.out.println(word.isEmpty());//false
        System.out.println(word.length());//1. blank space is a character

        String veggie = "carrots";
        System.out.println(veggie.isEmpty());// false

        //if veggie is not empty print we have carrots

        if(!veggie.isEmpty());
        System.out.println("we have "+ veggie);

        /*String  word6;
        System.out.println(word6.isEmpty());// ERROR NOT INITIALIZED */

        String word7 = "java";
        System.out.println(word7.contains("v")); //true
        System.out.println(word7.contains("va"));//true
        System.out.println(word7.contains("ja"));//true
        System.out.println(word7.contains("a"));//true
        System.out.println(word7.contains("jv"));//false
        System.out.println(word7.contains("Ja"));// false
    }
    }
