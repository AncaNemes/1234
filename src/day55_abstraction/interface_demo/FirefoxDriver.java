package day55_abstraction.interface_demo;

public class FirefoxDriver implements  WebDriver{
    @Override
    public void get(String url) {
        System.out.println("firefox driver- navigating to "+url);

    }

    @Override
    public void findElements(String locator) {
        System.out.println("firefoc locator " +locator);
    }

    @Override
    public void quit() {
        System.out.println("firefox driver quit");
    }

    @Override
    public String getTitle() {
        return "double sppooon";
    }
}
