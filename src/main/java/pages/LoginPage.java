package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private final WebDriver driver;

    private static final By CLICK_LOGIN = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
    private static final By EmailAvailable = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[1]/label");
    private static final By PasswordAvailable = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[2]/label");
    private static final By LoginButtonAvailable = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
    private static final By EMAIL = By.xpath("//*[@id=\"Email\"]");
    private static final By PASSWORD = By.xpath("//*[@id=\"Password\"]");
    private static final By LOGIN_BUTTON = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
    private static final By Error_message = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]");
    private static final By Invalid_email_Error_message = By.xpath("//*[@id=\"Email-error\"]");
    private static final By Empty_email_Error_message = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[1]/span");
    private static final By ForgotPassword = By.xpath("//html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[3]/span/a");
    private static final By RememberMeOn = By.xpath("//*[@id=\"RememberMe\"]");
    private static final By ClickOnLogout = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
    private static final By RememberMe_Available = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[3]/label");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public boolean loadloginPage() {

        driver.get("https://demo.nopcommerce.com/");
        return true;
    }

    public void refresh(){

        driver.navigate().refresh();
    }

    public void clickOnLogin() {
        WebElement clickOnloginButton = driver.findElement(CLICK_LOGIN);
        clickOnloginButton.click();
    }

    public boolean isEmailFieldAvailable() {
        WebElement isEmailFieldAvailable = driver.findElement(EmailAvailable);
        isEmailFieldAvailable.isDisplayed();
        return true;
    }

    public boolean isPasswordFieldAvailable() {
        WebElement isPasswordFieldAvailable = driver.findElement(PasswordAvailable);
        isPasswordFieldAvailable.isDisplayed();
        return true;
    }

    public boolean isLoginButtonAvailable() {
        WebElement isLoginButtonAvailable = driver.findElement(LoginButtonAvailable);
        return isLoginButtonAvailable.isDisplayed();
    }

    public boolean is_RemeberMe_Available(){
        WebElement is_RemeberMeAvailable = driver.findElement(RememberMe_Available);
        return is_RemeberMeAvailable.isDisplayed();
    }


    public void enterEmail(String email) {
        WebElement enteremail = driver.findElement(EMAIL);
        enteremail.sendKeys(email);
    }

    public void enterPassword() {
        WebElement enterpassword = driver.findElement(PASSWORD);
        enterpassword.sendKeys("nuwa@123");
    }

    public HomePage clickOnLoginButton_when_the_user_enters_valid_username_and_validPassword() {
        WebElement loginSuccess = driver.findElement(LOGIN_BUTTON);
        loginSuccess.click();
        return new HomePage(driver);
    }


    public void NotRegisteredEmail() {
        WebElement notRegisteredemail = driver.findElement(EMAIL);
        notRegisteredemail.sendKeys("nuwa13@yopmail.com");
    }

    public void notRegisteredPassword() {
        WebElement notRegisteredPassword = driver.findElement(PASSWORD);
        notRegisteredPassword.sendKeys("nuwa&124");
    }

    public String errorMessage_invalid_username_and_password() {
        WebElement errorMessage = driver.findElement(Error_message);
        return errorMessage.getText();
    }

    public void enterInvalidEmail() {
        WebElement invalidEmailErrorMessage = driver.findElement(EMAIL);
        invalidEmailErrorMessage.sendKeys("nuwayopmail.com");
    }

    public String invalidEmailErrorMessage() {
        WebElement invalidEmailErrorMessage = driver.findElement(Invalid_email_Error_message);
        return invalidEmailErrorMessage.getText();
    }

    public void clickLogin() {
        WebElement click_login = driver.findElement(LOGIN_BUTTON);
        click_login.click();
    }

    public void ClickEmptyPassword() {
        WebElement clickPassword = driver.findElement(PASSWORD);
        clickPassword.click();
    }

    public void clickEmptyEmail() {
        WebElement clickPassword = driver.findElement(EMAIL);
        clickPassword.click();
    }

    public String errorMessage_Empty_Email() {
        WebElement empty_EmailErrorMessage = driver.findElement(Empty_email_Error_message);
        return empty_EmailErrorMessage.getText();
    }


    public ForgotPasswordPage ClickForgotPassword() {
        WebElement clickForgotPassword = driver.findElement(ForgotPassword);
        clickForgotPassword.click();
        return new ForgotPasswordPage(driver);
    }

    public void rememberMeOn() {
        WebElement rememberMeOn = driver.findElement(RememberMeOn);
        rememberMeOn.click();
    }

    public void clickOnLogout() {
        WebElement clickOnLogoutButton = driver.findElement(ClickOnLogout);
        clickOnLogoutButton.click();
    }
}
