package day18_conditions_practice_strings_intro;

public class CarLease {
    public static void main(String[] args) {
        /*Make Mercedes
        Model E leasePrice=500
        Model  A leasePrice= 400
        Make Audi
        Model SQ5 leasePrice=550
        Model A3 lease Price=412

         */
        String make= "Mercedes";
        String model= "E";
        double leasePrice= 500.0;

        if (make.equals("Mercede") && model.equals("E")){
            leasePrice = 500.0;
        } else if (make.equals("Mercedes")&& model.equals ("A")){
            leasePrice=400.0;

    }
        /*nested example
        if (make.equals(Mercedes)){
        }if (model.equals("E")){
        leasePrice=500.0;
        }else if (model.equals("A")){
        leasePrice= 400.0
        }else{
          System.out.println("Invalid make")*/

        System.out.println("make: "+make);
        System.out.println("model: "+model);
        System.out.println("Lease Price: "+leasePrice);
    }

}
