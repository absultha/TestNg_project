package testNg;

import org.testng.annotations.Test;

public class Testcase2 extends Baseclass{
@Test(groups= {"sanity"},dependsOnMethods="CCTest")
	public void CreditCardTest() {

		System.out.println("inside credit card");

	}

@Test(groups= {"sanity"})
public void CCTest() {

	System.out.println("inside CC Test");

}
}
