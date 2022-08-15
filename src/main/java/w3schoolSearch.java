import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import java.time.Duration;

public class w3schoolSearch {
    WebDriver driver;
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/#gsc.tab=0");
    }
    public void searchProduct() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("search2")).sendKeys("HTML");
        driver.findElement(By.id("learntocode_searchbtn")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.linkText("HTML Tutorial")).click();

    }
    public static void main(String[] args) throws InterruptedException {
        w3schoolSearch search_about_selenium = new w3schoolSearch();
        search_about_selenium.launchBrowser();
        search_about_selenium.searchProduct();

    }

}


