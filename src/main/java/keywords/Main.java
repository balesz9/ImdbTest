package keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class Main {

    public static void main(String[] args) {
        openIMDB();
        openSignIn();
        signIn();
        search();
        openWatchList();
        editWatchList();
        creatANewList();
    }

    private static FirefoxDriver driver = new FirefoxDriver();
    private  static WebDriverWait wait = new WebDriverWait(driver, 5);

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

    public static void  openWatchList(){
        driver.findElementByPartialLinkText("Watchlist").click();
    }

    public  static void editWatchList(){
        driver.findElementByLinkText("EDIT").click();
        driver.findElementById("add-to-list-search").sendKeys("The Simpsons");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"add-to-list-search-results\"]/a[1]")));
        driver.findElement(By.xpath("//*[@id=\"add-to-list-search-results\"]/a[1]")).click();
        driver.findElementByCssSelector("#main > div.lister-edit-form > button").click();


    }

    public  static void creatANewList(){
        driver.findElementByCssSelector("#sidebar > div:nth-child(6) > span > div > span > span > a > h3").click();
        driver.findElementById("list-create-name").sendKeys("list");
        driver.findElementById("list-create-description").sendKeys("test");
        Select typeOfList = new Select(driver.findElementByName("list-create-type"));
        typeOfList.selectByIndex(1);
        driver.findElementByCssSelector("#list-create-form > button").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main\"]/div[1]/button")));
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/button")).click();



    }

    public static void closeBrowser(){
        driver.close();
    }






}
