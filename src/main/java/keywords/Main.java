package keywords;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {
        openIMDB();
        openSingIn();
    }

    private static FirefoxDriver driver = new FirefoxDriver();

    public static void openIMDB(){
        driver.get("https://www.imdb.com/");
    }

    public static  void openSingIn(){
        driver.findElementById("imdb-signin-link").click();
    }


}
