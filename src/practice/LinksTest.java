package practice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinksTest {
	@Test
	public void links() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Solus\\Desktop\\drivers\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> pageLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total page links : " + pageLinks.size());
 
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		List<WebElement> footerLinks = footer.findElements(By.tagName("a"));
		System.out.println("Footer page links : " + footerLinks.size());

		WebElement footersubscetion = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		List<WebElement> footersublinks = footersubscetion.findElements(By.tagName("a"));
		System.out.println("Footer subsection links : " + footersublinks.size());

		for (int i = 1; i < footersublinks.size(); i++) {
			footersublinks.get(i).sendKeys(Keys.CONTROL, Keys.ENTER);

		}

		// Get the Title of all windows by switching each window
		Set<String> allids = driver.getWindowHandles();
		for (String id : allids) {
			String Title = driver.switchTo().window(id).getTitle();
			System.out.println(Title);
		}

		driver.quit();

	}

}
