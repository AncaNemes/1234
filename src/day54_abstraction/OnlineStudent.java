package day54_abstraction;
/*
+online stundet class wilm EXTEND Student abstract class
this class is considered to be concerete class
+ it is responsible to implement all the abstract methods (if any)
 */
public class OnlineStudent extends Student {

    /*
    +  attendClass abstract method is implemented by the subclass
    +  sub class is overriding the abstract method of PArent class
     */
@Override
    public void attendClass(){
    System.out.println("online student is attenting the class using zoom ");
}
}
