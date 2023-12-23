package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.ReadExcel;
import POMScript.RegisterPage;

public class RegTest extends BaseTest {
@Test(dataProvider = "data")
public void testcase(String FN,String LN,String email,String password) {
RegisterPage r=new RegisterPage(driver);	
}
@DataProvider(name="data")
public static Object[][]getMultipleData() throws EncryptedDocumentException, IOException{
	return ReadExcel.getMultipleData("sheet1");
}
}
