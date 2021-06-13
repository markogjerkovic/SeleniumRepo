package automationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyWishlistPage {
	WebDriver driver;
	WebElement tableWishlist;
	WebElement tableQuantity;

	public MyWishlistPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getTableWishlist() {
		return driver.findElement(By.id("block-history"));
	}
	
	
	public WebElement getTableQuantity() {
		return driver.findElement(By.xpath("//*[@id=\"wishlist_34734\"]/td[2]"));
	}
	///////////////////////////////////////////////////
	public String textFromTableQuantity() {
		return this.getTableQuantity().getText();
	}
	
}
