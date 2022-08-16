import org.testng.annotations.Test;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class AmazonSearchTest {

    @Test
    public void testSearchAmazonProduct() {
        String department = "search-alias=baby-products-intl-ship";
        String product = "shoes";
        String realSponTextValue = "RESULTS";
        AmazonSearch search_about_baby_shoes = new AmazonSearch();
        search_about_baby_shoes.launchBrowser();
        String expectedSponTextValue = search_about_baby_shoes.searchAmazonProduct(department, product);
        assertEquals(realSponTextValue, expectedSponTextValue);

    }

}