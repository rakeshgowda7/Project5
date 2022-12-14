package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SiblingFunctions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Solus\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ebay.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement dp = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select dropdown = new Select(dp);
		dropdown.selectByValue("//option[.='Cell Phones & Accessories']/following-sibling::option[4]");
		//option[.='Cell Phones & Accessories']/following-sibling::option[4]
		//option[.='Cell Phones & Accessories']/preceding-sibling::option[4]
		
		//combine multiple attributes
		
		//table[@class='gh-tbl2' and @role='presentation']
	}

}
