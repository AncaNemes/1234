package day16_switch;

public class ApartmentLease {
    public static void main(String[] args) {
       int numberofBedrooms=0;//2-3
        int startingPrice=0;
        numberofBedrooms=2;
        numberofBedrooms=1;


        switch(numberofBedrooms){
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice=1500;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice=1790;
                break;
            case 2:
                System.out.println("Two apartment selected");
                startingPrice=1890;
                break;
            default:
                System.out.println("5 bedroom currently unavailable");
        }
        System.out.println("Starting price 1500");

        String result;
        int score=90;

        if(score>60){
            result="Pass";
        }else {
            result="Fail";
        }

        boolean isGreen= true;
        String action;
        if(isGreen){
          action="drive";
        } else{
            action="stop";
        }
        String actionI= (isGreen)?"Drive":"stop";
    }
}
