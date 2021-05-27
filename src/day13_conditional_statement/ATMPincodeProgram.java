package day13_conditional_statement;

public class ATMPincodeProgram {
    /*
    package day13_conditional_statements
add new class ATMPincodeProgram
main method
print "**** WELCOME TO TD BANK ATM ****"
secretPincode => ****
inputPincode => ****

if condition checks if secretPincode equals inputPincode
    true:
        "Welcome to your account."
        "You can withdraw, check balance, deposit"
    false:
        "Incorrect pincode! 1234"
        "Please try again."
     */
    public static void main(String[] args) {
        System.out.println("****WELCOME TO TD BANK ATM****");
        int secretPincode= 4329;
        int inputPincode= 4329;                         //4309 code wrong it will print out the LESE MESSAGE

        if (secretPincode == inputPincode) {
            System.out.println("Welcome to your account");
            System.out.println("You can withdraw, check balance, deposit");
        } else {
            System.out.println("Incorrect pincode!" + inputPincode );
            System.out.println("Please try again!");

        }
        System.out.println("Thank you for using TD Bank ATM");
}
}