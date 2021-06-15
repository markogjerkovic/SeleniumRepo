package automationTests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import automationPages.IdProductPage;
import automationPages.IdentityPage;
import automationPages.IndexPage;
import automationPages.LoginPage;
import automationPages.MyAccountPage;
import automationPages.MyAddressesPage;
import automationPages.MyWishlistPage;
import automationTests.ExcelReader;

public class BaseTest {
	WebDriver driver;
	WebDriverWait wdwait;
	LoginPage loginPage;
	IndexPage indexPage;
	MyAddressesPage myAddressesPage;
	MyWishlistPage myWishlistPage;
	ExcelReader excelReader;
	MyAccountPage myAccountPage;
	String homeUrl;
	Actions actions;
	IdProductPage idProductPage;
	IdentityPage identityPage;

	@BeforeClass
	public void beforeAllTests() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		wdwait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		excelReader = new ExcelReader("data/projekat.xlsx");
		loginPage = new LoginPage(driver);
		indexPage = new IndexPage(driver);
		identityPage = new IdentityPage(driver, wdwait);
		myAccountPage = new MyAccountPage(driver);
		myAddressesPage = new MyAddressesPage(driver);
		myWishlistPage = new MyWishlistPage(driver);
		homeUrl = "http://automationpractice.com";
		idProductPage = new IdProductPage(driver, wdwait);

	}

	@AfterClass
	public void posleSvihTestova() {
		driver.close();
	}

}
