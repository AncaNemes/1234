package day54_abstraction;

public class School {
    public static void main(String[] args) {
       // Student student= new Student(); // ERROR WE can NOT create object of Student
      //   student.attendClass();

        OnlineStudent onlineStundent= new OnlineStudent();
        onlineStundent.attendClass();

        CampusStudent campusStudent= new CampusStudent();
        campusStudent.attendClass();
        
        }
    }

