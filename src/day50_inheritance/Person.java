package day50_inheritance;

public class Person {
    String name;
    int age;
    public Person(){}//  this is a constractor do onot worry about it with inheritance for now


    public void walk(){
        System.out.println("walk");
    };
    public void talk(){
        System.out.println("talk");
    }
    public void work(String job){
        System.out.println("work");
    }

}
