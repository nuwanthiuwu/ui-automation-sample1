package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage {
    private final WebDriver driver;

    private static final By ForgotPasswordPage = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[1]/h1");


    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public String ForgotPasswordPageMessage() {
        WebElement forgot_Password_Page_message = driver.findElement(ForgotPasswordPage);
        return forgot_Password_Page_message.getText();
    }


}
