import org.testng.annotations.Test;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class AmazonSearchTest {

    @Test
    public void testLaunchBrowser() {
    }

    @Test
    public void testSearchAmazonProduct() {
        String department = "search-alias=baby-products-intl-ship";
        String product = "shoes";
        String realSponValue = "RESULTS";
        AmazonSearch search_about_baby_shoes = new AmazonSearch();
        search_about_baby_shoes.launchBrowser();
        String expectedSponValue = search_about_baby_shoes.searchAmazonProduct(department, product);
        assertEquals(realSponValue, expectedSponValue);

    }

    @Test
    public void testMain() {
    }
}