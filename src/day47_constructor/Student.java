package day47_constructor;

public class Student {

    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //no args constructor
    public Student(){
        System.out.println("no args constructor");
    }
    // constructor with 1 param : String name

    public Student (String name){
        System.out.println("name param constructor | name = " +name );

    }
    public Student (String name, int age){
        System.out.println("name param constructor " +name+age);
    }


}
