
package EMS.EMS;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginEMS {
	static WebDriver driver;

	@Test
		public static void preRequirement() throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\EMS\\AllData.properties");
		prop.load(fis);
		driver.get(prop.getProperty("Project_URL"));
		

	}

}
