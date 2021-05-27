package day16_switch;

public class CapuccinoBuyer {
    public static void main(String[] args) {
        String size="tall"; //grande, venti price=3.69 calories 90 cal
        double price= 0.0;
       int calories= 0;
       size = "grande";

      switch (size) {
        case "tall":
            System.out.println( "Tall cappucino please");
            price= 3.69;
            calories= 90;
            break;
            case "grande":
              System.out.println( "Grande cappucino please");
                price= 3.99;
                calories= 120;
              break;
          case "size":
              System.out.println( "Venti cappucino please");
              price= 4.10;
              calories= 150;
              break;
          default:
              System.out.println("We do'nt serve that "+ size+" of Cappuccino");
      }
        System.out.println("Total price: " + price);
        System.out.println("You will consume "+ calories +"this evening ");

    }
}
