package day54_abstraction;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public abstract class MyAbstractClass {
    int num= 55;
    public void learn(){
        System.out.println("learning ...");
    }

}

class Sub extends MyAbstractClass{

}


 class MyObjects{
    public static void main(String[] args) {

     //   MyAbstractClass mac= new MyAbstractClass();

        Sub sub =  new Sub();
        sub.learn();
        System.out.println(sub.num);
    }
}
