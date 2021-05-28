package day47_constructor;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress= new Address();// calling the constructor from other class automatically
        cybertekAddress.setStreet("7925 Jones branch drive");
        cybertekAddress.setCity("Mclean");
        cybertekAddress.setState("Illinois");
        cybertekAddress.setZipcode("60659");
        System.out.println("cybertek school address " +cybertekAddress.toString());

        cybertekAddress.setStreet("str lucian blaga bl 81 apt 8, sebes, romania, 60689");
        System.out.println("address after update" +cybertekAddress);
        System.out.println("street info " +cybertekAddress.getStreet());

        Address newAddress= new Address();
        newAddress.setStreet("7921 jones branch dr suite 200");
        newAddress.setCity("McLean");
        newAddress.setZipcode("22101");
        System.out.println(newAddress.toString());

    }
}
