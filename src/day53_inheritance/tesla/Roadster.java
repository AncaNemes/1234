package day53_inheritance.tesla;

public class Roadster extends ElectricCar{

    public Roadster( String model, double price, int year, int range) {
        super("Tesla", model, price, year, range);// make replaced with Tesla
        System.out.println("Welcome new Roadster");
        //initialy gave error as parent class Electric Car had no constructor by default and was read
        // click on it and gave us the otpion to create constructor
        //give me same constructor for Roadster like we have for ElectricCar
    }
}
