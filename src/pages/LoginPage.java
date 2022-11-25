package pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Testbase;

public class LoginPage extends Testbase {

	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	private WebElement email;
	@FindBy(xpath = " //input[@type='password']")
	private WebElement password;
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement loginButton;

	// initialize

	public LoginPage() throws FileNotFoundException {
		PageFactory.initElements(driver, this);
	}

	public HomePage Login(String un, String pwd) throws FileNotFoundException {
		email.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
		
		return new HomePage();
	}
}