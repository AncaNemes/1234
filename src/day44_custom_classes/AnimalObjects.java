package day44_custom_classes;

public class AnimalObjects {
    public static void main(String[] args) {
//used as a runner
        Animal animal = new Animal();// from the class animal(Animal static class) with the method on the left we can pass  it with the method only we need small letter  does not work with capital
        System.out.println(animal.type);
        animal.eat();
        animal.sleeps();
        animal.eat("grass");
        animal.speak();

        //create new Animal object -cheetajObj
        Animal cheetahObj = new Animal();
        cheetahObj.type= "cheetah";// change value/reassign  to cheetah
        System.out.println(cheetahObj.type);
        cheetahObj.eat("spaghetti");
        cheetahObj.speak();
        cheetahObj.sleeps();


    }


}
