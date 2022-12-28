package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceEndToEnd {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Solus\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String productName = "ADIDAS ORIGINAL";
		driver.get("https://www.rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("as.rakeshgowda@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("aSR@7892931377");
		driver.findElement(By.id("login")).click();

		List<WebElement> products = driver.findElements(By.cssSelector(".col-lg-4"));
		WebElement prod = products.stream().filter(product -> product.getText().equalsIgnoreCase(productName))
				.findFirst().orElse(null);
		prod.findElement(By.xpath("(//button[@class='btn w-10 rounded'])[2]")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
