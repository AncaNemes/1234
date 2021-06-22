package day55_abstraction.interface_demo;

public interface MyInterface {
  public abstract void learn();


}
interface MyInterface2{

}

class MyClass implements MyInterface, MyInterface2{

    @Override
    public void learn() {

    }
}
class Main{
    public static void main(String[] args) {
      //  MyInterface myInterface= new MyInterface(); // ERROR  because interface can not be instantiated, cannot creae OBJECT
        MyClass myClass =  new MyClass();

    }
}