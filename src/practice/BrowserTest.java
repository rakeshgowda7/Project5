package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserTest {

//	@Test
//	public void OpenChromeBrowser() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/");
//		System.out.println(driver.getTitle());
//		driver.close();
//	}

	@Test
	public void OpenFireFoxBrowser() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
