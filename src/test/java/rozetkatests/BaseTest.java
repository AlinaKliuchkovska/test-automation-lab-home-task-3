package rozetkatests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import rozetkapages.*;
import utils.PropertiesReader;


public abstract class BaseTest {
    private WebDriver driver;
    PropertiesReader propertiesReader = new PropertiesReader();

    @BeforeTest
    public void profileSetUp() {
        System.setProperty(propertiesReader.getDriverName(), propertiesReader.getDriverLocation());
    }

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(propertiesReader.getURL());
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }


    public HomePage getHomePage() {
        return new HomePage(driver);
    }

    public ProductPage getProductPage() {
        return new ProductPage(driver);
    }

    public CartPopup getCartPopup() {
        return new CartPopup(driver);
    }

    public NotebooksPage getNotebooksPage() {
        return new NotebooksPage(driver);
    }
}