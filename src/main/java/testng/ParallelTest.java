package testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ParallelTest {
	
	Properties prop;
	
	@BeforeSuite
	public void readConfig() {
		try {
			InputStream input = new FileInputStream("src/main/resources/config.properties");
			prop = new Properties();
            prop.load(input);
            
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	  public void Test1() {	
		 System.out.println("The thread ID for Test1 is "+ Thread.currentThread().getId());
		 System.setProperty("webdriver.chrome.driver", prop.getProperty("driverPath"));
		 WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	  }
	 
	 @Test
	 public void Test2()
	 { 
		 System.out.println("The thread ID for Test2 is "+ Thread.currentThread().getId());
		 System.setProperty("webdriver.chrome.driver", prop.getProperty("driverPath"));
		 WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	 }
	 
		/*
		 * @Test public void Test3() { System.out.println("The thread ID for Test1 is "+
		 * Thread.currentThread().getId());
		 * System.setProperty("webdriver.chrome.driver",
		 * "G:\\chrome driver\\chromedriver.exe"); WebDriver driver=new ChromeDriver();
		 * driver.navigate().to("https://opensource-demo.orangehrmlive.com/"); }
		 * 
		 * @Test public void Test4() { System.out.println("The thread ID for Test2 is "+
		 * Thread.currentThread().getId());
		 * System.setProperty("webdriver.chrome.driver",
		 * "G:\\chrome driver\\chromedriver.exe"); WebDriver driver=new ChromeDriver();
		 * driver.navigate().to("https://opensource-demo.orangehrmlive.com/"); }
		 * 
		 * @Test public void Test5() { System.out.println("The thread ID for Test1 is "+
		 * Thread.currentThread().getId());
		 * System.setProperty("webdriver.chrome.driver",
		 * "G:\\chrome driver\\chromedriver.exe"); WebDriver driver=new ChromeDriver();
		 * driver.navigate().to("https://opensource-demo.orangehrmlive.com/"); }
		 * 
		 * @Test public void Test6() { System.out.println("The thread ID for Test2 is "+
		 * Thread.currentThread().getId());
		 * System.setProperty("webdriver.chrome.driver",
		 * "G:\\chrome driver\\chromedriver.exe"); WebDriver driver=new ChromeDriver();
		 * driver.navigate().to("https://opensource-demo.orangehrmlive.com/"); }
		 * 
		 * @Test public void Test7() { System.out.println("The thread ID for Test2 is "+
		 * Thread.currentThread().getId());
		 * System.setProperty("webdriver.chrome.driver",
		 * "G:\\chrome driver\\chromedriver.exe"); WebDriver driver=new ChromeDriver();
		 * driver.navigate().to("https://opensource-demo.orangehrmlive.com/"); }
		 */
}
