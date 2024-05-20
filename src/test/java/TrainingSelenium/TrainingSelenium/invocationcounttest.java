package TrainingSelenium.TrainingSelenium;

import org.testng.annotations.Test;

public class invocationcounttest {
	@Test(invocationCount=10)
	public void sum() {
		int a=10,b=20;
		int c=a+b;
		System.out.print("Sum is :"+c);
	}

}
