package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    private WebDriver driver;

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
        WebElement registerButton = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
        registerButton.click();
    }

    public void genderSelection() {
        WebElement gender = driver.findElement(By.xpath("//input[@id='gender-female']"));
        gender.click();
    }

    public void enterFirstName() {
        WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstName.sendKeys("Leesha");
    }

    public void enterLastName() {
        WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastName.sendKeys("Maven");
    }

    public void enterDate() {
        WebElement day = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        Select enterDay = new Select(day);
        enterDay.selectByValue("10");
    }

    public void enterMonth() {
        WebElement month = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        Select enterMonth = new Select(month);
        enterMonth.selectByValue("7");
    }

    public void enterYear() {
        WebElement year = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        Select enterYear = new Select(year);
        enterYear.selectByValue("1990");
    }

    public void enterEmail() {
        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("leesa1343@yopmail.com");
    }

    public void enterCompanyName() {
        WebElement companyName = driver.findElement(By.xpath("//input[@id='Company']"));
        companyName.sendKeys("enterCoName");
    }

    public void clickOnNewsLetters() {
        WebElement newsLetter = driver.findElement(By.xpath("//input[@id='Newsletter']"));
        newsLetter.click();
    }

    public void enterPassword() {
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("Leesa@123");
    }

    public void enterConfirmPassword() {
        WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPassword.sendKeys("Leesa@123");
    }

    public void clickOnRegisterButton() {
        WebElement registerButn = driver.findElement(By.xpath("//button[@id='register-button']"));
        registerButn.click();
    }

    public void clickOnContinueButton() {
        WebElement continueButn = driver.findElement(By.xpath("//a[normalize-space()='Continue']"));
        continueButn.click();
    }
    // Can we use String instead of boolean
    public boolean checkSignOutButton() {
        WebElement registerSuccess = driver.findElement(By.xpath("//a[normalize-space()='Log out']"));
        registerSuccess.getText();
        return true;
    }
}

