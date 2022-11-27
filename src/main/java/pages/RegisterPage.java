package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    private WebDriver driver;
    private static final String REGISTER_BUTTON_XPATH ="//a[normalize-space()='Register']";
    private static final String GENDER_XPATH ="//input[@id='gender-female']";
    private static final String FIRSTNAME_XPATH ="//input[@id='FirstName']";
    private static final String LASTNAME_XPATH ="//input[@id='LastName']";
    private static final String DATE_XPATH = "//select[@name='DateOfBirthDay']";
    private static final String MONTH_XPATH ="//select[@name='DateOfBirthMonth']";
    private static final String YEAR_XPATH ="//select[@name='DateOfBirthYear']";
    private static final String ENTER_EMAIL_XPATH ="//input[@id='Email']";
    private static final String COMPANYNAME_XPATH ="//input[@id='Company']";
    private static final String NEWSLETTER_XPATH ="//input[@id='Newsletter']";
    private static final String ENTER_PASSWORD_XPATH ="//input[@id='Password']";
    private static final String ENTER_CONFIRM_PASSWORD_XPATH ="//input[@id='ConfirmPassword']";
    private static final String CLICK_REGISTER_BUTTON_XPATH ="//button[@id='register-button']";
    private static final String CLICK_CONTINUE_BUTTON_XPATH ="//a[normalize-space()='Continue']";
    private static final String REGISTER_SUCCESS_XPATH ="//a[normalize-space()='Log out']";

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
        WebElement registerButton = driver.findElement(By.xpath(REGISTER_BUTTON_XPATH));
        registerButton.click();
    }

    public void genderSelection() {
        WebElement gender = driver.findElement(By.xpath(GENDER_XPATH));
        gender.click();
    }

    public void enterFirstName() {
        WebElement firstName = driver.findElement(By.xpath(FIRSTNAME_XPATH));
        firstName.sendKeys("Leesha");
    }

    public void enterLastName() {
        WebElement lastName = driver.findElement(By.xpath(LASTNAME_XPATH));
        lastName.sendKeys("Maven");
    }

    public void enterDate() {
        WebElement day = driver.findElement(By.xpath(DATE_XPATH));
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
        email.sendKeys("leesa1343@yopmail.com");
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

    public void clickOnRegisterButton() {
        WebElement registerButn = driver.findElement(By.xpath(CLICK_REGISTER_BUTTON_XPATH));
        registerButn.click();
    }

    public void clickOnContinueButton() {
        WebElement continueButn = driver.findElement(By.xpath(CLICK_CONTINUE_BUTTON_XPATH));
        continueButn.click();
    }
    // Can we use String instead of boolean
    public boolean checkSignOutButton() {
        WebElement registerSuccess = driver.findElement(By.xpath(REGISTER_SUCCESS_XPATH));
        registerSuccess.getText();
        return true;
    }
}

