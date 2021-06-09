package day51_inheritance;

public class EmployeeObject {
    public static void main(String[] args) {
Employee developer= new Employee();
 System.out.println("developer .calculateSlary by 55= " + developer.calculateSalary(55.0));
double annualDevSalary= developer.calculateSalary(55.0);
        System.out.println("annualDevSalary = " + Math.round(annualDevSalary));

  Contractor sdetContractor =  new Contractor();
 // sdetContractor.calculateSalary(65);
  double sdetSalary= sdetContractor.calculateSalary(55);
        System.out.println("sdetSalary= "+sdetSalary);
        System.out.println("developer" + developer.toString());
        System.out.println("sdetContractor = " + sdetContractor);
    }
}
