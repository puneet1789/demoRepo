package cucumber;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class StepDefs {
	
	WebDriver driver = Context.getWebDriver();
	public Logger logger = Logger.getLogger(StepDefs.class.getName());
	
	
	@Given("I launch URL {string}")
	public void i_launch_url(String url) {
		logger.info("test");
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
	}

	@Then("I click on {string} button")
	public void i_click_on_button(String lableButton) {
	    String xpath = getXpathFroFile(lableButton);
	    driver.findElement(By.xpath(xpath)).click();
	}

	@Then("I do something with {int}")
	public void i_do_something_with(Integer int1) {
		logger.info("test");
	    System.out.println(int1 + 1);
	    logger.debug("debug test");
	}




	@Then("I validate Below Data")
	public void i_validate_below_data(io.cucumber.datatable.DataTable dt) {
	
	   List<List<String>> myData = dt.asLists();
	  System.out.println( myData.get(0).get(0));
	  System.out.println(  myData.get(0).get(1));
	  System.out.println(  myData.get(1).get(0));
	  System.out.println(  myData.get(1).get(1));
	  System.out.println(  myData.get(2).get(0));
	  System.out.println(  myData.get(2).get(1));
	   
	   
	   
	}



	
	public String getXpathFroFile(String Key) {
	    try (InputStream input = new FileInputStream("src/main/resources/config.properties")) {
	
	        Properties prop = new Properties();
	        prop.load(input);
	        return prop.getProperty(Key);
	
	    } catch (IOException ex) {
	    	return null;
	    }
		
	}
}