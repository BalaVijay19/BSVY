package Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel implements FrameworkConstants {
public static final File f=new File(Excel_Path);
public static Object[][]getMultipleData(String Sheetname) throws EncryptedDocumentException, IOException{
FileInputStream fis=new FileInputStream(f);
Workbook w=WorkbookFactory.create(fis);
 org.apache.poi.ss.usermodel.Sheet sh = w.getSheet("Sheetname");
int row_size=sh.getPhysicalNumberOfRows();
int col_size=sh.getRow(0).getPhysicalNumberOfCells();
Object[][] data=new Object[row_size][col_size];

for(int i=0;i<row_size;i++)
{
	
	for(int j=0;j<col_size;j++)
	{
		data[i][j] = sh.getRow(i).getCell(j).toString();
	}
}
return data;

}
}