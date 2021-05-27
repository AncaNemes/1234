package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    //location, salary. remote, benefits
    public static void main(String[] args) {

        double salary = 120_000.00;
        boolean isRemote = true;
        boolean benefits = true;

        String location = "Kailua Kona";

        if (location.equals("Kailua Kona") && salary >= 120_000.00 && isRemote && benefits) {
            System.out.println("Offer accepted");
        } else {
            System.out.println("Lets continue exploring");
        }
    }
}