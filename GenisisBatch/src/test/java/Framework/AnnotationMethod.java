package Framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationMethod {
	@BeforeClass
	public void beforeClass() {
		System.out.println("In before class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("In before method");
	}

	@Test()
	public void main1() {
		System.out.println("In main1");
	}

	@Test()
	public void main2() {
		System.out.println("In main2");
	}

	@AfterMethod()
	public void afterMethod() {
		System.out.println("In after method");
	}

	@AfterClass()
	public void afterClass() {
		System.out.println("In after class");
	}
}
