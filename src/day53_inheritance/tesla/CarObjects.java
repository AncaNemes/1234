//package day53_inheritance.tesla;
//
//public class CarObjects {
//    public static void main(String[] args) {
//        ElectricCar ec1= new ElectricCar("Tesla","Y",48190.0,2021,326 );// remember to put parameters excactly as in the ElectricalCar
//        ec1.drive(50);
//        System.out.println(ec1.toString());
//       // System.out.println(ec1.make); ERROR mak is private
//       // System.out.println(ElectricCar.make);
//
//        System.out.println("ec1 make= " + ec1.getMake());
//        System.out.println("ec1 model= " + ec1.getModel());
//        System.out.println("ec1 price= " + ec1.getPrice());
//        System.out.println("ec1 year= " + ec1.getYear());
//        System.out.println("ec1 range= " + ec1.getRange());
//        if(ec1.getPrice()>10000){
//            System.out.println(ec1.getMake()+" - " + ec1.getModel() +" is out of my budget");
//
//        }else{
//            System.out.println("purchasing " +ec1.toString());
//        }
//        System.out.println(ElectricCar.getCount());
//
//
//
//        ElectricCar ec2= new ElectricCar("Tesla", "Cybertruck",59900.0 ,2022,300);
//        System.out.println(ec2.toString());
//      //  System.out.println(ElectricCar.getCount());
//
//        System.out.println("count =" + ElectricCar.getCount());
//        System.out.println("count= " + ec2.getCount());
//        System.out.println("count= "+ElectricCar.getCount());// call static method using Class name
//
//        Roadster roadster= new Roadster("Roadster", 200000.0,2022, 620);
//        System.out.println(roadster.toString());
//        roadster.drive(1000);
//        roadster.drive(600);
//        System.out.println(roadster.getCount());
//
////        ModelX myModelX= new ModelX("Tesle","Model X", 89990.0,2021, 360);
////        System.out.println();
////        myModelX.drive(10);
////        System.out.println("Having lunch");
////        myModelX.drive(10);
////        System.out.println("Range remaining: " +myModelX.getRange);
////        System.out.println("total electric cars count:" +ElectricCar.getCount());
//
//    }
//}
