package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.SeleniumPage;
import util.ReusableMethods;

public class HomePage {
	private static WebDriver wd;
	
	@Given("user is in {string} page")
	public void user_is_in_page(String pageTitle) {
		
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.get("https://crossbrowsertesting.github.io/");
		
	}

	@When("user clicks on Selenium Example Page")
	public void user_clicks_on_selenium_example_page() {
		SeleniumPage obj_SeleniumPage=new SeleniumPage(wd);
		obj_SeleniumPage.click_SeleniumExamplePage();
		
	}

	@Then("system should open {string}")
	public void system_should_open(String expPageTitle) {
		ReusableMethods obj_ReusableMethods=new ReusableMethods();
	String actualPageTitle=obj_ReusableMethods.getPageTitle(wd);
	
	Assert.assertEquals(actualPageTitle, expPageTitle);
		
	}
	

}
