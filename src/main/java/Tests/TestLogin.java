package Tests;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.HomePage;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestLogin extends BaseTests {

    private LoginPage loginPage;

    @BeforeClass
    void init() {
        this.loginPage = new LoginPage(super.driver);
    }

    @BeforeMethod
    void login() {
        loginPage.loadloginPage();
        Assert.assertTrue(loginPage.loadloginPage());
        System.out.println("PageLoad");

        loginPage.clickOnLogin();
        System.out.println("log in");
    }

    @AfterMethod
    void logout(){
        loginPage.clickOnLogout();
    }

    @Test
    public void When_loginPageLoads_Then_AllFieldsShouldAppear() {
        // Verify that the Email field is available
        Assert.assertTrue(loginPage.isEmailFieldAvailable());
        // Verify that the Password field is available
        Assert.assertTrue(loginPage.isPasswordFieldAvailable());
        // Verify that the Login Button is available
        Assert.assertTrue(loginPage.isLoginButtonAvailable());
        //Verify that the "Remember me" field is available
        Assert.assertTrue(loginPage.is_RemeberMe_Available());
    }

    @Test
    public void When_TheUserIsNotAbleToLogInWithEmptyFieldValues_Then_ErrorMessageShouldShown() {
        //Verify that the user is not able to log in with empty field values
        loginPage.clickEmptyEmail();
        loginPage.ClickEmptyPassword();
        loginPage.clickLogin();
        assertEquals(loginPage.errorMessage_Empty_Email(), "Please enter your email");
    }

    @Test
    public void When_UserEntersInvalidEmailAddress_Then_ErrorMessageShouldShown() {
        //Verify that the user enters invalid email address
        loginPage.enterInvalidEmail();
        loginPage.ClickEmptyPassword();
        assertEquals(loginPage.invalidEmailErrorMessage(), "Wrong email");
    }


    @Test
    public void When_TheUserIsNotPreviouslyRegisteredEmailAndPassword_Then_ErrorMessageShouldShown() {
        // Verify that a user with not previously registered email and password, So cannot log in and receives an appropriate error message
        loginPage.NotRegisteredEmail();
        loginPage.notRegisteredPassword();
        loginPage.clickLogin();
        assertTrue(loginPage.errorMessage_invalid_username_and_password().contains("Login was unsuccessful. Please correct the errors and try again."));
        //assertE(loginPage.errorMessage_invalid_username_and_password(),"Login was unsuccessful. Please correct the errors and try again.");
    }

    @Test
    public void When_TheUserEntersValidEmailAndPassword_Then_UserCanSuccessfullyLogIn() {
        // Verify that a user with valid email and password can successfully log in and is redirected to the home page
        loginPage.enterEmail("nuwa1@yopmail.com");
        loginPage.enterPassword();
        HomePage homePage = loginPage.clickOnLoginButton_when_the_user_enters_valid_username_and_validPassword();
        assertEquals(homePage.HomePageMessage(), "Welcome to our store");
    }

    @Test
    public void When_LoginWithRememberMeOn_Then_ShouldBeAbleToSuccessfullyLogIn() {
        //Verify Login with Remember me on
        loginPage.enterEmail("nuwa2@yopmail.com");
        loginPage.enterPassword();
        loginPage.rememberMeOn();
        HomePage homePageTo = loginPage.clickOnLoginButton_when_the_user_enters_valid_username_and_validPassword();
        assertEquals(homePageTo.HomePageMessage(), "Welcome to our store");

    }

    @Test
    public void When_TheUserClickOnForgotPasswordLink_Then_UserShouldNavigateToTheForgotPasswordPage() {
        //Verify navigation to forgot password page
        ForgotPasswordPage ForgotPassword = loginPage.ClickForgotPassword();
        assertEquals(ForgotPassword.ForgotPasswordPageMessage(), "Password recovery");

    }
}
