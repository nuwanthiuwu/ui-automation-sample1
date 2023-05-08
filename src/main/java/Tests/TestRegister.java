package Tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import pages.RegisterSuccessPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestRegister extends BaseTests {

    @Test
    public void When_GotoRegisterPageWhileNoUserRegisterPreviously_Then_TryToRegister() {
        RegisterPage registerPage = new RegisterPage(super.driver);

        registerPage.loadingRedisterPage();
        System.out.println("load");

        registerPage.refresh();
        System.out.println("refresh");

        registerPage.clickOnTheRegisterButton();
        System.out.println("reg");

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
        assertEquals(successAlertMessage.successMessage(), "Your registration completed", "Your Registration success");

        HomePage homePage = successAlertMessage.clickOnContinueButton();
        assertEquals(homePage.HomePageMessage(), "Welcome to our store", "Incorrect Page");

    }
}
