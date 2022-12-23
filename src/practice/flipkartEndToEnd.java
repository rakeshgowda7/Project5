package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flipkartEndToEnd {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Solus\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ebay.com/");
		WebElement electronics = driver
				.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Electronics')]"));
		Actions act = new Actions(driver);
		act.moveToElement(electronics).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(.,'Computers and tablets')]")));
		driver.findElement(By.xpath("//a[contains(.,'Computers and tablets')]")).click();
		System.out.println(driver.getTitle());
		List<WebElement> itemsNeeded = driver
				.findElements(By.xpath("//div[@class='b-visualnav__img b-visualnav__img__default']"));
		for (int i = 0; i < itemsNeeded.size(); i++) {
			String itemName = itemsNeeded.get(i).getText();
			if (itemName.equalsIgnoreCase("iPads")) {
				driver.findElements(By.xpath("//a[@class='b-visualnav__tile b-visualnav__tile__default']"
						+ "//div[@class='b-visualnav__title']")).get(i).click();
				System.out.println(driver.getTitle());
			}
		}

		driver.close();

	}
}
