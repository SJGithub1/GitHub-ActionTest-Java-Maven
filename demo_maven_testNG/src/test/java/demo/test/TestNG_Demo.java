package demo.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNG_Demo {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("--In Before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("--In After method");
	}

	@Test
	public void Test001() {
		
		System.out.println("Test001 Passed.");
	}

}
