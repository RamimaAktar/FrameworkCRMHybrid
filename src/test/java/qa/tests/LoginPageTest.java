package qa.tests;

import basePage.BaseTest;
import org.testng.annotations.Test;
import pageEvents.*;

public class LoginPageTest extends BaseTest {



    HomePageEvents homePageEvents = new HomePageEvents();
    LoginPageEvents loginPageEvents = new LoginPageEvents();
    CogMentoPageEvents cogMentoPageEvents = new CogMentoPageEvents();
    CreateNewContactEvents createNewContactEvents = new CreateNewContactEvents();
    SearchButtonEvents searchButtonEvents = new SearchButtonEvents();


    @Test
    public void loginToTheApplication() throws InterruptedException {
        homePageEvents.logInButton();
        loginPageEvents.enterCredentials();
        //cogMentoPageEvents.clicksOnContactAddButton();
        //createNewContactEvents.enterRequirements();
        searchButtonEvents.enterCompanyName();

    }

}
