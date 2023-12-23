package POMScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic.BaseTest;

public class RegisterPage extends BasePage {
	
	
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
		
		

		@FindBy(linkText="Register")
		private WebElement registerlink;
		@FindBy(id="gender-female")
		private WebElement female;
		@FindBy(id="FirstName")
		private WebElement firstname;
	@FindBy(id="LastName")
	private WebElement lastname;
	@FindBy(id="Email")
	private WebElement email;
	@FindBy(id="Password")
	private WebElement password;
	@FindBy(id="ConfirmPassword")
	private WebElement confirmpwd;
	@FindBy(id="register-button")
	private WebElement register;

	public WebElement getRegisterlink() {
		return registerlink;
	} 
	public WebElement getfemale()
	{
		return female;
	}
	public WebElement getfirstname()
	{
		return firstname;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getConfirmpwd() {
		return confirmpwd;
	}
	public WebElement getRegister() {
		return register;
	}
	public WebElement getlastname()
	{
		return lastname;
		
	}
	
	

		
	
}
