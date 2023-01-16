package aTests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import aBaseTest.BaseTest;
import aPages.HomePage;
import aPages.RegisterPage;

public class RegisterPageTest extends BaseTest {

	public RegisterPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public HomePage homepage;
	public RegisterPage regPage;
	WebDriverWait wait;

	@BeforeMethod
	public void tearUp() throws IOException {
		openBrowser();
		homepage = new HomePage();
		regPage = new RegisterPage();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	@Test
	public void VerifyRegisterPageTitleTest() throws IOException {
		homepage.courseSelect();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[contains(.,'Mentorship')]")));
		regPage.courseSelection();
		Assert.assertEquals(driver.getTitle(), "Rahul Shetty Academy");
		String text = driver.findElement(By.xpath("//h1[.='Mentorship']")).getText();
		System.out.println("Text contains " + text);

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
