package automationTests;

import static org.testng.Assert.assertEquals;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAddressesTests extends BaseTest{
	
	
	@BeforeMethod
	public void beforeAllMethods() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void afterAllMethods() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
	public void validLogin() {
		String validEmail = excelReader.getStringData("MyAddress", 1, 1); 
		String validPw = excelReader.getStringData("MyAddress", 2, 1);
		indexPage.clickSignInUpButton();
		loginPage.insertEmailAddress(validEmail);
		loginPage.insertPassword(validPw);
		loginPage.clickSignInGreen();
	}
	
//////////////////////////////////////////////////////////////////
	
	@Test (priority = 5)
	public void updateAddress() {
		validLogin();
		myAccountPage.clickMyAddressesButton();
		myAddressesPage.clickUpdateAddressButton();
		myAddressesPage.insertDifferentAddress("nova adr 22");
		myAddressesPage.clickSaveAddressButton();
		String actual = myAddressesPage.textFromAssertAddress();
		assertEquals(actual, "nova adr 22");
	}	 
	
	@Test (priority = 10)
	public void updateADifferentState()  {
		validLogin();
		String state = excelReader.getStringData("MyAddress", 18, 2); 
		myAccountPage.clickMyAddressesButton();
		myAddressesPage.clickUpdateAddressButton();
		myAddressesPage.selectState(state);
		myAddressesPage.clickSaveAddressButton();
		myAddressesPage.getStateAssert().equals(state);
	} 
	@Test (priority = 15) 
	public void deleteAddress()  {
		validLogin();
		myAccountPage.clickMyAddressesButton();
		myAddressesPage.clickDeleteAddressButton();
		driver.switchTo().alert().accept();
		assertEquals(myAddressesPage.getAddressesList().size(), 1);
	}
	
}
