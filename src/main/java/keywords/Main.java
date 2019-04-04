package keywords;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {
        openIMDB();
        openSignIn();
    }

    private static FirefoxDriver driver = new FirefoxDriver();

    public static void openIMDB(){
        driver.get("https://www.imdb.com/");
    }

    public static  void openSignIn(){
        driver.findElementById("imdb-signin-link").click();
        driver.findElementByLinkText("Sign in with IMDb").click();
    }

    public static void closeBrowser(){
        driver.close();
    }

    




}
