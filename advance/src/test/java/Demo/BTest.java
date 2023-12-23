package Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BTest {
	@Test
	public void tt() {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://amazon.in/");
	Reporter.log("demosite",true);

}
}
