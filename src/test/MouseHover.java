package test;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Solus\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/hovers");

		WebElement avatar = driver.findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[1]"));
		String printvalue = avatar.getAttribute("value");
		System.out.println(printvalue);
		String value = avatar.getCssValue(printvalue);
		System.out.println(value);

		Actions act = new Actions(driver);
		act.moveToElement(avatar).perform();
		driver.findElement(By.xpath("//a[@href='/users/1']")).click();
		boolean text = driver.findElement(By.xpath("//h1[.='Not Found']")).isDisplayed();
		String title = driver.getTitle();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		assertEquals(text, true);
		System.out.println(title);
		driver.quit();

	}

}
