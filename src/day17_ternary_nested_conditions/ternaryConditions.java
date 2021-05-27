package day17_ternary_nested_conditions;

public class ternaryConditions {
    public static void main(String[] args) {
        //ternary condition
        //dataType variableName=(boolean expression)? trueValue:falseValue;
        //examples

        int score = 70;
        String result = (score>60) ?"pass" :"fail";
        System.out.println(result);

        // int score=25
       //no value
        // String result;
        // if (score>60){
        // result = "Pass"
        // }else {result="Fail"
        // }

        String quality = "good";
        int X= (quality.equals("good")) ? 100:0;
        System.out.println(X);

        //

        char grade = ( score>90) ? 'A' :'B';
        String evenOdd = ( score%2==0) ? "even" : "odd";
        System.out.println(grade);
        System.out.println(evenOdd);
        /*
        if(score .)
         */
        int hourlyRate=35;
        String reply;
        if(hourlyRate>45){
            reply ="accept";
        }else{
            reply="reject";
        }

        String rate=hourlyRate>45? "accept" : "reject";

        //String todayClass= "java";
        //String teacher= "-Muradil-Saim";

       // if(todayClass.equals("java")){
          //  teacher="Muradil";
      //  }else{
         //   teacher= "Nadir";
     //   }

        String todayClass= "java";

        String teacher = (todayClass.equals("java"))? "Muradil":"Nadir";

        boolean isEligibletoDrive =true;
        //have DL,Can Drive No DL cannot drive

        String drive=isEligibletoDrive ? "wes, haveDL, CanDrive": "NoDL, Can not drive";
        System.out.println("driving" + drive);


    }

}
