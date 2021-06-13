package automationTests;




import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automationPages.MyAccountPage;

public class LoginTests extends BaseTest {
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
	public void loginWithValidCredentials() {
		indexPage.clickSignInUpButton();
		String validEmail = excelReader.getStringData("Login", 7, 2); 
		String validPw = excelReader.getStringData("Login", 8, 2); 
		
		loginPage.insertEmailAddress(validEmail);
		loginPage.insertPassword(validPw);
		loginPage.clickSignInGreen();
		myAccountPage.getMyAddresses().isDisplayed();
	}
	
	@Test(priority = 10)
	public void loginWithInvalidCredentials() {
		String invalidEmail = excelReader.getStringData("Login", 17, 2); 
		String invalidPw = excelReader.getStringData("Login", 18, 2);
		indexPage.clickSignInUpButton();
		loginPage.insertEmailAddress(invalidEmail);
		loginPage.insertPassword(invalidPw);
		loginPage.clickSignInGreen();
		loginPage.getErrorAuthentication().isDisplayed();
	}

 	@Test(priority = 15)
	public void loginWithInvalidEmail() {
 		String invalidEmail = excelReader.getStringData("Login", 27, 2); 
 		String validPw = excelReader.getStringData("Login", 28, 2); 
		indexPage.clickSignInUpButton();
		loginPage.insertEmailAddress(invalidEmail);
		loginPage.insertPassword(validPw);
		loginPage.clickSignInGreen();
		loginPage.getErrorAuthentication().isDisplayed();
}
	@Test(priority = 20)
	public void loginWithInvalidPassword() {
		String validEmail = excelReader.getStringData("Login", 37, 2); 
		String invalidPw = excelReader.getStringData("Login", 38, 2); 
		indexPage.clickSignInUpButton();
		loginPage.insertEmailAddress(validEmail);
		loginPage.insertPassword(invalidPw);
		loginPage.clickSignInGreen();
		loginPage.getErrorAuthentication().isDisplayed();
}
	@Test(priority = 25)
	public void loginWithEmptyCredentials() {
		String blankEmail = excelReader.getStringData("Login", 47, 2); 
		String blankPw = excelReader.getStringData("Login", 48, 2); 
		indexPage.clickSignInUpButton();
		loginPage.insertEmailAddress(blankEmail);
		loginPage.insertPassword(blankPw);
		loginPage.clickSignInGreen();
		loginPage.getErrorAuthentication().isDisplayed();
}
	
	@Test(priority = 30)
	public void userCanLogout() {
		String validEmail = excelReader.getStringData("Login", 57, 2); 
		String validPw = excelReader.getStringData("Login", 58, 2); 
		indexPage.clickSignInUpButton();
		loginPage.insertEmailAddress(validEmail);
		loginPage.insertPassword(validPw);
		loginPage.clickSignInGreen();
		myAccountPage.clickLogOutButton();
		loginPage.getEmailFieldRight().isDisplayed();
}
	
}
