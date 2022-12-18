package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;


public class TeseNGAnnotations {

	
	@BeforeClass
	public void beforeClass () {
		System.out.println("This is Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod1 () {
		System.out.println("This is Before Method 1");
	}
	
	@BeforeMethod
	public void beforeMethod2 () {
		System.out.println("This is Before Method 2");
	}
	
	@BeforeMethod
	public void beforeMethod3 () {
		System.out.println("This is Before Method 3");
	}
	
	@Test
	public void LoginTest () {
			System.out.println("This is Original Test 1");
	}
	
	@Test()
	public void VerfyHomeScreen () {
		System.out.println("This is Original Test 2");
	}
	
	@Test
	public void Test3 () {
		System.out.println("This is Original Test 3");
	}
	
	@Test
	public void Test4 () {
		System.out.println("This is Original Test 4");
	}
	
	@AfterMethod
	public void afterMethod () {
		System.out.println("This is After Method");
	}
	
	@AfterClass
	public void afterClass () {
		System.out.println("This is After Class");
	}
	
	
	@AfterTest
	public void AfterTest () {
		System.out.println("This is After test");
	}
	
	@BeforeTest
	public void beforeTest () {
		System.out.println("This is Before Test");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is Before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("This is After Suite");
	}
	
}
