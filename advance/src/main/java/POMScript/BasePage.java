package POMScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Generic.Utility;

public class BasePage extends Utility {
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
}
