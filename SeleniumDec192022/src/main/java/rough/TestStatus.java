package rough;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestStatus {

	/*
	 * TestNG status codes
	 * 1-PASS
	 * 2-FAIL
	 * 3-SKIP
	 * 
	 */
	@Test
	public void t1() {
		System.out.println("Executing t1 test");
		throw new SkipException("Skipping it explicitely");
	}

	@AfterMethod
	public void main(ITestResult result) {
		System.out.println(result.getStatus());

	}
}
