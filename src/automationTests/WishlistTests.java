package automationTests;

import static org.testng.Assert.assertEquals;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WishlistTests extends BaseTest{

	
	@BeforeMethod
	public void beforeAllMethods() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
		String validEmail = excelReader.getStringData("MyWishlist", 1, 1); 
		String validPw = excelReader.getStringData("MyWishlist", 2, 1);
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

	
	@Test (priority=5)
public void addOneProductToWishlist()  {
	
	myAccountPage.clickHomeButton();
	indexPage.clickBlouseProduct();
	indexPage.clickBlouseProductMoreButton();
	idProductPage.clickAddToWishlistButton();
	idProductPage.clickAddToWishlistButtonClose();
	idProductPage.clickAccount();
	myAccountPage.clickMyWishlistButton();
	assertEquals(true, myWishlistPage.getTableWishlist().isDisplayed());
	
}
	
	@Test (priority=10)
	public void removeWishlist()  {
	myAccountPage.clickMyWishlistButton();
	myWishlistPage.clickXButton();
	driver.switchTo().alert().accept();
	myWishlistPage.elementIsNotPresent();
	}

	@Test (priority=15)
	public void addTwoProductsToWishlist()  { 
		
		myAccountPage.clickHomeButton();
		indexPage.clickBlouseProduct();
		indexPage.clickBlouseProductMoreButton();
		idProductPage.clickAddToWishlistButton();
		idProductPage.clickAddToWishlistButtonClose();
		driver.navigate().back();
		indexPage.clickTShirtsProduct();
		indexPage.clickTShirtsProductMoreButton();
		idProductPage.clickAddToWishlistButton();
		idProductPage.clickAddToWishlistButtonClose();
		idProductPage.clickAccount();
		myAccountPage.clickMyWishlistButton();
		assertEquals(myWishlistPage.textFromQuantity(), "2");
	} 
	

}
