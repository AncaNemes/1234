package day55_abstraction.exercise_example;

public class FreeWeight extends Lifting {

    // is first non abstract sub class, hats why it must OVERRIDE all inherited abstarct method
    // from Lifting and Exercise


    @Override
    public void perform() {
        System.out.println("Lifting Free Weight dumbbells");

    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 15;
    }


    //these 2 methods @Override above  are being overriden that are from Exercise abstract class
    // for below @Override
    // this method is being overriden that is from Lifting abstract class
    @Override
    public void endLift() {
        System.out.println("carefully re-rack dumbbells");
    }


}
