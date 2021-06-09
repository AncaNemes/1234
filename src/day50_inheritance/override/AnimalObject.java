package day50_inheritance.override;

public class AnimalObject {
    public static void main(String[] args) {
     Animal animal= new Animal();
     animal.name="orio";
     animal.type="husky";
     animal.speak();

     Cat cat= new Cat();
     cat.speak();

     Dog dog= new Dog();
        dog.speak();

    }
}
