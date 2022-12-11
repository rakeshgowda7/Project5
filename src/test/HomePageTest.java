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

public class HomePageTest extends Testbase {

	HomePage homepage;
	LoginPage loginPage;
	SoftAssert SA;

	public HomePageTest() throws FileNotFoundException {
		super();
	}

	@BeforeMethod
	public void SetUp() throws FileNotFoundException {
		openbrowser();
		loginPage = new LoginPage();
		homepage = loginPage.Login(prop.getProperty("emailid"), prop.getProperty("pwd"));
	}

	@Test(priority = 1, dependsOnMethods = { "VerifyTitleTest" })
	public void VerifyUserProfileTest() {
		boolean UserName = homepage.verifyUserName();
		Assert.assertTrue(UserName);
	}

	@Test
	public void VerifyTitleTest() {
		String title = homepage.HomePageTitle();
		SA = new SoftAssert();
		SA.assertEquals(title,
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		SA.assertAll();

	}

	@Test(enabled = false)
	public void VerifyMobImgTest() {
		boolean flag = homepage.verifyMobileimage();
		Assert.assertTrue(flag);
	}

	@Test
	public void VerifyAdvertisePageTest() {
		homepage.VerifyMoreOptions();
		String title = driver.getTitle();
		Assert.assertEquals("Flipkart Ads Platform", title, "Title is not matched");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
