package day19_class_vs_object_strings;

public class LengthOfTheStrength {
    public static void main(String[] args) {
        //length() method is String class, returns the count of the character in the string
        String word = "java";
        System.out.println(word);
        System.out.println(word.length()); //4
        System.out.println("counting:" + word.length()); //4

        System.out.println("wooden  spoon".length()); // including the spaces between wooden spoon counting

        String firstName = "AncaNEmes";
        System.out.println(firstName +  "-" + firstName.length()); //
        
        int count=firstName.length();
        System.out.println("count = " + count);

        String  passcode = "abc123";// if you change passcode with "hello"-has only 5 characters with go to else

        // at least 6 characters print valid passcode
      //  else
           // print password too short
        if(passcode.length() >=6){
            System.out.println("Valid amazon passcode");
        }else{
            System.out.println("Password to short");
        }
        
    }
}
