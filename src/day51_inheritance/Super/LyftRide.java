package day51_inheritance.Super;

public class LyftRide {
    public static void main(String[] args) {

        Lyft lyftRide= new Lyft();
        LyftXL lyftXLRide = new LyftXL();
        LyftLux luxRide= new LyftLux ();

        System.out.println("lyft ride for 5 miles  =$ "+lyftRide.calculateRate(5));
        System.out.println("lyftXLRide for 5 miles = $" +lyftXLRide.calculateRate(5));
        System.out.println("lyftLux for 5 miles $= " + luxRide.calculateRate(5));

    }
}
