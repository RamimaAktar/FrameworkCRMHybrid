package pageObjects;

public interface CreateNewContactElements{

String firstName = "//input[@name='first_name']";
String middleName = "//input[@name='middle_name']";
String lastName = "//input[@name='last_name']";


String addressStreet = "//input[@placeholder='Street Address']";
String addressCity = "//input[@placeholder='City']";
String addressState = "//input[@placeholder='State / County']";
String addressPostCode = "//input[@placeholder='Post Code']";
String countryNameICON = "(//i[@class='dropdown icon'])[7]";
String countryNameList = "//div[@role='listbox']//div";


String addressAddButton = "(//i[@class='add icon'])[3]";
String streetAddress2 = "(//input[@name='address'])[2]";
String cityAddress2 = "(//input[@name='city'])[2]";
String  stateAddress2 = "(//input[@name='state'])[2]";
String postCodeAddress2 = "(//input[@name='zip'])[2]";
String countryNameIcon2 = "(//i[@class='dropdown icon'])[8]";
String CountryNameList2 ="//div[@class='visible menu transition']//div";


String email = "//input[@placeholder='Email address']";
String emailCheckmark = "//i[@class='checkmark icon']";
String personalEmail = "//input[@placeholder='Personal email, Business, Alt...']";

String company = "(//input[@class='search'])[1]";

String categoryIcon = "(//i[@class='dropdown icon'])[3]";
String categoryList = "//div[@class='visible menu transition']//div";

String countryIconInPhnNo = "(//i[@class='dropdown icon'])[8]";
String countryListInPhnNo = "//div[@class='visible menu transition']//div";
String phoneNumber = "//input[@placeholder='Number']";
String homeNumber = "//input[@placeholder='Home, Work, Mobile...']";


String saveButton = "//button[@class='ui linkedin button']";

}
