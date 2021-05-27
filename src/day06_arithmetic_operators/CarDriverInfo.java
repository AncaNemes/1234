package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
        //carModel-string
        //driverName-string
        //licenseNum-string
        //speed-short
        //isAutomatic-boolean
        //classLicense-char
String carModel="Tesla";
String driverName="Nemes Anca";
String carModel2="Audi8";
String licenseNum="letsmakejava:12345";
Short speed=250;
boolean isAutomatic= true;
char classLicense= 68;// or you can write the letter between '' exp   'D'
System.out.println(carModel+" is the car model");
        System.out.println("Name: "+driverName);
        System.out.println("License number:"+licenseNum);
        System.out.println("Car speed:"+speed);
        System.out.println("Car is automatic:"+isAutomatic);
        System.out.println("Class license:"+classLicense);
        System.out.println(driverName+" is driving the car!");
        System.out.println(driverName +" is driving "+carModel2);
System.out.println(speed);
        System.out.println("Current speed: "+speed+" mph");
        System.out.println("Is automatic: "+isAutomatic);
        System.out.println(classLicense);

String city="Baltimore";
int population=1200000;
System.out.println(city+population);

//the above works fine since the city is String. We do not have to always use"" double quotes//

System.out.println(10+5);
    }
}
