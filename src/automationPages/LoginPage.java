package automationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPage {
	WebDriver driver;
	WebElement emailFieldLeft;
	WebElement emailFieldRight;
	WebElement passwordField;
	WebElement signInGreen;
	WebElement createAnAccount;
	WebElement forgotPassword;
	WebElement autentication;
	WebElement error;
	WebElement emailFieldForLostPassword;
	WebElement retrievePassword;
	WebElement conformation;
	WebElement errorAuthentication;

	

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getEmailFieldLeft() {
		return driver.findElement(By.id("email_create"));
	}

	public WebElement getEmailFieldRight() {
		return driver.findElement(By.id("email"));
	}

	public WebElement getPasswordField() {
		return driver.findElement(By.id("passwd"));
	}

	public WebElement getSignInGreen() {
		return driver.findElement(By.id("SubmitLogin"));
	}

	public WebElement getCreateAnAccount() {
		return driver.findElement(By.id("SubmitCreate"));
	}

	public WebElement getForgotPassword() {
		return driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/p[1]/a"));
	}

	public WebElement getAutentication() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1"));
	}

	public WebElement getError() {
		return driver.findElement(By.id("create_account_error"));
	}

	public WebElement getEmailFieldForLostPassword() {
		return driver.findElement(By.id("email"));
	}

	public WebElement getRetrievePassword() {
		return driver.findElement(By.xpath("//*[@id=\"form_forgotpassword\"]/fieldset/p/button"));
	}

	public WebElement getConformation() {
		return driver.findElement(By.cssSelector(".alert.alert-success"));
	}

	public WebElement getErrorAuthentication() {
		return driver.findElement(By.cssSelector(".alert.alert-danger"));
	}

	//////////////////////////////////

	public String getTextFromAutentication() {
		return this.getAutentication().getText();
	}

	public void insertEmailAddressLeft(String email) {
		this.getEmailFieldLeft().clear();
		this.getEmailFieldLeft().sendKeys(email);
	}

	public void clickCreateAnAccountButton() {
		this.getCreateAnAccount().click();
	}

	public String getTextFromError() {
		return this.getError().getText();
	}

	public void clickForgotPassword() {
		this.getForgotPassword().click();
	}

	public void clickRetrievePassword() {
		this.getRetrievePassword().click();
	}

	public void insertEmailFieldForLostPassword(String email) {
		this.getEmailFieldForLostPassword().clear();
		this.getEmailFieldForLostPassword().sendKeys(email);
	}

	public String getTextFromConformation() {
		return this.getConformation().getText();
	}

	public void insertEmailAddress(String email) {
		this.getEmailFieldRight().clear();
		this.getEmailFieldRight().sendKeys(email);
	}

	public void insertPassword(String pass) {
		this.getPasswordField().clear();
		this.getPasswordField().sendKeys(pass);
	}

	public void clickSignInGreen() {
		this.getSignInGreen().click();
	}
}
