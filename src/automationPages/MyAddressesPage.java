package automationPages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;

public class MyAddressesPage {
	WebDriver driver;
	Select sel;
	WebElement updateAddressButton;
	WebElement addressField;
	WebElement saveAddressButton;
	WebElement newAddressAssert;
	WebElement stateField;
	WebElement stateAssert;
	WebElement deleteAddressButton;
	WebElement deleteAddressOK;
	List<WebElement> addressesList;

	public MyAddressesPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getDeleteAddressButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div[1]/ul/li[9]/a[2]/span"));
	}

	public WebElement getStateAssert() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div[1]/ul/li[5]/span[2]"));
	}

	public WebElement getNewAddressAssert() {
		return driver.findElement(By.className("address_address1"));
	}

	public WebElement getUpdateAddressButton() {
		return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/div/div[1]/ul/li[9]/a[1]"));
	}

	public WebElement getAddressField() {
		return driver.findElement(By.id("address1"));
	}

	public WebElement getSaveAddressButton() {
		return driver.findElement(By.id("submitAddress"));
	}

/////////////////////////////////////////// metode

	public void clickUpdateAddressButton() {
		this.getUpdateAddressButton().click();
	}

	public void insertDifferentAddress(String adress) {
		this.getAddressField().clear();
		this.getAddressField().sendKeys(adress);
	}

	public void clickSaveAddressButton() {
		this.getSaveAddressButton().click();
	}

	public String textFromAssertAddress() {
		return this.getNewAddressAssert().getText();
	}

	public void clickENTER() {
		driver.findElement(By.cssSelector(".columns-container")).sendKeys(Keys.ENTER);

	}

	public void selectState(String state) {
		sel = new Select(driver.findElement(By.id("id_state")));
		sel.selectByVisibleText(state);

	}

	public void stateAssert() {
		System.out.println(this.getStateAssert().getText());
	}

	public void clickDeleteAddressButton() {
		this.getDeleteAddressButton().click();

	}

	public List<WebElement> getAddressesList() {
		return driver.findElements(By.cssSelector(".col-xs-12.col-sm-6.address"));
	}

}
