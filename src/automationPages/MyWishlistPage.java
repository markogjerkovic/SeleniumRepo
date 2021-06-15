package automationPages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyWishlistPage {
	WebDriver driver;
	WebElement tableWishlist;
	WebElement xButton;
	WebElement textFromQuantity;
	

	public MyWishlistPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getTextFromQuantity() {
		return driver.findElement(By.cssSelector(".bold.align_center"));
	}
	
	
	public WebElement getTableWishlist() {
		return driver.findElement(By.id("block-history"));
	}
	
	public WebElement getXButton() {
		return driver.findElement(By.className("icon-remove"));
	}
	//////////////////////////////////////////////////
	public void clickXButton() {
		this.getXButton().click();
	}

	public boolean elementIsNotPresent() {
        try {
            this.getXButton();
            return true;
        }catch(Exception e) {
            return false;
        }
    } 
	

	 public String textFromQuantity() {
		 return this.getTextFromQuantity().getText();
	 }
}
