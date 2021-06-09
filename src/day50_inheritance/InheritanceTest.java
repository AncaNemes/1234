package day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1= new Person();
        p1.name="Anca";
        p1.age=30;
        p1.talk();
        p1.walk();
        p1.work("SDET");

Teacher t1= new Teacher();
t1.teacherID=1234;
t1.name="Saim";
t1.age=28;
t1.talk(); // talk is not in teacher but it got it from the parent InhertianceTest


        Student student = new Student();
        student.name="Ana";
        student.age=33;
        student.walk();
        student.talk();
        student.work("java programming");
        student.school="cybertek school";
       // student.study="";


    }
}
