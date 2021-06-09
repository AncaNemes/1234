package day50_inheritance.override;

import day44_custom_classes.Animal;

public class Cat extends Animal {
    public void jump(){
        System.out.println("jump");
    }
    @Override
    public void speak(){
        System.out.println("cat is sayign meow");
    }
}
