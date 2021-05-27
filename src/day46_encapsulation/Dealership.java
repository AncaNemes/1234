package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        //create car object
        Car car1 =  new Car();
       // errors below model and year are private can not

        //car1.model = "Nissan Altima";
        //car1.year = 2020;
        car1.setModel("Nissan Altima");
        System.out.println(" car1.getModel() = " +  car1.getModel());

        
        car1.setYear(2020);
        System.out.println("car1.getYear() = " + car1.getYear());

        car1.setMileage(2026780);
        System.out.println("getmileage = " + car1.getMileage());
        System.out.println(car1.toString());
        System.out.println(car1);


        Car alfaRomeo = new Car();
        alfaRomeo.setModel("alfaRomeo");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(32456);

        System.out.println("model = "+alfaRomeo.getModel());
        System.out.println("year =" +alfaRomeo.getYear());
        System.out.println("mileage = " +alfaRomeo.getMileage());
        System.out.println(alfaRomeo.toString());
        System.out.println("all in one "+alfaRomeo);
    }
}
