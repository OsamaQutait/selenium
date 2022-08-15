import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import java.time.Duration;

public class W3schoolSearch {
    WebDriver driver;
    static final String URL = "https://www.w3schools.com/#gsc.tab=0";
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);
    }
    public void searchProduct(String key, String linkText) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("search2")).sendKeys(key);
        driver.findElement(By.id("learntocode_searchbtn")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.linkText(linkText)).click();

    }
    public static void main(String[] args) throws InterruptedException {
        String key = "HTML";
        String linkText = "HTML Tutorial";
        W3schoolSearch search_about_selenium = new W3schoolSearch();
        search_about_selenium.launchBrowser();
        search_about_selenium.searchProduct(key, linkText);

    }

}


