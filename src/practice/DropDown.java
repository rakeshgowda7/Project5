package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Solus\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ebay.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement dp = driver.findElement(By.id("gh-cat"));
		Select dropdown = new Select(dp);
//		List<WebElement> allOptions = dropdown.getOptions();
//		System.out.println(allOptions);
		dropdown.selectByIndex(1);
		dropdown.selectByIndex(2);

		/* we can use deselectAll() for multi-select dropdown */
//		dropdown.deselectAll();
		boolean dp1 = dropdown.isMultiple();
		if (dp1 == true) {
			System.out.println("Its a single select dropdown");
		}
//		else {
//			System.out.println("Its a multi-select dropdown");
//		}
//		dropdown.selectByValue("Baby");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='gh-cat']")));
//		dropdown.selectByVisibleText("Books");
//		List<WebElement> options = dropdown.getAllSelectedOptions();

//		System.out.println(options);

		driver.close();

	}

}
