package automationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class IdProductPage {
	WebDriver driver;
	WebDriverWait wdwait;
	WebElement addToCartButton;
	WebElement addToWishlistButton;
	WebElement account;
	WebElement addToWishlistbuttonClose;
	WebElement proceedToCheckoutButton; 
	WebElement quantityUpButton;
	WebElement emptyCart;
	WebElement quantityField;
	public IdProductPage(WebDriver driver,WebDriverWait wdwait) {
		super();
		this.driver = driver;
		this.wdwait = wdwait;
	}
	public WebElement getQuantityField() {
		return driver.findElement(By.id("quantity_wanted"));
	}
	
	public WebElement getEmptyCart() {
		return driver.findElement(By.cssSelector(".ajax_cart_no_product"));
	}
	
	public WebElement getQuantityUpButton() {
		return driver.findElement(By.cssSelector(".btn.btn-default.button-plus.product_quantity_up"));
	}
	
	public WebElement getAddToCartButton() {
		return driver.findElement(By.id("add_to_cart"));
	}


	public WebElement getAddToWishlistButton() {
		return driver.findElement(By.id("wishlist_button"));
	}
	public WebElement getAddToWishlistButtonClose() {
		return driver.findElement(By.cssSelector(".fancybox-item.fancybox-close"));
	}
	public WebElement getAccount() {
		return driver.findElement(By.className("account"));
	}
	public WebElement getProceedToCheckoutButton() {
		return driver.findElement(By.cssSelector(".btn.btn-default.button.button-medium"));
	}

	
	
	
	//////////////////////////////////////////////////////////////
	public void wdwaitCart() {
		WebElement wdwaitCart = wdwait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".button.btn.btn-default.standard-checkout.button-medium")));
	}


	
	public void insertQuantityField(String quantity) {
		this.getQuantityField().clear();
		this.getQuantityField().sendKeys(quantity);
	}
	
	
	public String textFromEmptyCart() {
		return this.getEmptyCart().getText();
	}
	
	
	public void clickQuantityUpButton() {
		this.getQuantityUpButton().click();
	}
	
	public void clickAddToCartButton() {
		this.getAddToCartButton().click();
	}
	
	
	public void clickAddToWishlistButton() {
		this.getAddToWishlistButton().click();
	}
	public void clickAddToWishlistButtonClose() {
		this.getAddToWishlistButtonClose().click();
	}
	public void clickAccount() {
		this.getAccount().click();
	}
	public void clickProceedToCheckoutButton() {
		this.getProceedToCheckoutButton().click();
	}
	
	

}
