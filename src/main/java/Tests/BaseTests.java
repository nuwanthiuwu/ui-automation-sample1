package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTests {

    protected WebDriver driver;  // this can be private or protected

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");


        driver.manage().window().maximize();  // To maximize the screen
        /*

        driver.manage().window().fullscreen(); // To Full screen
        driver.manage().window().setSize(new Dimension(375,812));  // To set to iPhone dimention

        */
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }


}

