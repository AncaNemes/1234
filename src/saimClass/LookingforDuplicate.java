package saimClass;

public class LookingforDuplicate {
    public static void main(String[] args) {
        String word = "mohammad";

        System.out.println(nonDup(word));
        System.out.println(word.indexOf("mm")); //output:4 input ('m') output 0
    }

    public static String nonDup(String name) {
        String output = "";
        for (int i = 0; i < name.length(); i++) {
            if (output.contains("" + name.charAt(i))) { /// you concatenate it with ""  as we have a string to concatenate it with PRIMITIVE you need to concatenate it
               continue;

            }else {
              output += name.charAt(i);
            }
        }
        return output;
    }
}
