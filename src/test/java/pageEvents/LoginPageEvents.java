package pageEvents;

import Utils.ElementFetch;
import pageObjects.LoginPageElements;

public class LoginPageEvents {


    ElementFetch elementFetch = new ElementFetch();


    public void enterCredentials(){
        elementFetch.getWebElement("Xpath", LoginPageElements.emailAddress).sendKeys("niklas.braven@deecie.com");
        elementFetch.getWebElement("Xpath",LoginPageElements.password).sendKeys("Bizbee@123");
        elementFetch.getWebElement("Xpath",LoginPageElements.btnLogin).click();
    }




}
