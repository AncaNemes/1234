package day55_abstraction.interface_demo;

public interface WebDriver {
   public abstract void get(String url);// it navigates
    public abstract void findElements(String locator);
    void quit();// it is automatically public abstract
    String getTitle();


}
