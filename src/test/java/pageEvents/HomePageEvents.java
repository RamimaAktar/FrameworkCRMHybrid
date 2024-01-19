package pageEvents;

import Utils.ElementFetch;
import pageObjects.HomePageElements;

public class HomePageEvents {

    ElementFetch elementFetch = new ElementFetch();

    public void logInButton(){


        elementFetch.getWebElement("Xpath", HomePageElements.logInButton).click();




    }
}
