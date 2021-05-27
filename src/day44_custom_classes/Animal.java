package day44_custom_classes;

public class Animal {
    // Animal animal= new Animal;
    // it is a template
    //it is the source
    //instance variable
    //type->"some animal"
    //methods:
    //eat,speak
    String type = "some animal";



    public void eat() {  // if you would write STATIC public static in class Animal Object you would use Animal.eat() bus without the static  lower case animal.eat()
        System.out.println("Animal eating");


    }

    public void sleeps() {
        System.out.println("Animal sleeps");

    }

    public void eat(String food) {
        System.out.println("eating " + food);
    }
    public void speak(){
        System.out.println("speaking");
    }

}