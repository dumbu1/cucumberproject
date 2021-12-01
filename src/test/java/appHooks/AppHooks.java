package appHooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import util.DriverFactory;

public class AppHooks {
	
	private static WebDriver wd;
	
	@Before(order=0)
	public void invokeBrowser() {
		DriverFactory obj_DriverFactory=new DriverFactory();
		wd=obj_DriverFactory.driverFactory();
		
	}
	
	@Before(order=1)
	public void enterUrl() {
		
		wd.get("https://crossbrowsertesting.github.io/");
	}
	
	@After(order = 2)
	public void closeBrowser() {
		wd.close();
		
	}
	
	@After(order = 0)
	public void failScreeshot(Scenario sc) {
		
		if(sc.isFailed()) {
			//take screenshot
			String screenshotName=sc.getName().replaceAll(" ", "_");
			
		byte[] sourcePath =((TakesScreenshot)wd).getScreenshotAs(OutputType.BYTES);
		
		//attaching screenshot
		
		sc.attach(sourcePath, "image/png", screenshotName);
		}
		
	}

}
