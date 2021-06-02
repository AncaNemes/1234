package day47_constructor;

public class StudentObjects {
    public static void main(String[] args) {
        Student st1= new Student(); // runs no-args constructor
        Student st2 =  new Student();// runs no args constructor

        Student st3 = new Student("Anca");
        Student st4 =  new Student("John");
        Student st5= new Student("Nasiba ",26);

        Student st6= new Student();
        st6.setName("Francesca");
        st6.setAge(25);

        Student st7= new Student();

        Student st8 =new Student("Francesco");

    }


}
