package pageEvents;

import Utils.ElementFetch;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.SearchButtonElements;

import java.util.List;

public class SearchButtonEvents {



    ElementFetch elementFetch = new ElementFetch();


    public void enterCompanyName() throws InterruptedException {
        Thread.sleep(2000);
        elementFetch.getWebElement("Xpath", SearchButtonElements.searchButton).click();
        elementFetch.getWebElement("Xpath",SearchButtonElements.searchButton).sendKeys("Bizbee INC");
        Thread.sleep(2000);
        elementFetch.getWebElement("Xpath",SearchButtonElements.searchButton).sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        elementFetch.getWebElement("Xpath",SearchButtonElements.companyText).click();


        String expectedEmail = "bizbee: <bizbee@gmail.com>";
        String actualEmail = elementFetch.getWebElement("Xpath",SearchButtonElements.email).getText();
        Assert.assertEquals(actualEmail,expectedEmail);
        System.out.println(" Test case is passed : "+actualEmail);


        String expectedValue = "Customer";
        String actualValue = elementFetch.getWebElement("Xpath",SearchButtonElements.category).getText();
        Assert.assertEquals(actualValue,expectedValue);
        System.out.println("Test case is passed : "+actualValue);


        String expectedStatus = "New";
        String actualStatus = elementFetch.getWebElement("Xpath",SearchButtonElements.status).getText();
        Assert.assertEquals(actualStatus,expectedStatus);
        System.out.println(" Test case is passed : "+actualStatus);


        String expectedDescription = "This is an IT training Company";
        String actualDescription = elementFetch.getWebElement("Xpath",SearchButtonElements.description).getText();
        Assert.assertEquals(actualDescription,expectedDescription);
        System.out.println(" Test case is passed: "+actualDescription);


        String expectedAddress = "123, NewYork, NY, 10036";
        String actualAddress = elementFetch.getWebElement("Xpath",SearchButtonElements.address).getText();
        Assert.assertEquals(actualAddress,expectedAddress);
        System.out.println(" Test case is passed : "+actualAddress);

        String expectedPhoneNo = "5253621547: +17182546954";
        String actualPhoneNo = elementFetch.getWebElement("Xpath",SearchButtonElements.phoneNo).getText();
        Assert.assertEquals(actualPhoneNo,expectedPhoneNo);
        System.out.println(" Test case is passed : "+actualPhoneNo);

//
//        String expectedPosition = "N/A";
//        String actualPosition = elementFetch.getWebElement("Xpath",SearchButtonElements.position).getText();
//        Assert.assertEquals(actualPosition,expectedPosition);
//        System.out.println("my actualValue & expectedValue position are matched : "+expectedPosition);




        String expectedDept = "IT Program";
        String actualDept = elementFetch.getWebElement("Xpath",SearchButtonElements.department).getText();
        Assert.assertEquals(actualDept,expectedDept);
        System.out.println(" Test case is passed : "+actualDept);


        String expectedSupervisor = "Ismail Mohammad Hossain";
        String actualSupervisor = elementFetch.getWebElement("Xpath",SearchButtonElements.supervisor).getText();
        Assert.assertEquals(actualSupervisor,expectedSupervisor);
        System.out.println("Test case is passed : "+actualSupervisor);


        String expectedSource = "Website";
        String actualSource = elementFetch.getWebElement("Xpath",SearchButtonElements.source).getText();
        Assert.assertEquals(actualSource,expectedSource);
        System.out.println(" Test case is passed : "+actualSource);


        String expectedNotCall = "No";
        String actualNotCall = elementFetch.getWebElement("Xpath",SearchButtonElements.doNotCall).getText();
        Assert.assertEquals(actualNotCall,expectedNotCall);
        System.out.println("Test case is passed: "+actualNotCall);


        String expectedNotText = "No";
        String actualNotText = elementFetch.getWebElement("Xpath",SearchButtonElements.doNotText).getText();
        Assert.assertEquals(actualNotText,expectedNotText);
        System.out.println(" Test case is passed : "+actualNotText);

        String expectedNotEmail= "No";
        String actualNotEmail = elementFetch.getWebElement("Xpath",SearchButtonElements.doNotEmail).getText();
        Assert.assertEquals(actualNotEmail,expectedNotEmail);
        System.out.println(" Test case is passed:"+actualNotEmail);

        String expectedBirthday= "4 July 2000";
        String actualBirthday = elementFetch.getWebElement("Xpath",SearchButtonElements.birthday).getText();
        Assert.assertEquals(actualBirthday,expectedBirthday);
        System.out.println(" Test case is passed :"+actualBirthday);

        String expectedCreatedAt = "21/01/2024 11:29";
        String actualCreatedAt = elementFetch.getWebElement("Xpath",SearchButtonElements.createdAt).getText();
        Assert.assertEquals(actualCreatedAt,expectedCreatedAt);
        System.out.println("Test case is passed :"+actualCreatedAt);

        String expectedCreatedBy= "Biz Bee";
        String actualCreatedBy = elementFetch.getWebElement("Xpath",SearchButtonElements.createdBy).getText();
        Assert.assertEquals(actualCreatedBy,expectedCreatedBy);
        System.out.println(" Test case is passed:"+actualCreatedBy);


    }
}
