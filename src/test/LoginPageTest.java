package test;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.Testbase;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends Testbase {

	LoginPage loginpage = new LoginPage();
	HomePage homePage;
	SoftAssert SA;

	public LoginPageTest() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setUp() throws FileNotFoundException {
		openbrowser();
		loginpage = new LoginPage();
	}

	@Test
	public void LoginTest() throws FileNotFoundException {
		SA = new SoftAssert();
		homePage = loginpage.Login(prop.getProperty("emailid"), prop.getProperty("pwd"));
		String title = driver.getTitle();
		Assert.assertEquals(title,
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
