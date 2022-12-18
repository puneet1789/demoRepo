package testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test {
	

	public static void main(String[] args) {

        try (InputStream input = new FileInputStream("src/main/resources/config.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            System.out.println(prop.getProperty("driverPath"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
	}
	
	
}