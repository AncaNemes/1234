package day51_inheritance;

public class Contractor extends Employee{
    //@MehotdOVRLOADING SAME NAME DIFF PARAM
    //@METHOD OVERRIDIGN SAME NAME SAME PARAM

    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }

    //1)lets everyone know that you are overiding this method
    //2)ensures that this method is being overiden if not i
    @Override
    public double calculateSalary( double hourlyRate){
        return 50 * 40 * hourlyRate;// {between it is called method implementation}



    }
}
