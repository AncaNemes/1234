package day43_list_custom_classes;

public class Company {
    //add 3 object of Employee
   // assigne name and ajob titles
   // call method
        public static void main(String[] args) {

            Employee employee1= new Employee();
            employee1.name = "Anca ";
            employee1.jobTitle = "SDET ";
          //  employee1.age = 38;
            employee1.work();
          //  System.out.println("employees 1"+employee1.name+ employee1.age+ employee1.jobTitle);

            Employee employee2= new Employee();
            employee2.name = "Ana";
            employee2.jobTitle = "full stack developer";
          //  employee2.age = 30;
            employee2.work();
           // System.out.println("employees 2"+employee2.name+ employee2.age+ employee2.jobTitle);

            Employee employee3= new Employee();
            employee3.name = "AnKara";
            employee3.jobTitle = "tester";
         //   employee3.age = 28;
            employee3.work();

        }
    }

