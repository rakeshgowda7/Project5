package pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Testbase;

public class HomePage extends Testbase {

	@FindBy(xpath = "//div[contains(text(),'Rakesh Gowda')]")
	private WebElement profileName;
	@FindBy(xpath = "//img[@alt='Mobiles']")
	private WebElement MobileImg;
	@FindBy(xpath = "//div[@class='exehdJ']")
	private WebElement More;
	@FindBy(xpath = "(//div[@class='_3vhnxf'])[3]")
	private WebElement Advertise;

	public HomePage() throws FileNotFoundException {
		PageFactory.initElements(driver, this);
	}

	public boolean verifyUserName() {
		profileName.equals("Rakesh Gowda");
		return true;
	}

	public String HomePageTitle() {
		return driver.getTitle();

	}

	public boolean verifyMobileimage() {
		return MobileImg.isDisplayed();
	}

	public Advertise VerifyMoreOptions() {
		Actions act = new Actions(driver);
		act.moveToElement(More).build().perform();
		Advertise.click();
		return new Advertise();
	}

}
