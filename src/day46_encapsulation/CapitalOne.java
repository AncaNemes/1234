package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        //creating a new object Checking Account
        CheckingAccount acc =new CheckingAccount();
        acc.setAccountNumber(123456788899L);
        acc.setBalance(250.23);
        acc.setAccoutHolder("mike smith");
        acc.setType("360 checking");
        System.out.println(acc.toString());

    }
}
