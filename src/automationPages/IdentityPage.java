package automationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IdentityPage {
	WebDriver driver;
	WebDriverWait wdwait;
	WebElement firstNameField;
	WebElement lastNameField;
	WebElement saveButton; 
	WebElement currentPasswordField; 
	WebElement alertSuccess; 
	
	
	public IdentityPage(WebDriver driver,WebDriverWait wdwait) {
		super();
		this.driver = driver;
		this.wdwait = wdwait;
	}


	public WebElement getFirstNameField() {
		return driver.findElement(By.id("firstname"));
	}


	public WebElement getLastNameField() {
		return driver.findElement(By.id("lastname"));
	}


	public WebElement getSaveButton() {
		return driver.findElement(By.name("submitIdentity"));
	}


	public WebElement getCurrentPasswordField() {
		return driver.findElement(By.id("old_passwd"));
	}


	public WebElement getAlertSuccess() {
		return driver.findElement(By.cssSelector(".alert.alert-success"));
	}
	////////////////////////////////////
	public void insertNewFirstName(String name) {
		this.getFirstNameField().clear();
		this.getFirstNameField().sendKeys(name);
	}
	public void insertNewLastName(String lastname) {
		this.getLastNameField().clear();
		this.getLastNameField().sendKeys(lastname);
	}
	public void insertValidPassword(String password) {
		this.getCurrentPasswordField().clear();
		this.getCurrentPasswordField().sendKeys(password);
	}
	
	public void clickSaveButton() {
		this.getSaveButton().click();
	}
	public String textFromAlert() {
		return this.getAlertSuccess().getText();
	}
	public void wdwaitAlert() {
		WebElement wdwaitAlert = wdwait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".alert.alert-success")));
	
	}
	
	
	
}
