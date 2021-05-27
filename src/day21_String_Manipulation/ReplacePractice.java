package day21_String_Manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
       // word = "git";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub", "lab"));// it will print it temporarly
        System.out.println("word =" + word);

        word= word.replace("hub","lab");
        System.out.println( "word = " +word); //it was assigned


        // gitlab: i ->o and   a->i into gotlib

       // word.replace("i","o");
        System.out.println( word.replace("i","o").replace("a", "i"));// chaining

        String sentence= "java is fun";
       // String withNoSpaces = sentence.replace(" ","");
       // System.out.println(withNoSpaces);

       // java/selenium  - fun=a lot of fun  assign back to variable without space
         sentence= sentence.replace("java","selenium").replace("fun","a lot of fun").replace(" ","");
        System.out.println(sentence);

        String result = "1-48 of over 4,000 results for \"java book\"";
       result= result.replace("1-48 of over","")
                     .replace(",","")
                     .replace("results for \"java book\"","");
        System.out.println("result = " + result);
    }
}
