package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import pages.RegisterSuccessPage;

import static org.testng.Assert.assertEquals;

public class TestRegister extends BaseTests {

    private RegisterPage registerPage;

    @BeforeClass
    void init() {
        this.registerPage = new RegisterPage(super.driver);
    }

    @BeforeMethod
    public void On_The_Home_Screen_Clicking_On_The_Register_Button_To_Navigate_To_The_Register_Page() {

        registerPage.loadingRedisterPage();
        System.out.println("load");

        // registerPage.refresh();
        // System.out.println("refresh");

        registerPage.clickOnTheRegisterButton();
        System.out.println("reg");
    }

    @Test(priority = 1)
    public void When_GotoRegisterPageWhileNoUserRegisterPreviously_Then_TryToRegister() {

        registerPage.genderSelection();
        System.out.println("gender");

        registerPage.enterFirstName();
        System.out.println("fname");

        registerPage.enterLastName();
        System.out.println("lname");

        registerPage.enterDate();
        System.out.println("date");

        registerPage.enterMonth();
        System.out.println("month");

        registerPage.enterYear();
        System.out.println("year");

        registerPage.enterEmail();
        System.out.println("email");

        registerPage.enterCompanyName();
        System.out.println("c name");

        registerPage.clickOnNewsLetters();
        System.out.println("news letters");

        registerPage.enterPassword();
        System.out.println("PW");

        registerPage.enterConfirmPassword();
        System.out.println("CPW");

        RegisterSuccessPage successAlertMessage = registerPage.clickOnRegisterButton();
        assertEquals(successAlertMessage.successMessage(), "Your registration completed");

        HomePage homePage = successAlertMessage.clickOnContinueButton();
        assertEquals(homePage.HomePageMessage(), "Welcome to our store");

    }

    @Test(priority = 2)
    public void When_TheUser_Trying_To_Register_Without_Providing_FirstName() {
        registerPage.genderSelection();
        System.out.println("gender");

        registerPage.emptyFirstName();
        System.out.println("fname");

        registerPage.enterLastName();
        System.out.println("lname");

        registerPage.enterDate();
        System.out.println("date");

        registerPage.enterMonth();
        System.out.println("month");

        registerPage.enterYear();
        System.out.println("year");

        registerPage.enterEmail();
        System.out.println("email");

        registerPage.enterCompanyName();
        System.out.println("c name");

        registerPage.clickOnNewsLetters();
        System.out.println("news letters");

        registerPage.enterPassword();
        System.out.println("PW");

        registerPage.enterConfirmPassword();
        System.out.println("CPW");

        registerPage.clickOnRegisterButton();
        assertEquals(registerPage.firstNameErrorMessage(), "First name is required.");
    }

    @Test(priority = 3)
    public void When_TheUser_Trying_To_Register_Without_Providing_LastName() {
        registerPage.genderSelection();
        System.out.println("gender");

        registerPage.enterFirstName();
        System.out.println("fname");

        registerPage.emptyLastName();
        System.out.println("lname");

        registerPage.enterDate();
        System.out.println("date");

        registerPage.enterMonth();
        System.out.println("month");

        registerPage.enterYear();
        System.out.println("year");

        registerPage.enterEmail();
        System.out.println("email");

        registerPage.enterCompanyName();
        System.out.println("c name");

        registerPage.clickOnNewsLetters();
        System.out.println("news letters");

        registerPage.enterPassword();
        System.out.println("PW");

        registerPage.enterConfirmPassword();
        System.out.println("CPW");

        registerPage.clickOnRegisterButton();
        assertEquals(registerPage.LastNameErrorMessage(), "Last name is required.");
    }

    @AfterMethod
    void logout(){
        registerPage.clickOnLogout();
    }
}
