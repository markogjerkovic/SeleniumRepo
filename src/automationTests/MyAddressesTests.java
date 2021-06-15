package automationTests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAddressesTests extends BaseTest {

	@BeforeMethod
	public void beforeAllMethods() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
		String validEmail = excelReader.getStringData("MyAddress", 1, 1);
		String validPw = excelReader.getStringData("MyAddress", 2, 1);
		indexPage.clickSignInUpButton();
		loginPage.insertEmailAddress(validEmail);
		loginPage.insertPassword(validPw);
		loginPage.clickSignInGreen();
	}

	@AfterMethod
	public void afterAllMethods() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}

	@Test(priority = 5)
	public void updateAddress() {
		String address = excelReader.getStringData("MyAddress", 10, 2);
		myAccountPage.clickMyAddressesButton();
		myAddressesPage.clickUpdateAddressButton();
		myAddressesPage.insertDifferentAddress(address);
		myAddressesPage.clickSaveAddressButton();
		String actual = myAddressesPage.textFromAssertAddress();
		assertEquals(actual, address);
	}

	@Test(priority = 10)
	public void updateADifferentState() {
		String state = excelReader.getStringData("MyAddress", 18, 2);
		myAccountPage.clickMyAddressesButton();
		myAddressesPage.clickUpdateAddressButton();
		myAddressesPage.selectState(state);
		myAddressesPage.clickSaveAddressButton();
		myAddressesPage.getStateAssert().equals(state);
	}

	@Test(priority = 15)
	public void deleteAddress() {//user myst have 2 addresses
		myAccountPage.clickMyAddressesButton();
		myAddressesPage.clickDeleteAddressButton();
		driver.switchTo().alert().accept();
		assertEquals(myAddressesPage.getAddressesList().size(), 1);
	}

}
