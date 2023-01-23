 package practice;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

	@Test
	public void LoginTest1() {
		System.out.println("Frst test");
		Assert.fail();
	}

	@Test
	public void LoginTest2() {
		System.out.println("second");
	}

	@Test(dataProvider = "getData")
	public void LoginTest3(String un, String pwd) {
		System.out.println(un);
		System.out.println(pwd);
	}
 
	@Test
	public void LoginTest4() {
		System.out.println("fourth test");
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "frstusername";
		data[0][1] = "frstpwd";
		data[1][0] = "secondusername";
		data[1][1] = "secondpwd";
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpwd";
		return data;

	}

}
