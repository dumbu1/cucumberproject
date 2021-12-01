package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public static WebDriver wd;
	
	public WebDriver driverFactory() {
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		
		return wd;
	}
	
	public static WebDriver getDriver() {
		
		
		return wd;
	}

}
