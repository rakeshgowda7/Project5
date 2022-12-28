package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartEndToEnd1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Solus\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		Actions act = new Actions(driver);

		List<WebElement> modules = driver.findElements(By.xpath("//div[@class='_37M3Pb']/div"));
//		modules.stream().filter(module->module.getText().equalsIgnoreCase("Electroonics"))

		for (WebElement module : modules) {
			String text = module.getText();
			if (text.equalsIgnoreCase("Electronics")) {

				act.moveToElement(module).build().perform();
				break;
			}
		}
		List<WebElement> subModules = driver.findElements(By.cssSelector("._6WOcW9"));
		for (WebElement module : subModules) {
			String text = module.getText();
			if (text.equalsIgnoreCase("Gaming")) {
				act.moveToElement(module).click().build().perform();
				Thread.sleep(3000);
				System.out.println(driver.getTitle());
				break;
			}
		}

//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7892931377");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ASR@7892931377");
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
//		WebElement profile = driver.findElement(By.xpath("(//div[@class='exehdJ']"));
//		Actions act = new Actions(driver);
//		act.moveToElement(profile).build().perform();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(.,'Advertise')]")));
//		driver.findElement(By.xpath("//div[contains(.,'Advertise')]")).click();
//		System.out.println(driver.getTitle());

		driver.close();

	}

}
