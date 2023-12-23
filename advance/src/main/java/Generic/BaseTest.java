package Generic;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest extends Utility{

	@BeforeSuite
	public void beforesuite() {
		Reporter.log("DBase connected successfully");
	}
	@BeforeTest
	public void beforetest() {
		Reporter.log("Conn to DBase");
	}
@BeforeClass
public void beforeclass() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Reporter.log("Browser connected ");
	
}
@AfterClass
public void afterclass() {
	driver.quit();
	Reporter.log("Browser closed");
}
@AfterTest
public void aftertest() {
	Reporter.log("Closed Database");
}
@AfterSuite
public void aftersuite() {
	Reporter.log("DBase closed successfully");
}
}
