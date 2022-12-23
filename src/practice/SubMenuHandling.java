package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SubMenuHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Solus\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7892931377");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ASR@7892931377");
		driver.findElement(By.xpath("(//span[contains(text(),'Login')])[2]")).click();
//		WebElement electronics = driver.findElement(By.xpath("img[alt='Electronics']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(),'Rakesh Gowda')]")));
		WebElement user = driver.findElement(By.xpath("//div[contains(text(),'Rakesh Gowda')]"));
		Actions act = new Actions(driver);
		act.moveToElement(user).build().perform();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Orders')]")));
		driver.findElement(By.xpath("//div[contains(text(),'Orders')]")).click();
		String Text = driver.getTitle();
		System.out.println(Text);
		

	}

}
