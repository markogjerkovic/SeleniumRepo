package automationTests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WishlistTests extends BaseTest{

	
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
		String validEmail = excelReader.getStringData("MyWishlist", 1, 1); 
		String validPw = excelReader.getStringData("MyWishlist", 2, 1);
		indexPage.clickSignInUpButton();
		loginPage.insertEmailAddress(validEmail);
		loginPage.insertPassword(validPw);
		loginPage.clickSignInGreen();
	}

	
	
	//Verify that you can add one product to wishlist
//Verify that you can add multiple products to wishlist
	//Verify that you can remove wishlist
	@Test (priority=5)
public void addOneProductToWishlist()  { // pitati milovana da li assert funkcija mora da se pise u test caseu?!?!
	validLogin();
	myAccountPage.clickHomeButton();
	indexPage.clickBlouseProduct();
	indexPage.clickBlouseProductMoreButton();
	indexPage.clickWishlistButton();
	indexPage.clickWishlistButtonClose();
	idProductPage.clickAccount();
	myAccountPage.clickMyWishlistButton();
	assertEquals(true, myWishlistPage.getTableWishlist().isDisplayed());
	
}




}
