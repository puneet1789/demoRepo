package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderSample {

	WebDriver driver;
	
	
	@BeforeMethod
	public void setPath(){
		 System.setProperty("webdriver.chrome.driver", "G:\\chrome driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/");		
		 driver.manage().window().maximize();
	}
	
	@Test(dataProvider = "MydemoData")
	public void Logins (String usrName, String pwd) {
		
		try {
			Thread.sleep(Duration.ofSeconds(4));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Verify username textbox is Present");
		WebElement username = driver.findElement(By.name("username"));		
		Assert.assertTrue(username.isDisplayed());
		
		
		System.out.println("Verify password textbox is Present");
		WebElement password = driver.findElement(By.xpath("//input[@name ='password']"));		
		Assert.assertTrue(password.isDisplayed());
		
		username.sendKeys(usrName);
		password.sendKeys(pwd);
		
		
		WebElement Login = driver.findElement(By.xpath("//button[text() = ' Login ']"));
		Login.click();		
		
		try {
			Thread.sleep(Duration.ofSeconds(4));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Validate successfully logged in");
		WebElement Lable_TimeAtWork = driver.findElement(By.xpath("//p[text() = 'Time at Work']"));		
		Assert.assertTrue(Lable_TimeAtWork.isDisplayed());
		
	}
	
	@DataProvider(name="MydemoData")
	public Object[][] myTestData() {
		Object[][] data = new Object[2][2];
		
		
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		
		data[1][0] = "test123";
		data[1][1] = "xxxxx";
		
		
		return data;
		
	}
	
	

	
	@DataProvider(name = "myLoginDataExcel")
	public Object[][] getLoginDataExcel () {
		

		/// read excel sheet
		
		
		/// get total rows 
		
		// get total colums
		
		
		/// create a 2d array of data 
		
		// return the data from the provider
		
		
		
		return null;
		////To be implemented 
	}
}
