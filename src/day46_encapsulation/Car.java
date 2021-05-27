package day46_encapsulation;

public class Car {
    /*model
    year
    mileage
     */
    //private is an access modifier,
    private String model;
    private int year;
    private int mileage;

    //setter method for model
    public void setModel(String carModel) {
        model = carModel;
    }

    //getter method for model
    public String getModel() {
        return model;
    }

    //setter for year using this.  when we have the same word ad  helps us to find the private
    public void setYear(int year) {
        this.year = year;
    }

    //getter for year
    public int getYear() {
        return year;

    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    //getter for milage
    public int getMileage() {
        return mileage;
    }
       @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
            ", year=" + year +
                    ", mileage=" + mileage +
                    '}';

    }
}