package syscheck;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import abs.App1Login;
import abs.Car;
import abs.Login;


public class SystemCheck {  
	public static Logger logger = Logger.getLogger(SystemCheck.class.getName());

	public static void main(String[] args) {  
//		App1Login l1 = new App1Login();
//    	l1.initiateLogin();
//    	l1.LoginWithSteps();
//    	Login.LoginWithNextSteps();
//    	//Person p1 = new Person();
//    	Employee e1 = new Employee();
//    	
//    	
//    	e1.printMyName();
//    	
//    	
////
//    	ExtentReports extent = new ExtentReports();
//    	ExtentSparkReporter spark = new ExtentSparkReporter("Janki_1stTest.html");
//    	extent.attachReporter(spark);
//    	PropertyConfigurator.configure("src/main/java/syscheck/log.properties");
//    	
//    	
//    	ExtentTest extTests = extent.createTest("Test Amazon Cart Feature");
//    	
//    	
//    	extTests.log(Status.PASS, "DEMO Pass");
//    	
//    	
//    	
		
		  // System Property for Chrome Driver
		  System.setProperty("webdriver.chrome.driver",
		  "G:\\chrome driver\\chromedriver.exe");
		  
		  // Instantiate a ChromeDriver class. 
		  WebDriver driver=new ChromeDriver();
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  
		  // Launch Website 
		  driver.navigate().to("https://demoqa.com/text-box");
		  //extTests.log(Status.PASS, "Navgated to URL");
		  
		  //Maximize the browser 
		  driver.manage().window().maximize();
		  
//		  String xpath = "//button[text() = 'Click Me']";
//		  WebElement ele = driver.findElement(By.xpath(xpath));
//		  
//		  
//		  js.executeScript("arguments[0].click();", ele);
		  
		  
		  String xpath = "//*[@id='userName']";
		  WebElement ele = driver.findElement(By.xpath(xpath));
		  js.executeScript("arguments[0].setAttribute('value', 'new value for element');", ele);
		  
//		  driver.switchTo().frame(0); driver.switchTo().parentFrame();
//		  driver.switchTo().defaultContent();
		  
		  //driver.switchTo().frame(2); //driver.switchTo().frame(3);
		 
		 // frame = driver.findElement(By.xpath("//*[@id='frame1']"));
//		 String current = driver.getWindowHandle();
//		 driver.findElement(By.xpath("//*[@id='messageWindowButton']")).click();
//		  for (String Handle : driver.getWindowHandles()) {
//			  if (!Handle.equals(current)) {
//				  driver.switchTo().window(Handle);
//			  }			  
//		  }	  
		  
			/*
			 * WebElement ele =
			 * driver.findElement(By.xpath("//*[@id='maincounter-wrap']/div")); for (int i =
			 * 0 ; i < 100; i++) { System.out.println(ele.getText()); }
			 */
		  
        //extTests.log(Status.PASS, "Maximized Window");
        //logger.info("This is log");
        
        //Actions act = new Actions(driver);
        
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        
//        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
        
//        List<WebElement> lEle = driver.findElements(By.xpath("//*[@id='wrapper']/div[5]/div[2]/table/tbody/tr/td[2]"));
        
        
        //Jan 21
        //21 Jan
        //21/01/2022
        // MMM
        // dd

		/*
		 * DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM"); LocalDateTime now
		 * = LocalDateTime.now(); String currMonth = dtf.format(now);
		 * 
		 * dtf = DateTimeFormatter.ofPattern("dd"); now = LocalDateTime.now(); String
		 * date = dtf.format(now); int currDate = Integer.parseInt(date);
		 * 
		 * 
		 * 
		 * int index =0;
		 * 
		 * for(WebElement ele : lEle) { if (ele.getText().contains(currMonth) &&
		 * Integer.parseInt(ele.getText().split(" ")[1]) > currDate) { index =
		 * lEle.indexOf(ele); break; } }
		 * 
		 * for (int i = index; i < lEle.size(); i++) {
		 * System.out.println("Available Holiday : " + lEle.get(i).getText()); }
		 */
        
		/*
		 * 
		 * // ArrayList // [5][6][][8][9][] // [5][6][5][8][9][][][]
		 * 
		 * List<String> myList = new ArrayList<>(); myList.add("name1");
		 * myList.add("name2"); myList.add("name3"); myList.add("name4");
		 * myList.add("name5"); myList.add("name6"); myList.add("name7");
		 * 
		 * System.out.println(myList);
		 * 
		 * myList.add("name8");
		 * 
		 * System.out.println(myList);
		 * 
		 * myList.set(6, "nameReplaced");
		 * 
		 * System.out.println(myList);
		 * 
		 * myList.remove("nameReplaced");
		 * 
		 * System.out.println(myList);
		 * 
		 * 
		 * Map<String,String> myMap = new HashMap<>(); myMap.put("key1", "demo1");
		 * myMap.put("key2", "demo2"); myMap.put("key3", "demo3"); myMap.put("key4",
		 * "demo4"); myMap.put("key5", "demo5");
		 * 
		 * System.out.println(myMap);
		 * 
		 * myMap.put("key7", "demo7"); System.out.println(myMap);
		 * 
		 * Set<String> set = myMap.keySet();
		 * 
		 * System.out.println(set); for(String key: set) {
		 * System.out.println(myMap.get(key)); }
		 * 
		 * //myMap.remove("key7"); myMap.remove("key7","demo7");
		 * System.out.println(myMap); System.out.println(myMap.containsKey("key3"));
		 * System.out.println(myMap.containsValue("demo7"));
		 * 
		 * 
		 * Map<String,String> myMap1 = new HashMap<>(); myMap.put("key11", "demo11");
		 * myMap.put("key21", "demo12"); myMap.put("key31", "demo13");
		 * 
		 * 
		 * myMap.putAll(myMap1); System.out.println(myMap);
		 */

        //        WebElement ele1 = driver.findElement(By.xpath("//*[@id='nav']/li[2]/a"));
////        WebElement ele2 = driver.findElement(By.xpath("//*[@id='nav']/li[2]/ul/li[3]/a"));
////        WebElement ele3 = driver.findElement(By.xpath("//*[@id='nav']/li[2]/ul/li[3]/ul/li[1]/a"));       
////        act.moveToElement(ele1).moveToElement(ele2).moveToElement(ele3).build().perform();
//        
//        
////        WebElement ele4 = driver.findElement(By.xpath("//*[@id='draggable']"));
////        WebElement ele5 = driver.findElement(By.xpath("//*[@id='droppable']"));
////        act.dragAndDrop(ele4, ele5).build().perform();
////        act.clickAndHold(ele4).moveToElement(ele5).release().build().perform();
//        
////        driver.switchTo().frame(0);
////        WebElement ele6 = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
////        act.moveToElement(ele6).dragAndDropBy(ele6, 50, 60).build().perform();
////        act.contextClick(ele6).build().perform();
////        
//        
//  
//        
//        
////        driver.findElement(By.id("userName")).sendKeys("This is First Java class");
////        extTests.log(Status.PASS, "Entered Data");
////        extTests.log(Status.FAIL, "Entered Data");
////        logger.info("This is log failed");
//        extent.flush();   
        
        
        /// 
       // driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        //Explecit wait
       // WebDriverWait wd = new WebDriverWait(10,TimeUnit.SECONDS).
//        
//        WebDriverWait
//        WebDriverWait wd = new WebDriverWait(driver,Duration.ofSeconds(10));
//        wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("gjgadgk")));
//        
//        ExpectedConditions.visibilityOfElementLocated(By.xpath("gjgadgk")

        		
        		/// visibility
        		//Notdisplayed
        		//isClicable
        		//isenabled
//        
//        
//        
//        /// Window Handle - Id Of that window 
//        
//       
//        
//        String currentWindow = driver.getWindowHandle();
//        
//        System.out.println("current Window =>>>>>>" + currentWindow);
//        
//        
//        driver.findElement(By.xpath("//*[@id='windowButton']")).click();
//        
//        
//        Set<String> handles = driver.getWindowHandles();
//        
//
//        
//        for(String handle : handles) {
//        	if (!handle.equals(currentWindow)) {
//        		driver.switchTo().window(handle);
//        	}
//        }
//        
//        System.out.println(driver.findElement(By.xpath("//*[@id='sampleHeading']")).getText());
//        
//        
//    }  
//	
    
				/*
				 * try { int i = 4/0;
				 * 
				 * String a = null; //null value System.out.println(a.charAt(0));
				 * 
				 * 
				 * //System.out.println("output = " + i); } catch (NullPointerException e) {
				 * e.getMessage(); System.out.println("This is NullPointerException Exception");
				 * } catch (ArithmeticException e) { e.getMessage();
				 * System.out.println("This is Arithmetic Exception"); } finally {
				 * System.out.println("you are in finally"); }
				 * 
				 * System.out.println("you are otside the try/catch");
				 * 
				 * 
				 * try { PrintMyName (""); } catch (Exception e) { // TODO Auto-generated catch
				 * block e.printStackTrace(); }
				 */
		

		
	
    
	}	
	
	
	/*
	 * public static void recursiveDemo(int i) { while(i!=0) { //increments the
	 * variable i by 1 i=i+1; //recursive called method recursiveDemo(i);
	 * 
	 * } }
	 */
	
	static void PrintMyName (String str) throws Exception {
		
		if (!str.equals("")) { 
		System.out.println("MyName = " + str);
		} else {
			throw new Exception();
		}
	}
}  