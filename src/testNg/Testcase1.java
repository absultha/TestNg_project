package testNg;
import org.testng.annotations.Test;


public class Testcase1 extends Baseclass {
	@Test(priority=0,description="This test case is to test home loan functionality")
	public void HomeLoanTest() {
		System.out.println("Inside Home Loan");
	}
	@Test(priority=1,description="This test case is to test home loan functionality")
	public void HomeLoanTest1() {
		System.out.println("Inside Home Loan1");
	}
	@Test(priority=2,groups= {"sanity"},description="This test case is to test car loan functionality")
	public void CarLoanTest() {
		System.out.println("Inside Car Loan");
	}
	

}
