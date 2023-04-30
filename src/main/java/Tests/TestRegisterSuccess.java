package Tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterSuccessPage;

import static org.testng.Assert.assertEquals;

public class TestRegisterSuccess extends BaseTests{

    @Test
    public void If_Registration_is_success_Goto_RegisterSuccessPage() {
        RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage(super.driver);

        HomePage HomePageSuccessMessage = registerSuccessPage.clickOnContinueButton();
        assertEquals(HomePageSuccessMessage.HomePageMessage(),"Welcome to our store","Incorrect Page");

    }
}
