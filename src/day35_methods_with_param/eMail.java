package day35_methods_with_param;

public class eMail {
    public static void main(String[] args) {
        buildEmail("anca83", "@gmail.com");
        buildEmail("romania","@microsofteam.org");
        buildEmail("john Wand 3","verison");
    }
    public static void buildEmail(String name, String domain){
         name= name.replace(" ","_").toLowerCase();
       String email = name+"@"+domain +".com";
        System.out.println(email);
    }
}
