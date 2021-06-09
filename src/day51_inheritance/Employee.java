package day51_inheritance;

public class Employee {

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }

    /*  Employee
        String jobTitle;
        ->calculate salary
        (double hourlyRate)
        returns annual salary plus 10% bonus
       -> Contractor
       ->calculateSalary(double hourlyRate)
       return annual hours*hourlyRate

      */
String jobTitle;
public double calculateSalary(double hourlyRate){
    return 52 * 40 * hourlyRate * 1.1;


}
}

