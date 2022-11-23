package Tests;

import org.testng.annotations.Test;
import pages.RegisterPage;

import static org.testng.Assert.assertTrue;

public class TestRegister extends Base{

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

        registerPage.clickOnRegisterButton();
        System.out.println("REr");

        registerPage.clickOnContinueButton();
        System.out.println("CONYINUE");

        //registerPage.checkSignOutButton();
        boolean isDisplayedSignOut = registerPage.checkSignOutButton();
        assertTrue(isDisplayedSignOut);

    }


}
