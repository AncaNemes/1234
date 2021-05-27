package day46_encapsulation;

public class CheckingAccount {
    //encapsulated data:
    // balance, accountNumber, accountHolder, savings

    private double balance;
    private long accountNumber;
    private String accoutHolder;
    private String type = "checking";//default is checking we can change if needed using a setter


    //right click - generate getter and setter , to select all shift and click also on last to

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccoutHolder() {
        return accoutHolder;
    }

    public void setAccoutHolder(String accoutHolder) {
        this.accoutHolder = accoutHolder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
