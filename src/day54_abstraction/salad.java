package day54_abstraction;

public class salad extends MenuItem{
    @Override
    public void prepared(){
        System.out.println("chope veggies, and dressing");

    }

    @Override
    public void serve() {
        System.out.println("cold");

    }
}
