package pageEvents;

import Utils.ElementFetch;
import org.openqa.selenium.interactions.Actions;
import pageObjects.CogMentoPageElements;

import static basePage.BaseTest.driver;

public class CogMentoPageEvents {

ElementFetch elementFetch = new ElementFetch();


public void clicksOnContactAddButton() throws InterruptedException {

    Actions actions = new Actions(driver);

    actions.moveToElement(elementFetch.getWebElement("Xpath","//i[@class='users icon']")).build().perform();
    Thread.sleep(2000);
    elementFetch.getWebElement("Xpath", CogMentoPageElements.contactPlusIcon).click();
    Thread.sleep(2000);

}


}
