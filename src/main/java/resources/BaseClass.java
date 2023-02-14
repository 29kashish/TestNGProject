package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	public WebDriver driver;
	public Properties prop;
	
	public void driverInitilize() throws IOException
	{
	       //  This will read the properties file	
		FileInputStream fis = new FileInputStream("C:\\Users\\Kashish\\eclipse-workspace\\SeleniumTestNgProject\\src\\main\\java\\resources\\data.properties");
		
		    // Access the properties file
		prop = new Properties();
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			// firefox code
		}
		
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			// edge code
		}
		
		else
		{
			System.out.println("Please make sure you have correct browser");
		}
		
	}
	
	@BeforeMethod
	public void openurl() throws IOException
	{
		driverInitilize();
		    // This driver have scope
		
		String urlName = prop.getProperty("url");
		driver.get(urlName);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}
