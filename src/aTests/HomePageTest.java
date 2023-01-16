package aTests;

import java.io.IOException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import aBaseTest.BaseTest;
import aPages.HomePage;

public class HomePageTest extends BaseTest {
	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public HomePage homepage;
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	public WebDriverWait wait;

	@BeforeMethod
	public void tearUp() throws IOException {
		openBrowser();
		homepage = new HomePage();
	}

	@Test(enabled = false)
	public void VerifyHomePageTest() throws IOException {
		homepage.courseSelect();
		Assert.assertEquals(driver.getTitle(), "Rahul Shetty Academy");
	}

	@Test(enabled = false)
	public void PracticePageVerify() {
		homepage.PracticePage();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://www.rahulshettyacademy.com/AutomationPractice/", "found wrong url");
	}

	@Test
	public void cssVerify() {
		homepage.cssvalue();
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
