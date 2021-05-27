package day37_Overloding;
import sun.security.util.Password;



public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("Cybertekstudent", "abc123");//positive test//sunny day
        loginVoid("cybertek", "answer"); //rainy day testing
        loginVoid("", "");
        //  System.out.println(loginVoid("cybertekStudent","abc123"));// ==>error void =no return
        System.out.println(login("cybertekStudent", "abc123"));
        if (login("cybertekStudent","abc123")) {
            System.out.println("login succesful, wlecom to canvas");
            System.out.println("select the course to contiue");
        } else {
            System.out.println("login failed");
        }
        boolean isLoginSuccess = login("nadir", "mountain");
        System.out.println("isLoginsuccess=" + isLoginSuccess);
        if (login("nadir", "mountain")) {
            System.out.println("login succesful, wlecom to canvas");
            System.out.println("select the course to contiue");
        } else {
            System.out.println("login failed");
        }




    }

    public static void loginVoid(String username, String password) {

        String secretusername = "cybertekStudent";
        String secretpassword = "abc123";

        if (secretusername.equals("cybertekStudent") && secretpassword.equals("abc123")) {
            System.out.println("Login Succesful, welcome " + secretusername);
        } else {
            System.out.println("Incorrect username or password");


        }
    }

        public static boolean login (String username, String password){
            String Secretusername = "cybertekStudent";
            String Secretpassword = "abc123";

            if (username.equals(Secretusername) && password.equals(Secretpassword)) {
                return true;
            }
            return false;
        }
    }