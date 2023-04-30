package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private final WebDriver driver;

    private static final By welcomePage = By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[2]/div[1]/h2");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String HomePageMessage(){
        WebElement welcomeMessage = driver.findElement(welcomePage);
        return welcomeMessage.getText();
    }
}
