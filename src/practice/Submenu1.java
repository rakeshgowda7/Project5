package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Submenu1 {
	@Test
	public void mousehover() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Solus\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement electronics = driver
				.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Electronics')]"));
		Actions act = new Actions(driver);
		act.moveToElement(electronics).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Computers and tablets')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Computers and tablets')]")).click();
		String title = driver.getTitle();

		System.out.println(driver.getTitle());
		Assert.assertEquals(title, "Computer, Laptops, Tablets & Network Hardware for Sale - eBay");
		driver.close();
	}

}
