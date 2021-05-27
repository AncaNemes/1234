package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("Starting etsy search SMOKE TEST");
        openBrowser();
        navigateTOEtsyURL();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();

    }
    /*openBrowser
    navigateTOEtsyURL
    searchForWoodenSpoon
            verifyResultsAreDisplayed*/
    public static void openBrowser(){
        System.out.println("1.LAUNCHING CHROME BROWSER");

    }
    public static void   navigateTOEtsyURL(){
        System.out.println("2.navigate to http://www.etsy.com");
    }
    public static void    searchForWoodenSpoon(){
        System.out.println("3.pass: verify etsy home page is displayed");
        System.out.println("type wooden spoon in search field and click search");
    }
    public static void  verifyResultsAreDisplayed(){
        System.out.println("4.found one million seraches");}
}
