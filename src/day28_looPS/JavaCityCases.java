package day28_looPS;

public class JavaCityCases {
    public static void main(String[] args) {
        int totalCases = 0;
       /* loop day =1 till day 30
                evey day there are 200 new cases
            every sunday (day%7==0) there are new cases
                "dai 1" daily case: 200
                print totalCases*/

        for( int day=0; day<=30; day++){
            if(totalCases % 7 == 0){ // sundays more cases
                totalCases +=500;
            }else{
            totalCases +=200;
            }
            System.out.println( "day"+ day +" total case:" + totalCases);
        }
        System.out.println("JavaCity 11/2021 Total Cases: "+totalCases);
    }
}
