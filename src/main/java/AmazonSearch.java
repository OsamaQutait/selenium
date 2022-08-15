import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class AmazonSearch {
    WebDriver driver;
    static final String URL = "https://www.amazon.com/";
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);
    }
    public String searchAmazonProduct(String department, String product) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        Select selectObject = new Select(driver.findElement(By.id("searchDropdownBox")));
        selectObject.selectByValue(department);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        String sponValue = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[1]/div/span/div/div/span")).getText();
        driver.quit();
        return sponValue;
    }
    public static void main(String[] args) throws InterruptedException {
        String department = "search-alias=baby-products-intl-ship";
        String product = "shoes";
        AmazonSearch search_about_baby_shoes = new AmazonSearch();
        search_about_baby_shoes.launchBrowser();
        String sponValue = search_about_baby_shoes.searchAmazonProduct(department, product);
        System.out.println(sponValue);

    }

}
