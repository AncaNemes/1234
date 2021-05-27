package day30_Arrays;

public class StudentArray {
    public static void main(String[] args) {
        /*id index -0
        firstName 1
        lastName 2
        batchNum 3
        phoneNum 4
         Declare student array and store5 String values */

        String [] student1 =  new String[5]; //when you  do not know the value
        student1[0]="1234";
        student1[1]= "Adam";
        student1[2]="Jordan";
        student1[3]="22";
        student1[4]="3129185444";

        String []studentTWO= {"123","Madam", "Winter", "22","7039185444"};// when you know the value
        System.out.println("Student id " + student1[0]);
        System.out.println("Student first " + student1[1]);
        System.out.println("Student last name " + student1[2]);
        System.out.println("Student batch " + student1[3]);
        System.out.println("Student phone number " + student1[4]);
        System.out.println("student data length"+student1.length);
        // chekc if student data array contains 5 items
        // true: student 1 data array has correct length
        // false : data array has incorect length

        if(student1.length==5){
            System.out.println("true: PASSS data array contains 5 items");
        }else{
            System.out.println(" FALSEE: data array doesn t contain 5 array");
        }
        /**
         check if student1 and student2 arrays have same number of data
         TRUE: PASS: data arrays length match
         FALSE: FAIL: data arrays length mismatch
         */
        if(student1.length==studentTWO.length){
            System.out.println("true: PASS data array contains 5 items");
        }else{
            System.out.println(" FALSE: data array doesn t contain 5 array");
        }
        // print upper case first and last name

        System.out.println(studentTWO[1].toUpperCase() +"\t"+ studentTWO[2].toUpperCase());
     int  [] nume={22,55,11};
    for (int i=0 ; i<nume.length; i++) {
        System.out.println(nume[i]);
        // output22-55-11
    }
    }
    }
