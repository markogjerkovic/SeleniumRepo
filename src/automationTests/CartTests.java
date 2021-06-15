package automationTests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTests extends BaseTest {
	
	@BeforeMethod
	public void beforeAllMethods() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
		String validEmail = excelReader.getStringData("AddProductsToCart", 1, 1); 
		String validPw = excelReader.getStringData("AddProductsToCart", 2, 1);
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

	@Test (priority = 5)
	public void addOneProductToCart() {
		myAccountPage.clickHomeButton();
		indexPage.clickBlouseProduct();
		indexPage.clickBlouseProductMoreButton();
		idProductPage.clickAddToCartButton();
		idProductPage.clickProceedToCheckoutButton();
		assertEquals(indexPage.textFromQuantityCart(), "1");
	
	}
	@Test (priority = 10)
	public void addOneProductToCartFourTimes() {
		myAccountPage.clickHomeButton();
		indexPage.clickBlouseProduct();
		indexPage.clickBlouseProductMoreButton();
		for (int i = 0; i < 3; i++) {
			idProductPage.clickQuantityUpButton();
		}
		idProductPage.clickAddToCartButton();
		idProductPage.clickProceedToCheckoutButton();
		assertEquals(indexPage.textFromQuantityCart(), "4");
	
	}
	@Test (priority = 15)
	public void removeProductFromCart()   {
		
		myAccountPage.clickHomeButton();
		indexPage.clickBlouseProduct();
		indexPage.clickBlouseProductMoreButton();
		idProductPage.clickAddToCartButton();
		idProductPage.clickProceedToCheckoutButton();
		indexPage.clickRemoveFromCartButton();
		
		String actual = indexPage.textFromCartEmpty();
		assertEquals(actual, "");
	}
	@Test (priority = 20)          
	
	public void addMinusOneProductToCart()  {
		String quantity = excelReader.getStringData("AddProductsToCart", 41, 2); 
		myAccountPage.clickHomeButton();
		indexPage.clickBlouseProduct();
		indexPage.clickBlouseProductMoreButton();
		idProductPage.insertQuantityField(quantity);
		idProductPage.clickAddToCartButton();
		idProductPage.clickProceedToCheckoutButton();
		idProductPage.wdwaitCart();
		assertEquals(indexPage.textFromQuantityCart(), "1");
	}

	

}
