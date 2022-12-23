package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class MouseHover {
	WebDriver driver;

	@Parameters({ "browser" })
	@BeforeTest
	public void openbrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Solus\\Desktop\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.ebay.com/");
		}
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Solus\\Desktop\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.ebay.com/");
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}

	@Test
	public void mousehoverTest() throws IOException {

		WebElement ele = driver.findElement(By.xpath("(//a[.='Electronics'])[2]"));

		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions
//				.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Computers and tablets')]")));
		WebElement ele1 = driver.findElement(By.xpath("//a[contains(text(),'Computers and tablets')]"));
		act.moveToElement(ele1).click().build().perform();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://www.ebay.com/b/Computers-Tablets-Network-Hardware/58058/bn_1865247");

//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File Src = ts.getScreenshotAs(OutputType.FILE);
//		File dst = new File("C:\\Users\\Solus\\Pictures\\Screenshots\ss1.png");
//		Files.copy(Src, dst);

		driver.close();
	}

}
