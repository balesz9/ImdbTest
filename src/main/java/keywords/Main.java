package keywords;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {
        openIMDB();
        openSignIn();
        signIn();
        search();
    }

    private static FirefoxDriver driver = new FirefoxDriver();

    public static void openIMDB(){
        driver.get("https://www.imdb.com/");
    }

    public static  void openSignIn(){
        driver.findElementById("imdb-signin-link").click();
        driver.findElementByLinkText("Sign in with IMDb").click();
    }

    public static void signIn(){
        driver.findElementById("ap_email").sendKeys("rundmcvb17@freemail.hu");
        driver.findElementById("ap_password").sendKeys("password");
        driver.findElementById("signInSubmit").click();
    }

    public static void search(){
        driver.findElementById("navbar-query").sendKeys("simpsons");
        driver.findElementById("navbar-submit-button").click();
    }

    public static void closeBrowser(){
        driver.close();
    }






}
