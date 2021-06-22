package day55_abstraction.interface_demo;

public class InternetExplorerDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("Internet Explorer Driver navifate to" + url);

    }

    @Override
    public void findElements(String locator) {
        System.out.println("Internet Explorer Driver locatng element " +locator);

    }

    @Override
    public void quit() {
        System.out.println("use quit for internet explorer");
    }

    @Override
    public String getTitle() {
        return "not the right one ";
    }
}
