package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterSuccessPage {

    private final WebDriver driver;

    private static final By SuccessAlert = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]");
    private static final By CLICK_CONTINUE_BUTTON = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a");

    public RegisterSuccessPage(WebDriver driver) {
        this.driver = driver;
    }

    public String successMessage(){
        WebElement successAlertMessage = driver.findElement(SuccessAlert);
        return successAlertMessage.getText();
    }

    public HomePage clickOnContinueButton() {
        WebElement continueButn = driver.findElement(CLICK_CONTINUE_BUTTON);
        continueButn.click();
        return new HomePage(driver);
    }

}
