package day55_abstraction;

public abstract class Exercise {
    public void start(){
        System.out.println("warming up and starting the exercise");

    }
    /**
     * abstract method= method without body/implementation
    *  purpose - letting subclasses implement/override their own way
     */

    public abstract  void perform();
    /*
    *another abstract method that concrete subclasses will override/implement
    @param minutes- how  long is the exercise is performed
    @return number of calorie burned/used
     */
    public abstract int getCaloriesCount(int minutes);

}
