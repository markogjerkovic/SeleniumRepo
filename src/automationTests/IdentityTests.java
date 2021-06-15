package automationTests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IdentityTests extends BaseTest {
	
	@BeforeMethod
	public void beforeAllMethods() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
		String validEmail = excelReader.getStringData("Identity", 1, 1); 
		String validPw = excelReader.getStringData("Identity", 2, 1);
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
	public void updateFirstname()  {
		String name = excelReader.getStringData("Identity", 9, 2);
		String password = excelReader.getStringData("Identity", 10, 2);
		myAccountPage.clickMyPersonalInformationButton();
		identityPage.insertNewFirstName(name);
		identityPage.insertValidPassword(password);
		identityPage.clickSaveButton();
		identityPage.wdwaitAlert();
		String actual = identityPage.textFromAlert();
		assertEquals(actual, "Your personal information has been successfully updated.");
	}
	@Test(priority = 10)
	public void updateLastName()  {
		String lastname = excelReader.getStringData("Identity", 17, 2);
		String password = excelReader.getStringData("Identity", 18, 2);
		myAccountPage.clickMyPersonalInformationButton();
		identityPage.insertNewLastName(lastname);
		identityPage.insertValidPassword(password);
		identityPage.clickSaveButton();
		String actual = identityPage.textFromAlert();
		assertEquals(actual, "Your personal information has been successfully updated.");
	}
	
}   

