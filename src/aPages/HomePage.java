package aPages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import aBaseTest.BaseTest;

public class HomePage extends BaseTest {

	@FindBy(xpath = "//div[@class='item']")
	private List<WebElement> cousrseList;
	@FindBy(css = "a[href='https://www.rahulshettyacademy.com/AutomationPractice']")
	private WebElement Practice;
	public String text = "";

	@FindBy(xpath = "//div[@class='marquee0']/div")
	private WebElement Color;

	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public RegisterPage courseSelect() throws IOException {
		for (int i = 0; i < cousrseList.size(); i++) {
			text = cousrseList.get(i).getText();
			if (text.contains("Learn SQL in Practical + Database Testing from Scratch")) {
				cousrseList.get(i).click();
				break;

			}

		}
		return new RegisterPage();

	}

	public PracticePage PracticePage() {
		Practice.click();
		return new PracticePage();
	}

	public void cssvalue() {
		System.out.println(Color.getCssValue("color"));
	}

}
