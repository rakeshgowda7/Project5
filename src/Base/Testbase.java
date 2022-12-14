package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import qa_utilities.TestUtil;

public class Testbase {
	public static WebDriver driver;
	public static Properties prop;

	public Testbase() throws FileNotFoundException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Solus\\Desktop\\automation\\project5\\src\\config\\config.properties");
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void openbrowser() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Solus\\Desktop\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		} else {
			System.out.println("Launching mozilla");
		}
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.pageTime_Load));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.implicit_wait));
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		

	}
}
