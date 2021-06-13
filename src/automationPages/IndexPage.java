package automationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class IndexPage {
	Actions actions;
	WebDriver driver;
	WebElement signInUp;
	WebElement blouseProduct;// cn product-image-container
	WebElement chiffonDressProduct; 
	WebElement blouseProductMoreButton; //*[@id="homefeatured"]/li[2]/div/div[2]/div[2]/a[2] 
	WebElement chiffonDressProductMoreButton; //*[@id="homefeatured"]/li[7]/div/div[2]/div[2]/a[2]
	WebElement wishlistButton;
	WebElement wishlistbuttonClose;
	

	public IndexPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getSignInUp() {
		return driver.findElement(By.className("login"));
	}
	public void clickSignInUpButton() {
		this.getSignInUp().click();
		
	}
	
	public WebElement getBlouseProduct() {
		return driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]"));
	//	return driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div"));
	}
	public WebElement getChiffonDressProduct() {
		return driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[7]/div/div[2]/div[2]/a[2]"));
	}
	public WebElement getBlouseProductMoreButton() {
		return driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[2]"));
	}
	public WebElement getChiffonDressProductMoreButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a"));
	}
	public WebElement getWishlistButton() {
		return driver.findElement(By.xpath("//*[@id=\"wishlist_button\"]"));
	}
	public WebElement getWishlistButtonClose() {
		return driver.findElement(By.xpath("//*[@id=\"product\"]/div[2]/div/div/a"));
	}
	///////////////////////////////////////
	
	public void clickBlouseProduct() {
		this.getBlouseProduct().click();
	}
	
	public void hoverOverBlouseProduct() {
		actions.moveToElement(this.getBlouseProduct()).build().perform();
	}
	public void hoverOverChiffonDressProduct() {
		actions.moveToElement(this.getChiffonDressProduct()).build().perform();
	}
	public void clickBlouseProductMoreButton() {
		this.getBlouseProductMoreButton().click();
	}
	public void clickChiffonDressProductMoreButton() {
		this.getChiffonDressProductMoreButton().click();
	}
	public void clickWishlistButton() {
		this.getWishlistButton().click();
	}
	public void clickWishlistButtonClose() {
		this.getWishlistButton().click();
	}

}
