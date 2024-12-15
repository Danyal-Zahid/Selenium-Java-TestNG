import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearchTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the ChromeDriver path (ensure you have chromedriver installed)
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void searchGoogle() {
        // Open Google
        driver.get("https://www.google.com");
        
        // Find the search box, input a query, and submit
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();
        
        // Print page title
        System.out.println("Page title is: " + driver.getTitle());
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Close the browser
        }
    }
}
