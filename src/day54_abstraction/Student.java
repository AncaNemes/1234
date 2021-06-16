package day54_abstraction;

public abstract class Student {
//instantieted -can not create object of Student class- meaning :
    //we add abstract keyword to a class to make it an abstract class
   // Student student = new Student(); will show  ERROR
    // what can we di with Studnet class? we can extend this class by sub class
    //stundet class will Parent class for all other types of student related classes

    public void code( String language){
        System.out.println("stundet is coding using " + language);
    }
    /*
     + we can add abstract methods into abstract class
     +  abstract method is created using abstract keyword
     + and does not have the implementation/method body
     +
     */
public abstract void attendClass();


}
