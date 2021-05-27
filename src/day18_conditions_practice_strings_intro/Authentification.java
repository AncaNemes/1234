package day18_conditions_practice_strings_intro;

public class Authentification {
    public static void main(String[] args) {
        int last4SSN= 4321, pinCode=0000, expLast4SSN=4324 , expPinCode=0000;

        if (last4SSN==expLast4SSN && pinCode==expPinCode){
            System.out.println("Authentification succesful");
        }else {  System.out.println("Wrong-try again!!");

        }
            if(last4SSN!=expLast4SSN ){
            System.out.println("Wrong input-incorrect");
        }
    }
}
