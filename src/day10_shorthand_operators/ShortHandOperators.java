package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars=10;
        System.out.println("cars in parking lot="+cars);
        cars=cars+2;
        System.out.println("New number of cars " + cars);
        cars +=5;
        System.out.println("New numbers of cars " + cars);
        cars-=6;
        System.out.println("Cars in the parkign lot" + cars);// used SHORTHAND

        cars= cars-1;
        cars-=1;
        System.out.println("cars in the parking lot = " + cars);

        int electricCArs =13;
       cars = electricCArs+ cars;
        System.out.println("cars in the parking lot = " + cars);
        cars+=electricCArs;
        System.out.println("cars in the parking lot = " + cars);
        
        String  word="Java";
        System.out.println("word = " + word);
        
        word=word+" programming";
        System.out.println("word = " + word);
        // add"is fun"
        word+= " is fun";
        System.out.println("word = " + word);
        
        String selenium= " but selenium is more fun";
        word+=selenium;
        System.out.println("word = " + word);
        word+=12345;
        System.out.println("word = " + word);
        
        char letter= 'A';
        System.out.println("letter = " + letter);
        letter+=3;
        System.out.println("letter = " + letter);
        // add letter'J'
        letter+=1;
        System.out.println("letter = " + letter);
        
        double parkingFee =7.50;
        System.out.println(" Normal parking Fee = " + parkingFee);
        //early bird fee is 50% off
         parkingFee/=2;
        System.out.println("Early bird parkingFee = " + parkingFee);
        parkingFee-= parkingFee; // parkingFee= ParkingFee-parkingFee;
        System.out.println("parkingFee = " + parkingFee);




    }
}
