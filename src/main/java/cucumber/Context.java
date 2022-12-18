package cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Context {
	
	public static WebDriver driver;
	
	public static WebDriver getWebDriver() {
		System.setProperty("webdriver.chrome.driver", "G:\\chrome driver\\chromedriver.exe");
		if (driver == null) {
			driver=new ChromeDriver();
		}
		return driver;
	}
	
	
	
}
