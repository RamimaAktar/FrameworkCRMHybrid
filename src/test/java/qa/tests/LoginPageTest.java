package qa.tests;

import basePage.BaseTest;
import org.testng.annotations.Test;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;

public class LoginPageTest extends BaseTest {



    HomePageEvents homePageEvents = new HomePageEvents();
    LoginPageEvents loginPageEvents = new LoginPageEvents();

    @Test
    public void loginToTheApplication(){
        homePageEvents.logInButton();
        loginPageEvents.enterCredentials();
    }

}
