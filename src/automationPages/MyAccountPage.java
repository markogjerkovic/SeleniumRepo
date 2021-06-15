package automationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MyAccountPage {
	WebDriver driver;
	WebElement myAddresses;
	WebElement logOutButton;
	WebElement homeButton;     
	WebElement myWishlistButton; 
	WebElement myPersonalInformationButton; 
	WebElement cartButton;

	
	public MyAccountPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getCartButton() {
		return driver.findElement(By.cssSelector(".shopping_cart"));
	}
	
	public WebElement getHomeButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/a"));
	}
	public WebElement getMyAddresses() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a"));
	}
	public WebElement getLogOutButton() {  
		return driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a"));
	}
	public WebElement getMyWishlistButton() {  
		return driver.findElement(By.className("lnk_wishlist"));
	}
	public WebElement getMyPersonalInformationButton() {  
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a"));
	}
	
	

	
	/////////////////////////////////////////////////
	public void clickCartButton() {
		this.getCartButton().click();
	}
	
	public void clickLogOutButton() {
		this.getLogOutButton().click();
	}
	public void clickMyAddressesButton() {
		this.getMyAddresses().click();
	}
	public void clickMyWishlistButton() {
		this.getMyWishlistButton().click();
	}
	public void clickHomeButton() {
		this.getHomeButton().click();
	}
	public void clickMyPersonalInformationButton() {
		this.getMyPersonalInformationButton().click();
	}
	


	
}
