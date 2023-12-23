package Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ATest {
@Test
public void tt() {
ChromeDriver driver=new ChromeDriver();
driver.get("https://demowebshop.tricentis.com/");
Reporter.log("demosite",true);

}
}
