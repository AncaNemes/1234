package day50_inheritance.override;

public class Dog extends Animal{
    public void run(){
        System.out.println("Dog is running");

    }

    // it is @override-we use it to let others know we are using it and to make sure we are overriding, has to be inherited
    public void speak(){
        System.out.println("dog is barking hammm");
    }
}
