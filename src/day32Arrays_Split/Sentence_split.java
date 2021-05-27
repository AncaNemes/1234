package day32Arrays_Split;

public class Sentence_split {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String [] words = sentence.split(" ");
        System.out.println("1st word= " + words[0]);
        System.out.println("2nd word= " + words[1]);
        System.out.println("3rd word= " + words[2]);
      //  System.out.println("4th word= " + words[3]);-- out OF BOUND
   for (String w:words){
       System.out.println(w);
   }

        System.out.println("new practice  ******************");

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String [] newResult = googleResult.split(" ");
        System.out.println(newResult[0]);
        System.out.println(newResult[1]);
        System.out.println(newResult[2]);
        System.out.println(newResult[3]);
        System.out.println(newResult[4]);
        System.out.println("count " + newResult[1]);
        System.out.println("seconds" + newResult[3].replace("(","") );
        System.out.println("seconds version two " + newResult[3].substring(1));


    }
}
