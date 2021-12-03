package appHooks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;


public class AppHooks{

	private static WebDriver wd;

	private static DriverFactory obj_DriverFactory;
	
	
	
	
	@Before(order = 0)
	
	
	public void invokeBrowser() {

		obj_DriverFactory=new DriverFactory();

		wd=obj_DriverFactory.driverFactory();


	}

	@Before(order = 1 )
	public void enterUrl() {

		obj_DriverFactory.enterUrl(wd);
	}

	@After
	public void closeBrowser() {
		wd.close();
	}

	@After
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
