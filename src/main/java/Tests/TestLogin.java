package Tests;

import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.HomePage;
import pages.LoginPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestLogin extends BaseTests {

    @Test
    public void When_GotoHomePageWhileNoUserLogIn_Then_TryToLogin() {
        LoginPage loginPage = new LoginPage(super.driver);

        //Verify that the login page is accessible and loads without any errors.
        loginPage.loadloginPage();
        Assert.assertTrue(loginPage.loadloginPage());
        System.out.println("PageLoad");

        loginPage.refresh();
        System.out.println("Refresh");

        loginPage.clickOnLogin();
        System.out.println("log in");


        // Verify that the Email field is available
        Assert.assertTrue(loginPage.isEmailFieldAvailable());

        // Verify that the Password field is available
        Assert.assertTrue(loginPage.isPasswordFieldAvailable());

        // Verify that the Login Button is available
        Assert.assertTrue(loginPage.isLoginButtonAvailable());

        //Verify that the "Remember me" field is available
        Assert.assertTrue(loginPage.is_RemeberMe_Available());


        //Verify that the user is not able to log in with empty field values
        loginPage.clickEmptyEmail();
        loginPage.ClickEmptyPassword();
        loginPage.clickLogin();
        assertEquals(loginPage.errorMessage_Empty_Email(), "Please enter your email");

        loginPage.refresh();

        //Verify that the user enters invalid email address
        loginPage.enterInvalidEmail();
        loginPage.ClickEmptyPassword();
        assertEquals(loginPage.invalidEmailErrorMessage(), "Wrong email");

        loginPage.refresh();

        // Verify that a user with not previously registered email and password, So cannot log in and receives an appropriate error message
        loginPage.NotRegisteredEmail();
        loginPage.notRegisteredPassword();
        loginPage.clickLogin();
        assertTrue(loginPage.errorMessage_invalid_username_and_password().contains("Login was unsuccessful. Please correct the errors and try again."));
        //assertE(loginPage.errorMessage_invalid_username_and_password(),"Login was unsuccessful. Please correct the errors and try again.");


        // Verify that a user with valid email and password can successfully log in and is redirected to the home page
        loginPage.loadloginPage();
        loginPage.clickOnLogin();

        loginPage.enterEmail("nuwa1@yopmail.com");
        loginPage.enterPassword();
        HomePage homePage = loginPage.clickOnLoginButton_when_the_user_enters_valid_username_and_validPassword();
        assertEquals(homePage.HomePageMessage(), "Welcome to our store");


        //Verify Login with Remember me on
        loginPage.loadloginPage();
        loginPage.clickOnLogin();

        loginPage.enterEmail("nuwa2@yopmail.com");
        loginPage.enterPassword();
        loginPage.rememberMeOn();
        HomePage homePageTo = loginPage.clickOnLoginButton_when_the_user_enters_valid_username_and_validPassword();
        assertEquals(homePageTo.HomePageMessage(), "Welcome to our store");


        //Verify navigation to forgot password page
        loginPage.clickOnLogout();
        loginPage.clickOnLogin();

        ForgotPasswordPage ForgotPassword = loginPage.ClickForgotPassword();
        assertEquals(ForgotPassword.ForgotPasswordPageMessage(),"Password recovery");


    }


}
