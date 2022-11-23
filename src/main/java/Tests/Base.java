package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {

    protected WebDriver driver;  // this can be private or protected

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }

}

