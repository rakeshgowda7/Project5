package practice;

import org.testng.annotations.Test;

public class TestNgGroups {

	@Test(groups = { "sanity" })
	public void test1() {
		System.out.println("This is test 1");
	}

	@Test(groups = { "sanity", "smoke" })
	public void test2() {
		System.out.println("This is test 2");
	}

	@Test(groups = { "smoke", "regression" })
	public void test3() {
		System.out.println("This is test 3");
	}

	@Test(groups = { "smoke", "regression" })
	public void test4() {
		System.out.println("This is test 4");
	}
	
}
