package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args){
        //variables
        //brand, model, color, price, storage, hasCamera

        String brand="Samsung 12";
        String model=" Note ";
        String color=" Pink ";
        double price=500.01;
        int storage=100; //or short if want to use less memory
        boolean hasCamera= true;
        System.out.println(brand);
        System.out.println(model);
        //with message
        System.out.println("My phone:"+brand+model+color+price+storage+hasCamera);
// with message
        System.out.println("Brand is "+brand);
        System.out.println("Model is "+model);
        System.out.println("Color is "+color);
        System.out.println("Price is $ "+price);
        System.out.println("Storage is "+storage+" GB");
        System.out.println("Has camera?-"+hasCamera);

    }

}
