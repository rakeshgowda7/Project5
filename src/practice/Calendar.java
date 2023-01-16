package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calendar {
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Solus\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.redbus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//button[contains(text(),'Accept All')]")).click();
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();

		String month = driver
				.findElement(By.xpath("(//div[@class='DayNavigator__CalendarHeader-sc-1tlckkc-1 ccLrBz'])[2]"))
				.getText();
		System.out.println(month);
		while (!month.contentEquals("January 2024")) {
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//div[@id='next']")));
			driver.findElement(By.xpath("//div[@id='next']")).click();
		}
		driver.findElement(
				By.xpath("//div[@class='DayTiles__CalendarDaysBlock-sc-14em0t0-0 eUrtce']//span[contains(.,'14')]"))
				.click();
 
	}

}
