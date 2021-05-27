package day14_multi_branch_if_statement;

public class DayActivity {
    //weather sunny rainy snowy windy
    //when sunny- "go to park, hiking and code java"
    //when rainy- :stay home, drink tea and code java"
    //when snowy- "clean the car then build a snowman, drink hot chocolate and code java"
   // when windy- " get ready for power loss, fly a kite and code java"

  // anything else-" just keep coding"
  public static void main(String[] args) {


      String weather = "sunny";

      if (weather.equals("sunny")) {
          System.out.println(weather + " go to park, hiking and code java");
      } else if (weather.equals("rainy")) {
          System.out.println(weather + "stay home, drink tea and code java");
      } else if (weather.equals("snowy")) {
          System.out.println(weather + "stay home, drink tea and code java");
      } else if (weather.equals("windy")) {
          System.out.println(weather + " get ready for power loss, fly a kite and code java");
      } else { System.out.println("just keep coding");
      }
  }
}