package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	@BeforeTest
	public void BeforeTestMethod() {
		System.out.println("inside Before Test");
	}
	@BeforeClass
	public void BeforeClassM() {
		System.out.println("Before Class");
	}
		@BeforeMethod(alwaysRun=true)
		public void setup() {
			System.out.println("inside Before Method");
		}
		@AfterMethod(alwaysRun=true)
		public void teardown() {
			System.out.println("inside After Method ");
		}
		@AfterClass
		public void AfterClassM() {
			System.out.println("After Class");
		}
			
		@AfterTest
		public void AfterTestMethod()
		{
			System.out.println("inside After Test");
		}


}
