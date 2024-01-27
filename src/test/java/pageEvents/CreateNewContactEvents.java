package pageEvents;

import Utils.ElementFetch;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pageObjects.CreateNewContactElements;

import java.util.List;

import static basePage.BaseTest.driver;

public class CreateNewContactEvents {


    ElementFetch elementFetch = new ElementFetch();


    public void enterRequirements() throws InterruptedException {

        Actions actions = new Actions(driver);

        actions.moveToElement(elementFetch.getWebElement("Xpath","//input[@name='first_name']")).build().perform();
        Thread.sleep(2000);
        elementFetch.getWebElement("Xpath",CreateNewContactElements.firstName).sendKeys("Ismail");
        elementFetch.getWebElement("Xpath",CreateNewContactElements.middleName).sendKeys("Mohammad");
        elementFetch.getWebElement("Xpath",CreateNewContactElements.lastName).sendKeys("Hossain");



        elementFetch.getWebElement("Xpath",CreateNewContactElements.addressStreet).sendKeys("3246 Farleigh rd");
        elementFetch.getWebElement("Xpath",CreateNewContactElements.addressCity).sendKeys("Columbus");
        elementFetch.getWebElement("Xpath",CreateNewContactElements.addressState).sendKeys("Ohio");
        elementFetch.getWebElement("Xpath",CreateNewContactElements.addressPostCode).sendKeys("43224");


        Thread.sleep(2000);
        elementFetch.getWebElement("Xpath",CreateNewContactElements.countryNameICON).click();
        Thread.sleep(2000);

        List<WebElement>listOfCountries = elementFetch.getWebElements("Xpath",CreateNewContactElements.countryNameList);
        System.out.println("total no. of countries = "+listOfCountries.size());

       for (int i=0; i<listOfCountries.size(); i++){
           String countryText = listOfCountries.get(i).getText();
           System.out.println(countryText);

       if (countryText.equalsIgnoreCase("japan")){
            listOfCountries.get(i).click();
           break;
       }

       }

       Thread.sleep(2000);
       elementFetch.getWebElement("Xpath",CreateNewContactElements.addressAddButton).click();

       elementFetch.getWebElement("Xpath",CreateNewContactElements.streetAddress2).sendKeys("4116 ridgeview rd");
       elementFetch.getWebElement("Xpath",CreateNewContactElements.cityAddress2).sendKeys("Upper Arlington");
       elementFetch.getWebElement("Xpath",CreateNewContactElements.stateAddress2).sendKeys("Washington");
       elementFetch.getWebElement("Xpath",CreateNewContactElements.postCodeAddress2).sendKeys("3221");



        Thread.sleep(2000);
        elementFetch.getWebElement("Xpath",CreateNewContactElements.countryNameIcon2).click();
        Thread.sleep(2000);

        List<WebElement>listOfCountries2 = elementFetch.getWebElements("Xpath",CreateNewContactElements.CountryNameList2);
        System.out.println("total no. of countries = "+listOfCountries2.size());

        for (int i=0; i<listOfCountries2.size(); i++){
            String countryText2 = listOfCountries2.get(i).getText();
            System.out.println(countryText2);

            if (countryText2.equalsIgnoreCase("SwitzerLand")){
                listOfCountries2.get(i).click();
                break;
            }

        }



        elementFetch.getWebElement("Xpath",CreateNewContactElements.email).sendKeys("bizbee.llc@gmail.com");
        elementFetch.getWebElement("Xpath",CreateNewContactElements.emailCheckmark).click();
        elementFetch.getWebElement("Xpath",CreateNewContactElements.personalEmail).sendKeys("obama.b@gmail.com");

        elementFetch.getWebElement("Xpath",CreateNewContactElements.company).sendKeys("BizbeeL");

        elementFetch.getWebElement("Xpath",CreateNewContactElements.categoryIcon).click();


        Thread.sleep(2000);
        List<WebElement>listOfCategories = elementFetch.getWebElements("Xpath",CreateNewContactElements.categoryList);
        System.out.println("total no. of categories = " +listOfCategories.size());

        for (int i=0; i<listOfCategories.size(); i++){
            String categoryText = listOfCategories.get(i).getText();
            System.out.println(categoryText);

        if (categoryText.equalsIgnoreCase("affiliate")){
            listOfCategories.get(i).click();
        }
        }


        elementFetch.getWebElement("Xpath",CreateNewContactElements.countryIconInPhnNo).click();

        List<WebElement>listOfCountriesInPhnNo = elementFetch.getWebElements("Xpath",CreateNewContactElements.countryListInPhnNo);
        System.out.println("total no. of countries in phn no = "+listOfCountriesInPhnNo.size());

        for (int i=0;i<listOfCountriesInPhnNo.size();i++){
            String phnCountryText = listOfCountriesInPhnNo.get(i).getText();
            System.out.println(phnCountryText);

        if (phnCountryText.equalsIgnoreCase("bangladesh")){
            listOfCountriesInPhnNo.get(i).click();
        }
        }
        elementFetch.getWebElement("Xpath",CreateNewContactElements.phoneNumber).sendKeys("2241133443");
        elementFetch.getWebElement("Xpath",CreateNewContactElements.homeNumber).sendKeys("33444441");


        elementFetch.getWebElement("Xpath",CreateNewContactElements.saveButton).click();




    }



}
