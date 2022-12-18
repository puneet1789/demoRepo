package syscheck;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {

	public static void main(String[] args) throws InterruptedException {
        // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "G:\\chrome driver\\chromedriver.exe");  
          
        // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
        // Launch Website  
        driver.navigate().to("https://demoqa.com/droppable");  

        
        //Maximize the browser  
        driver.manage().window().maximize();  

        
//        WebElement ele8 = driver.findElement(By.xpath("//*[@id='gender-radio-1']"));
//        System.out.println(ele8.isSelected());
        
        //MouseOver 
        Actions act = new Actions(driver);
        
//        WebElement ele1 = driver.findElement(By.xpath("//*[@id='nav']/li[2]/a"));
//        WebElement ele2 = driver.findElement(By.xpath("//*[@id='nav']/li[2]/ul/li[3]/a"));
//        WebElement ele3 = driver.findElement(By.xpath("//*[@id='nav']/li[2]/ul/li[3]/ul/li[1]/a"));

       
        WebElement ele4 = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement ele5 = driver.findElement(By.xpath("//*[@id='droppable']"));
        
        //act.dragAndDrop(ele4, ele5).build().perform();
        
        //act.moveToElement(ele4).clickAndHold(ele4).moveToElement(ele5).release().build().perform();
        Thread.sleep(5000);
        act.moveToElement(ele4).clickAndHold(ele4).build().perform();
        act.moveByOffset(50, 60).build().perform();
        act.release().build().perform();
//        act.moveToElement(ele1).build().perform();
//
//        act.moveToElement(ele2).build().perform();
//        act.moveToElement(ele3).build().perform();
        
//        act.moveToElement(ele1).click().moveToElement(ele2).click().moveToElement(ele3).build().perform();
        
	}

}
