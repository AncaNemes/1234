package day44_custom_classes;

public class MyApps {
    public static void main(String[] args) {
        String app= "uber";
        App app2;
        System.out.println("app = " +app);

        //runnes
        App app1= new App();

       app1.name= "Etsy";
       app1.version=3.5;
       app1.open();
       app1.version=4.0;
       app1.open();


    }
}
