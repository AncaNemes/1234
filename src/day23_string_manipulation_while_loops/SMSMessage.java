package day23_string_manipulation_while_loops;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [Saim] From Number <(222) 333-4444> Message:{Hello, lets code some java}";

        //substring,indexOf-will find index nb of special characters, [],<>,{}

    //message.indexOf("[")

        int start = message.indexOf("[");
        int end = message.indexOf("]");
        message.substring(start, end);
        System.out.println(message.substring(start+1, end));

        String sender = message.substring(start+1, end);
        System.out.println("sender = " + sender);

        String mobile = message.substring(message.indexOf("<")+1,message.indexOf(">")) ;
        System.out.println("mobile = " + mobile);

        String text= message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("text = " + text );

        String word = "  java   ";
        word = word.trim();
        System.out.println(word);



    }


}
