package day54_abstraction;

//this is a sublcass of MEnuItem
public class pizza extends MenuItem {


    @Override
    public void prepared() {
        System.out.println("dough, sauce, cheese, veggies");

    }

    @Override
    public void serve() {
        System.out.println(" hot and fresh, in a box, sliced");
    }
}
