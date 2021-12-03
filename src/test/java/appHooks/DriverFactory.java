package appHooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import util.PropertyReader;
import util.PropertyWriter;


public class DriverFactory {

	private  static WebDriver wd;
	private static Properties value;
	
	private static PropertyReader obj_PropertyReader;


	public WebDriver driverFactory() {
		
	
		
		obj_PropertyReader=new PropertyReader();
		value=obj_PropertyReader.propertyReader();
		
		

		if (value.getProperty("browser").equalsIgnoreCase("chrome"))


		{
			WebDriverManager.chromedriver().setup();
			wd=new ChromeDriver();
		}
		else if(value.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			wd=new FirefoxDriver();
		}else
			System.out.println("select valid browser");


		return wd;
	}
	
	public WebDriver enterUrl(WebDriver wd) {
		wd.get(value.getProperty("url"));
		return wd;
	}


	public WebDriver getDriver() {

		return wd;
	}



}
