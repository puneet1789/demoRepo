package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGGoogleTest {

	WebDriver driver;
	//@BeforeSuite
	//clear cookies of the browser 
	//Delete temp files
	//Set the environment param
	//Load the complte test data 
	
	
	//@BeforeClass
	
	
	@BeforeTest
	public void setPath() {
		 System.setProperty("webdriver.chrome.driver", "G:\\chrome driver\\chromedriver.exe");
	}
	
	
	
	
	@BeforeMethod
	public void setUp () {
	//	driver=new ChromeDriver();
		
	}
	
//		1sthttp://www.yahoo.com
//		2ndsf6d465ds
//		3rdegfueufb58745
	
//		1sthttp://www.yahoo.com
//		2ndegfueufb58745
//		3rdsf6d465ds	
	
	@Test(priority=1, groups="Validation")
	@Parameters({"url"})
	public void Test1 (String dynamicUrl) {
		
		System.out.println("1st" + dynamicUrl);

//		driver.navigate().to(dynamicUrl);
//		driver.manage().window().maximize();
//		
//		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		
//		//validate button
//		boolean b = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).isDisplayed();
//		Assert.assertTrue(b);
		
		System.out.println("This is Test 1");
	}
	
//	@Test(priority=4, groups="Validation")
//	public void Test2 () {
//		System.out.println("This is Test 2");
//		boolean b = driver.findElement(By.linkText("Mail")).isDisplayed();
//		
//	}
//	
//	@Test(priority=3, groups="Action")
//	public void Test3 () {
//		System.out.println("This is Test 3");
//		 driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Hi TestNG");
//		 
//	}
//	
//	@Test(priority=2, groups="Action")
//	public void Test4 () {
//		System.out.println("This is Test 4");
//		 driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Hi New TestNG");
//		 driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
//		 
//	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
