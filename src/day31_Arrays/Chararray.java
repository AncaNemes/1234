package day31_Arrays;

import java.util.Arrays;

public class Chararray {
    public static void main(String[] args) {
        //char array with following values:
        //'j', 'a', 'v', 'a', ' ', 'i', 's', 'f', 'u', 'n'
   char [] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's',' ', 'f', 'u', 'n'};
   //print each letter using loop

        for(char each: letters){
            System.out.print(each+ " ");
        }
        String sentence =  new String(letters);
        System.out.println("\nsentence = " + sentence);

        String item="wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("intem.Array.length=" + itemArray.length);//
        System.out.println("item.length()=" + item.length());
        //System.out.println(Arrays.toString(itemArray));

        String [] fruits = {"bananas", "apples", "kiwi", "mango"};
         String fruitStr= "";
        for (String each: fruits) {
            System.out.print(each + "-");
            fruitStr +=each +  "-";
        }
        System.out.println("\n fruitStr "+fruitStr);
  String [] languages ={"java", "python","c++", "ruby"};
        Arrays.sort(languages);//it SORTS ALPHABETICALLY
        System.out.println(Arrays.toString(languages));

  String.join("|",languages);
        System.out.println(String.join("|",languages));
        System.out.println(String.join("##",languages));
    String joinedLanguages = String.join(" <> ",languages);
        System.out.println("joined languages"+ String.join(" <> ",languages));

        String str= "git";
        //How to convert str to char [] array
     char letter []  = str.toCharArray();
     //char [] array >>>String
        char [] grades= {'A','B','C','D','E','F'};
        String gradesStr = new String (grades);
       // gradesStr ==>"ABCDE";
        // String [] array >>> Single String with DELIMITER- USED WITH java 8  JOIN
   String [] words ={"one","two","three"};
   String sent = String.join("",words); // remember to have a delimitir in this case we chose  ""
        System.out.println(sent);
    }
}
