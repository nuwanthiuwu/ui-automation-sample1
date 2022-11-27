package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private final WebDriver driver;
    private static final String CLICK_LOGIN_XPATH = "//a[normalize-space()='Log in']";
    private static final String EMAIL_XPATH = "//input[@id='Email']";
    private static final String PASSWORD_XPATH ="//input[@id='Password']";
    private static final String LOGIN_BUTTON_XPATH = "//button[normalize-space()='Log in']";
    private static final String CHECK_COMPUTERXPATH ="//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']";


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
        WebElement clickOnloginButton = driver.findElement(By.xpath(CLICK_LOGIN_XPATH));
        clickOnloginButton.click();
    }

    public void enterEmail() {
        WebElement enteremail = driver.findElement(By.xpath(EMAIL_XPATH));
        enteremail.sendKeys("leesa1343@yopmail.com");
    }

    public void enterPassword() {
        WebElement enterpassword = driver.findElement(By.xpath(PASSWORD_XPATH));
        enterpassword.sendKeys("Leesha@123");
    }

    public void click_Login_button() {
        WebElement loginButton = driver.findElement(By.xpath(LOGIN_BUTTON_XPATH));
        loginButton.click();
    }

    public boolean checkComputerDropDown() {
        WebElement checkComputer = driver.findElement(By.xpath(CHECK_COMPUTERXPATH));
        checkComputer.getText();
        return true;
    }


}
