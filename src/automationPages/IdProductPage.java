package automationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdProductPage {
	WebDriver driver;
	WebElement addToCart;
	WebElement addToWishlist;
	WebElement popUpWishlist;
	WebElement account;

	public IdProductPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getAddToCart() {
		return driver.findElement(By.id("add_to_cart"));
	}

	public WebElement getAddToWishlist() {
		return driver.findElement(By.id("wishlist_button"));
	}
	public WebElement getPopUpWishlist() {
		return driver.findElement(By.xpath("//*[@id=\"product\"]/div[2]/div/div/a"));
	}
	public WebElement getAccount() {
		return driver.findElement(By.className("account"));
	}
	
	
	
	//////////////////////////////////////////////////////////////
	public void clickAddToCart() {
		this.getAddToCart().click();
	}
	public void clickAddToWishlist() {
		this.getAddToWishlist().click();
	}
	public void closePopUpWishlist() {
		this.getPopUpWishlist().click();
	}
	public void clickAccount() {
		this.getAccount().click();
	}
}
