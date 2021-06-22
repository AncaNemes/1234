package day55_abstraction.interface_demo;

public class DriverObjects {
    public static void main(String[] args) {
        //WebDriver diver= new WebDriver();ERROR
        ChromeDriver driver1=new ChromeDriver();
        FirefoxDriver driver2= new FirefoxDriver();
        WebDriver driver3= new ChromeDriver();

        driver1.get("https://www.google.com");
        driver1.findElements("//input[@name='q']");
        System.out.println("title " + driver1.getTitle());
    }
}
