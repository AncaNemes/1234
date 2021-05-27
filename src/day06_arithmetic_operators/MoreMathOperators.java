package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args){
        int toyotas=431;
        int honda=233;
        int vw=2;
        int tesla=20;
        int nissan=1;
        int audi=155;
        int totalCarsinParking=toyotas+honda+vw+tesla+nissan+audi;
        // or in one line example -> int toyotas=431, honda=233, vw=2, tesla=20, nissan=1, audi=155;

        //total cars in parking-should equal all of those
        //output There are ---- cars in parking lot
        System.out.println("There are "+totalCarsinParking+" cars in parking lot");


// we ordered hawaiian pizza with 8 slices, 4 people ate 2 slices each.

        String pizza="veggie";
        int slices=8;
        int people=4;
       int slicesPerPerson=slices/people;
       // there are 2 slices per person
       System.out.println("There are "+slicesPerPerson+" per person");

       System.out.println("We ordered "+pizza+" pizza"+" with "+ slices+" slices, for "+people+ " people.");
    }
}
