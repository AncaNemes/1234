package day43_list_custom_classes;

//first name and age

public class Person {
    String firstName;
    int age;
    char gender;
    //behavior- method of the class
    public void speak(){ // because void method does not need sout- when you call from the object -speak is an BEHAVIOR
        System.out.println("person is speaking");
    }

}

class People{
    public static void main(String[] args) {
        //create object of Person class-Instantiate Person Class
        Person person1= new Person();
        person1.firstName = "Bob";
        person1.age = 33;
        person1.gender = 'M';
        person1.speak();
        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println("gender " + person1.gender);

        Person person2= new Person();
        person2.firstName="Mike";
        person2.age= 12;
        person2.gender = 'M';
        person2.speak();
        System.out.println(person2.firstName);
        System.out.println(person2.age);

        System.out.println("person1" + person1.firstName);
        System.out.println("gender "+person2.gender);
    }
}