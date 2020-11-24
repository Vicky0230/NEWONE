package cOMMONFUCTIONS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Common_FUNCTION123 {
	public static Properties properties=null;
	public static WebDriver driver=null;
	static Logger logger=Logger.getLogger(Common_FUNCTION123.class);
	
	public Properties LoadProperty() throws IOException {
		
		PropertyConfigurator.configure("log4j123.properties");
		logger.info("Property File loading");
		FileInputStream fileInputStream=new FileInputStream("config123.properties");
		properties= new Properties();
		properties.load(fileInputStream);
		return properties;
	}

	@BeforeSuite
	public void launchBrowser() throws IOException {
		LoadProperty();

		String Browser=properties.getProperty("browser");
		String DriverLocation=properties.getProperty("DriverLocation");
		String Url=properties.getProperty("URL");

		if(Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", DriverLocation);
			driver=new ChromeDriver();
		}else if (Browser.equalsIgnoreCase("FireFOX")) {

			System.setProperty("webdriver.gecko.driver", DriverLocation);
			driver=new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


	}
	@AfterSuite
	public void TearDown() {
	driver.quit();
		 
	}

}


