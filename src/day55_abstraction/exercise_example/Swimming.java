package day55_abstraction.exercise_example;

import day55_abstraction.exercise_example.Exercise;

public class Swimming extends Exercise {
    //swimming is concrete class-sub class of abstract Exercise parent class, it is showing errors
    // because we have abstract methods  in parent class that Swimming MUST OVERRIDE

    @Override
    public void perform() {
        System.out.println("Performing swimming in pool or ocean");

    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 11;
    }

}
