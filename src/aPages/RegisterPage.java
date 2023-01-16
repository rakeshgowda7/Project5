package aPages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import aBaseTest.BaseTest;

public class RegisterPage extends BaseTest {

	@FindBy(css = ".inner-box")
	private List<WebElement> Courses;

	public RegisterPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public void courseSelection() {
		for (int i = 0; i < Courses.size(); i++) {
			String text = Courses.get(i).getText();
			System.out.println(text);
			if (text.contains("Guidance and support to take your QA career to next level.")) {
				Courses.get(i).click();
				break;
			}
		}
	}
}
