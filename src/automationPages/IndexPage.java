package automationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class IndexPage {
	WebDriver driver;
	WebElement signInUp;
	WebElement blouseProduct;
	WebElement tShirtsProduct;
	WebElement blouseProductMoreButton;
	WebElement tShirtsProductMoreButton;
	WebElement proceedToChechoutButton;
	WebElement blouseProductAddToCartButton;
	WebElement removeFromCartButton;
	WebElement quantityCart;
	WebElement cartEmpty;

	public IndexPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getRemoveFromCartButton() {
		return driver.findElement(By.cssSelector(".cart_quantity_delete"));
	}

	public WebElement getCartEmpty() {
		return driver.findElement(By.cssSelector(".ajax_cart_no_product"));
	}
	

	public WebElement getQuantityCart() {
		return driver.findElement(By.cssSelector(".ajax_cart_quantity"));
	}

	public WebElement getBlouseProductAddToCartButton() {
		return driver.findElement(By.cssSelector(".button.ajax_add_to_cart_button.btn.btn-default"));
	}

	public WebElement getSignInUp() {
		return driver.findElement(By.className("login"));
	}

	public WebElement getProceedToChechoutButton() {
		return driver.findElement(By.className(".btn.btn-default.button.button-medium"));
	}

	public WebElement getBlouseProduct() {
		return driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]"));

	}

	public WebElement getTShirtsProduct() {
		return driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]"));
	}

	public WebElement getBlouseProductMoreButton() {
		return driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[2]"));
	}

	public WebElement getTShirtsProductMoreButton() {
		return driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[2]"));
	}

	///////////////////////////////////////
	public String textFromCartEmpty() {
		return this.getCartEmpty().getText();

	}
	
	public void clickRemoveFromCartButton() {
		 this.getRemoveFromCartButton().click();;

	}
	
	public String textFromQuantityCart() {
		return this.getQuantityCart().getText();

	}

	public void clickProceedToChechoutButton() {
		this.getProceedToChechoutButton().click();

	}

	public void clickBlouseProductAddToCartButton() {
		this.getBlouseProductAddToCartButton().click();

	}

	public void clickSignInUpButton() {
		this.getSignInUp().click();

	}

	public void clickBlouseProduct() {
		this.getBlouseProduct().click();
	}

	public void clickTShirtsProduct() {
		this.getTShirtsProduct().click();
	}

	public void clickBlouseProductMoreButton() {
		this.getBlouseProductMoreButton().click();
	}

	public void clickTShirtsProductMoreButton() {
		this.getTShirtsProductMoreButton().click();
	}

}
