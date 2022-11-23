package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private final WebDriver driver;
    private static final String EMAIL_XPATH = "//input[@id='Email']";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loadloginPage() {

        driver.get("https://demo.nopcommerce.com/");
    }

    public void refresh() {

        driver.navigate().refresh();
    }

    public void clickOnLogin() {
        WebElement clickOnloginButton = driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
        clickOnloginButton.click();
    }

    public void enterEmail() {
        WebElement enteremail = driver.findElement(By.xpath(EMAIL_XPATH));
        enteremail.sendKeys("leesa1343@yopmail.com");
    }

    public void enterPassword() {
        WebElement enterpassword = driver.findElement(By.xpath("//input[@id='Password']"));
        enterpassword.sendKeys("Leesha@123");
    }

    public void click_Login_button() {
        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
        loginButton.click();
    }

    public boolean checkComputerDropDown() {
        WebElement checkComputer = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
        checkComputer.getText();
        return true;
    }


}
