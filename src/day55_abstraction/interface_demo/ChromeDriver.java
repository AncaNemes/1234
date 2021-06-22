package day55_abstraction.interface_demo;

public class ChromeDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("chrome driver -locating elements by " + url);
    }

    @Override
    public void findElements(String locator) {
        System.out.println("chrome driver -locating elements by " + locator);
    }

    @Override
    public void quit() {
        System.out.println("chrome driver -quit ");
    }

    @Override
    public String getTitle() {
        return "wooden spoon";
    }
}
