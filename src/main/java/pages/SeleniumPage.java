package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.ReusableMethods;

public class SeleniumPage {
	ReusableMethods obj_ReusableMethods=new ReusableMethods();
	 public SeleniumPage(WebDriver wd) {
		 
		 PageFactory.initElements(wd, this);
		 
	 }
	 @FindBy(xpath = "//a[contains(text(),'Selenium Example Page')]") 
	 WebElement link_SeleniumExamplePage;
	 
	 
	 public void click_SeleniumExamplePage() {
		 
		obj_ReusableMethods.element_Click(link_SeleniumExamplePage); 
	 }

}
