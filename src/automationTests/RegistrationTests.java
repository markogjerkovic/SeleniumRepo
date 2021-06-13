package automationTests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseTest {

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

	@Test(priority = 5)
	public void goToUrl() {
		indexPage.getSignInUp().isDisplayed();

	}

	@Test(priority = 10)
	public void signInButton() {
		indexPage.clickSignInUpButton();
		loginPage.getEmailFieldRight().isDisplayed();
	}

	@Test(priority = 15)
	public void userCannotRegisterTwiceWithTheSameEmailAdress() {
		String validEmail = excelReader.getStringData("Registration", 18, 2);
		indexPage.clickSignInUpButton();
		loginPage.insertEmailAddressLeft(validEmail);
		loginPage.clickCreateAnAccountButton();
		loginPage.getError().isDisplayed();
	}

	@Test(priority = 15)
	public void RetrievePassword() {
		String validEmail = excelReader.getStringData("Registration", 28, 2);
		indexPage.clickSignInUpButton();
		loginPage.clickForgotPassword();
		loginPage.insertEmailFieldForLostPassword(validEmail);
		loginPage.clickRetrievePassword();
		String actual = loginPage.getTextFromConformation();
		assertEquals(actual, "A confirmation email has been sent to your address: randomrkoje123@gmail.com");
	}

}
