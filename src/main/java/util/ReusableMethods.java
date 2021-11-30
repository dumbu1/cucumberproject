package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReusableMethods {
	public void element_Click(WebElement element) {
		
		element.click();
	}
	public String getPageTitle(WebDriver wed) {
		
	return	wed.getTitle();
		
		
	}

}
