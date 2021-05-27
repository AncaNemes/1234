package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args){
        //title, company, jobDescription, salary, yearsExp, hasBenefits
        String title= "Quality Assurance";
        String company="Tesla";
        String jobDescription="verify quality data for Java, Selenium, Cucumber, JUnit";
        double salary= 125000;
        byte yearsExp= 1;
        boolean hasBenefits=true;
        System.out.println("Title:"+title);
        System.out.println("Company:"+company);
        System.out.println("Job Description: "+jobDescription);
        System.out.println("Salary: "+salary+"$");
        System.out.println("Years exp:"+yearsExp+"y");
        System.out.println("Benefits:"+hasBenefits);
    }
}
