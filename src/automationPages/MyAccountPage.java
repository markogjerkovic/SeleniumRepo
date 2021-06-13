package automationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyAccountPage {
	WebDriver driver;
	WebElement myAddresses;
	WebElement logOutButton;
	WebElement homeButton;     
	WebElement myWishlistButton; 

	
	public MyAccountPage(WebDriver driver) {
		super();
		this.driver = driver;
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

	
	/////////////////////////////////////////////////
	
	
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
	
	


	
}
