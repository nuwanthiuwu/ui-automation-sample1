package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class RegisterPage {

    private final WebDriver driver;
   // private static final String REGISTER_BUTTON_XPATH ="//a[normalize-space()='Register']";
    private static final By REGISTER_BUTTON = By.xpath("//a[normalize-space()='Register']");
    private static final By GENDER_XPATH = By.xpath("//input[@id='gender-female']");
    private static final By FIRSTNAME_XPATH = By.xpath("//input[@id='FirstName']");
    private static final By LASTNAME_XPATH = By.xpath("//input[@id='LastName']");
    private static final By DATE_XPATH = By.xpath("//select[@name='DateOfBirthDay']");
    private static final String MONTH_XPATH ="//select[@name='DateOfBirthMonth']";
    private static final String YEAR_XPATH ="//select[@name='DateOfBirthYear']";
    private static final String ENTER_EMAIL_XPATH ="//input[@id='Email']";
    private static final String COMPANYNAME_XPATH ="//input[@id='Company']";
    private static final String NEWSLETTER_XPATH ="//input[@id='Newsletter']";
    private static final String ENTER_PASSWORD_XPATH ="//input[@id='Password']";
    private static final String ENTER_CONFIRM_PASSWORD_XPATH ="//input[@id='ConfirmPassword']";
    private static final String CLICK_REGISTER_BUTTON_XPATH ="//button[@id='register-button']";


    public RegisterPage(WebDriver driver) {

        this.driver = driver;
    }

    public void loadingRedisterPage() {

        driver.get("https://demo.nopcommerce.com/");
    }

    public void refresh() {

        driver.navigate().refresh();
    }

    public void clickOnTheRegisterButton() {
        WebElement registerButton = driver.findElement(REGISTER_BUTTON);
        registerButton.click();
    }

    public void genderSelection() {
        WebElement gender = driver.findElement(GENDER_XPATH);
        gender.click();
    }

    public void enterFirstName() {
        WebElement firstName = driver.findElement(FIRSTNAME_XPATH);
        firstName.sendKeys("Leesha");
    }

    public void enterLastName() {
        WebElement lastName = driver.findElement(LASTNAME_XPATH);
        lastName.sendKeys("Maven");
    }

    public void enterDate() {
        WebElement day = driver.findElement(DATE_XPATH);
        Select enterDay = new Select(day);
        enterDay.selectByValue("10");
    }

    public void enterMonth() {
        WebElement month = driver.findElement(By.xpath(MONTH_XPATH));
        Select enterMonth = new Select(month);
        enterMonth.selectByValue("7");
    }

    public void enterYear() {
        WebElement year = driver.findElement(By.xpath(YEAR_XPATH));
        Select enterYear = new Select(year);
        enterYear.selectByValue("1990");
    }

    public void enterEmail() {
        WebElement email = driver.findElement(By.xpath(ENTER_EMAIL_XPATH));
        email.sendKeys("leesa"+ new Random().nextInt(50) +"@yopmail.com");
    }

    public void enterCompanyName() {
        WebElement companyName = driver.findElement(By.xpath(COMPANYNAME_XPATH));
        companyName.sendKeys("enterCoName");
    }

    public void clickOnNewsLetters() {
        WebElement newsLetter = driver.findElement(By.xpath(NEWSLETTER_XPATH));
        newsLetter.click();
    }

    public void enterPassword() {
        WebElement password = driver.findElement(By.xpath(ENTER_PASSWORD_XPATH));
        password.sendKeys("Leesa@123");
    }

    public void enterConfirmPassword() {
        WebElement confirmPassword = driver.findElement(By.xpath(ENTER_CONFIRM_PASSWORD_XPATH));
        confirmPassword.sendKeys("Leesa@123");
    }

    public RegisterSuccessPage clickOnRegisterButton() {
        WebElement registerButn = driver.findElement(By.xpath(CLICK_REGISTER_BUTTON_XPATH));
        registerButn.click();
        return new RegisterSuccessPage(driver);
    }


}

