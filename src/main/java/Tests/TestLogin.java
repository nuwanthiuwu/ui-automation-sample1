package Tests;

import org.testng.annotations.Test;
import pages.LoginPage;

import static org.testng.Assert.assertTrue;

public class TestLogin extends BaseTests {

   @Test
    public void When_GotoHomePageWhileNoUserLogIn_Then_TryToLogin() {
        LoginPage loginPage = new LoginPage(super.driver);

        loginPage.loadloginPage();
        System.out.println("load");

        loginPage.refresh();
        System.out.println("refresh");

        loginPage.clickOnLogin();

        loginPage.enterEmail();
        System.out.println("email");

        loginPage.enterPassword();
        System.out.println("pw");

        loginPage.click_Login_button();
        System.out.println("login");

        //loginPage.checkComputerDropDown();
        boolean isDisplayedComputerDropDown = loginPage.checkComputerDropDown();
        assertTrue(isDisplayedComputerDropDown);

    }

}
